package cn.king.study.handler;

import cn.king.study.common.Result;
import cn.king.study.common.ResultEnum;
import cn.king.study.exception.DefinedException;
import cn.king.study.util.ResultUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description:
 * @Auther: zsq
 * @Date: 2021/1/26 17:26
 */
@ControllerAdvice
@Slf4j
public class CommonExceptionHandler {

    /**
     *  拦截Exception类的异常
     * @param e
     * @return
     */
    @ExceptionHandler(Exception.class)
    @ResponseBody
    public Result exceptionHandler(Exception e){
        if (e instanceof DefinedException) {   //判断异常是否是我们定义的异常
            DefinedException definedException = (DefinedException) e;
            return ResultUtil.error(definedException.getCode(), definedException.getMessage());
        }else {
            log.error("【系统异常】{}", e);
            return ResultUtil.error(ResultEnum.UNKONW_ERROR);
        }
    }

//    /**
//     *  拦截自定义异常
//     * @param e
//     * @return
//     */
//    @ExceptionHandler(DefinedException.class)
//    @ResponseBody
//    public Result exceptionHandler(DefinedException e){
//        throw new DefinedException(ResultEnum.PRIMARY_SCHOOL);
//    }
}
