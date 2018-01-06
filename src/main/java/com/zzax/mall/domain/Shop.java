package com.zzax.mall.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import java.io.Serializable;

/**
 * @Description 商品详情对象
 * @Created By : wzj
 * @DATE 2018年1月6日10:34:18
 */
public class Shop implements Serializable{
    /* id */
    private Integer id;

    /* 创建时间 */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String createTime;

    /* 商品编码 */
    private String code;

    /* 商品标题 */
    private String name;

    /* 商品单价 */
    @Min(value = 0,message = "商品单价不能小于0")
    private String unitPrice;

    /* 商品数量 */
    @Min(value = 0,message = "商品数量不能小于0")
    private String quantity;

    /* 商品总价 */
    @Min(value = 0,message = "商品总价不能小于0")
    private String totalPrice;

    /* 商品图片 */
    private String image;

    /* 商品状态 */
    private String status;

    public Shop(Integer id, String createTime, String code, String name, String unitPrice, String quantity, String totalPrice, String image, String status) {
        this.id = id;
        this.createTime = createTime;
        this.code = code;
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
        this.image = image;
        this.status = status;
    }

    public Shop() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice == null ? null : unitPrice.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", createTime='" + createTime + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", unitPrice='" + unitPrice + '\'' +
                ", quantity='" + quantity + '\'' +
                ", totalPrice='" + totalPrice + '\'' +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}