package com.nari.demo.common;

/**
 * @author liuyuwang
 */

public enum ReturnCode {

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

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
