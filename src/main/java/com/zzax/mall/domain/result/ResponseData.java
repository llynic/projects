package com.zzax.mall.domain.result;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2018-01-09 9:38 星期二
 */
public class ResponseData extends Response{

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public ResponseData(String code, String message, Object data) {
        super(code, message);
        this.data = data;
    }

    public ResponseData(String code, String message) {
        super(code, message);
    }
}
