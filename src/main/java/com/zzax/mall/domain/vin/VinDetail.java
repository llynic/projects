package com.zzax.mall.domain.vin;

/**
 * Created by yc on 2017/11/22.
 */
public class VinDetail {
    private String status;
    private String msg;
    private Result result;

    public VinDetail() {}

    public VinDetail(String status, String msg) {
        this.status = status;
        this.msg = msg;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    public String getMsg() {
        return msg;
    }

    public void setResult(Result result) {
        this.result = result;
    }
    public Result getResult() {
        return result;
    }

    @Override
    public String toString() {
        return "VinDetail{" +
                "status='" + status + '\'' +
                ", msg='" + msg + '\'' +
                ", result=" + result +
                '}';
    }
}
