package com.zzax.mall.domain;

public class OrderDetail {
    private Integer id;

    private String code;

    private String createTime;

    private String payTime;

    private String buyerAddress;

    private String buyer;

    private String buyerTel;

    private String postcode;

    private String message;

    private String nickname;

    private String realname;

    private String sellerTel;

    private String price;

    private String status;

    public OrderDetail(Integer id, String code, String createTime, String payTime, String buyerAddress, String buyer, String buyerTel, String postcode, String message, String nickname, String realname, String sellerTel, String price, String status) {
        this.id = id;
        this.code = code;
        this.createTime = createTime;
        this.payTime = payTime;
        this.buyerAddress = buyerAddress;
        this.buyer = buyer;
        this.buyerTel = buyerTel;
        this.postcode = postcode;
        this.message = message;
        this.nickname = nickname;
        this.realname = realname;
        this.sellerTel = sellerTel;
        this.price = price;
        this.status = status;
    }

    public OrderDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime == null ? null : createTime.trim();
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime == null ? null : payTime.trim();
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress == null ? null : buyerAddress.trim();
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer == null ? null : buyer.trim();
    }

    public String getBuyerTel() {
        return buyerTel;
    }

    public void setBuyerTel(String buyerTel) {
        this.buyerTel = buyerTel == null ? null : buyerTel.trim();
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode == null ? null : postcode.trim();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message == null ? null : message.trim();
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname == null ? null : realname.trim();
    }

    public String getSellerTel() {
        return sellerTel;
    }

    public void setSellerTel(String sellerTel) {
        this.sellerTel = sellerTel == null ? null : sellerTel.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}