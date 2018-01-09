package com.zzax.mall.domain.result;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-09 9:32 星期二
 */
public class Response {

    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    public Response(String code, String message) {
        this.code = code;
        this.message = message;
    }
}
