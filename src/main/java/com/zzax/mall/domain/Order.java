package com.zzax.mall.domain;

import java.util.Date;

public class Order {
    private Integer id;

    private Integer userId;

    private Integer buyerId;

    private String code;

    private Date payDate;

    private Date createDate;

    private String totalPrice;

    private String fare;

    private String status;

    private String message;

    public Order(Integer id, Integer userId, Integer buyerId, String code, Date payDate, Date createDate, String totalPrice, String fare, String status, String message) {
        this.id = id;
        this.userId = userId;
        this.buyerId = buyerId;
        this.code = code;
        this.payDate = payDate;
        this.createDate = createDate;
        this.totalPrice = totalPrice;
        this.fare = fare;
        this.status = status;
        this.message = message;
    }

    public Order() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public Date getPayDate() {
        return payDate;
    }

    public void setPayDate(Date payDate) {
        this.payDate = payDate;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice == null ? null : totalPrice.trim();
    }

    public String getFare() {
        return fare;
    }

    public void setFare(String fare) {
        this.fare = fare == null ? null : fare.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }
}