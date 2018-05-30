package com.qianpz.gateway.common.enums;

/**
 * @author qianpengzhan
 * @DESC  异常枚举类
 * @create 2018-05-30 19:55
 * @email qianpz@jcgroup.com.cn
 **/
public class ErrorEnum {

    ;

    private Integer errorCode;

    private String errorMsg;

    ErrorEnum(Integer errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
}
