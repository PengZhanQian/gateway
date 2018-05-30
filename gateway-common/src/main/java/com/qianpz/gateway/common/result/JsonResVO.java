package com.qianpz.gateway.common.result;

import com.qianpz.gateway.common.enums.ErrorEnum;
import com.qianpz.gateway.common.enums.ResultCodeEnum;

import java.io.Serializable;

/**
 * @author qianpengzhan
 * @DESC Api 接口统一返回JSONVO
 * @create 2018-05-30 19:12
 * @email qianpz@jcgroup.com.cn
 **/
public class JsonResVO implements Serializable{

    /**
     * 接口统一返回码
     */
    private Integer returnCode;
    /**
     * 接口统一返回码对应信息
     */
    private String returnMsg;
    /**
     * 接口返回对象
     */
    private Object data;

    private JsonResVO() {
    }

    /**
     * 全参数的构造函数
     * @param returnCode
     * @param returnMsg
     * @param data
     */
    public static JsonResVO init(Integer returnCode, String returnMsg, Object data) {
        JsonResVO jsonResVO = new JsonResVO();
        jsonResVO.setReturnCode(returnCode);
        jsonResVO.setReturnMsg(returnMsg);
        jsonResVO.setData(data);
        return jsonResVO;
    }

    //成功返回方法
    public static JsonResVO buildSuccess(){
        return init(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getCodeExplain(),null);
    }

    public static JsonResVO buildSuccess(Object data){
        return init(ResultCodeEnum.SUCCESS.getCode(),ResultCodeEnum.SUCCESS.getCodeExplain(),data);
    }

    //失败返回方法
    public static JsonResVO buildErrorResult(Integer returnCode, String returnMsg) {
        return buildErrorResult(returnCode, returnMsg, null);
    }

    public static JsonResVO buildErrorResult(Integer returnCode, String returnMsg, Object data) {
        return init(returnCode, returnMsg, data);
    }

    public static JsonResVO buildErrorEnum(ErrorEnum errorEnum){
        return init(errorEnum.getErrorCode(),errorEnum.getErrorMsg(),null);
    }


    public Integer getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(Integer returnCode) {
        this.returnCode = returnCode;
    }

    public String getReturnMsg() {
        return returnMsg;
    }

    public void setReturnMsg(String returnMsg) {
        this.returnMsg = returnMsg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
