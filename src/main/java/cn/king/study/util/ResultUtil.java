package cn.king.study.util;

import cn.king.study.common.Result;
import cn.king.study.common.ResultEnum;

/**
 * @Description:
 * @Auther: zsq
 * @Date: 2021/1/26 16:25
 */
public class ResultUtil {

    public static Result success(Object object) {
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success() {
        return success(null);
    }

    public static Result error(Integer code, String msg) {
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }

    public static Result error(ResultEnum unkonwError) {
        Result result = new Result();
        result.setCode(unkonwError.getCode());
        result.setMsg(unkonwError.getMsg());
        return result;
    }
}

