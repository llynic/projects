package com.zzax.mall.enums;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-22 15:32 星期五
 */
public enum Result {
    LOGIN_FAILURE(false,1000,"用户名或者密码错误,请确认后重新输入"),
    LOGIN_SUCCESS(true,0000,"登陆成功");

    private boolean success = false;
    private Integer errCode = 0;
    private String message = "失败";

    Result(Integer errCode, String message) {
        this.errCode = errCode;
        this.message = message;
    }

    Result(boolean success, Integer errCode, String message) {
        this.success = success;
        this.errCode = errCode;
        this.message = message;
    }

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

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", errCode=" + errCode +
                ", message='" + message + '\'' +
                '}';
    }
}
