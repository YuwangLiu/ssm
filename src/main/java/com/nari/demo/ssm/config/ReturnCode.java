package com.nari.demo.ssm.config;

import com.fengwenyi.javalib.result.IReturnCode;

/**
 * @author liuyuwang
 */

public enum ReturnCode implements IReturnCode {

    /**
     * 错误码
     */
    ERROR(100, "Error"),

    /**
     * 成功码
     */
    SUCCESS(0, "Success")

    ;

    private Integer code;
    private String msg;

    ReturnCode(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
