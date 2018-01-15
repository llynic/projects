package com.zzax.mall.domain;

public class ShopAttribute {
    private Integer id;

    private Integer shopId;

    private String name;

    private String code;

    private String value;

    public ShopAttribute(Integer id, Integer shopId, String name, String code, String value) {
        this.id = id;
        this.shopId = shopId;
        this.name = name;
        this.code = code;
        this.value = value;
    }

    public ShopAttribute() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}