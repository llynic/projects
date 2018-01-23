package com.zzax.mall.entity;

import com.zzax.mall.enums.Result;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 14:59 星期五
 */
public class JsonResult {

    private boolean success;
    private Integer errCode;
    private String message;
    private Object data;

    public static JsonResult parse(Result result){
        return new JsonResult(result.isSuccess(),result.getErrCode(),result.getMessage());
    }

    public JsonResult() {}

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Integer getErrCode() {
        return errCode;
    }

    public void setErrCode(Integer errCode) {
        this.errCode = errCode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public JsonResult(boolean success, Integer errCode, String message,Object data) {
        this.success = success;
        this.errCode = errCode;
        this.message = message;
        this.data = data;
    }

    public JsonResult(boolean success, Integer errCode, String message) {
        this.success = success;
        this.errCode = errCode;
        this.message = message;
    }



}
