package com.zzax.mall.domain;

import java.io.Serializable;

/**
 * @Description
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 10:47 星期二
 */
public class BaseDomain implements Serializable{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
