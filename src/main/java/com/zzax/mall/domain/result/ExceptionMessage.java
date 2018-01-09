package com.zzax.mall.domain.result;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-09 9:34 星期二
 */
public enum ExceptionMessage {
    SUCCESS("000000","操作成功"),
    FAILURE("999999","操作失败"),
    LoginUsernameOrPasswordError("000001","用户名或者密码错误")
    ;

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    ExceptionMessage(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
