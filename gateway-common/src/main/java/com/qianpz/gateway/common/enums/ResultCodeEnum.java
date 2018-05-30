package com.qianpz.gateway.common.enums;

/**
 * @author qianpengzhan
 * @DESC  JSON返回结果枚举类
 * @create 2018-05-30 19:43
 * @email qianpz@jcgroup.com.cn
 **/
public enum ResultCodeEnum {

    SUCCESS(0,"接口请求成功"),

    ;

    private Integer code;

    private String codeExplain;

    ResultCodeEnum(Integer code, String codeExplain) {
        this.code = code;
        this.codeExplain = codeExplain;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getCodeExplain() {
        return codeExplain;
    }

    public void setCodeExplain(String codeExplain) {
        this.codeExplain = codeExplain;
    }
}
