package cn.king.study.exception;

import cn.king.study.common.ResultEnum;

/**
 * @Description:
 * @Auther: zsq
 * @Date: 2021/1/26 17:39
 */
public class DefinedException extends  RuntimeException{

    private Integer code;

    public DefinedException(ResultEnum resultEnum) {
        super(resultEnum.getMsg());
        this.code = resultEnum.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

}
