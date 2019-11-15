package com.nari.demo.common;

/**
 * @author liuyuwang
 * @date 19/11/15/015 16:25:27
 */
public class Result {

    private Integer code;
    private String msg;
    private Object data;

    private void common(ReturnCode returnCode) {
        this.code = returnCode.getCode();
        this.msg = returnCode.getMsg();
    }

    public void setResult(ReturnCode returnCode) {
        common(returnCode);
    }

    public void setData(ReturnCode returnCode, Object data) {
        common(returnCode);
        this.data = data;
    }

}
