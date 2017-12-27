package com.zzax.mall.domain;

/**
 * @Description 商品详情类
 * @Created By : wangzhenjia
 * @DATE 2017-12-26 16:30 星期二
 */
public class Shopinfo {
    private String id;

    private String ucode;

    private String name;

    private Long price;

    private String des;

    private Integer number;

    public Shopinfo(String id, String ucode, String name, Long price, String des, Integer number) {
        this.id = id;
        this.ucode = ucode;
        this.name = name;
        this.price = price;
        this.des = des;
        this.number = number;
    }

    public Shopinfo() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode == null ? null : ucode.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}