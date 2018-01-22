package com.zzax.mall.domain;

import java.util.Date;

public class Shop {
    private Integer id;

    private String receiptId;

    private Integer userId;

    private String title;

    private String code;

    private String image;

    private String status;

    private String price;

    private String quantity;

    private String des;

    private Date createDate;

    private Date updateDate;

    private String creator;

    private String editor;

    public Shop(Integer id, String receiptId, Integer userId, String title, String code, String image, String status, String price, String quantity, String des, Date createDate, Date updateDate, String creator, String editor) {
        this.id = id;
        this.receiptId = receiptId;
        this.userId = userId;
        this.title = title;
        this.code = code;
        this.image = image;
        this.status = status;
        this.price = price;
        this.quantity = quantity;
        this.des = des;
        this.createDate = createDate;
        this.updateDate = updateDate;
        this.creator = creator;
        this.editor = editor;
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

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId == null ? null : receiptId.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des == null ? null : des.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    public String getEditor() {
        return editor;
    }

    public void setEditor(String editor) {
        this.editor = editor == null ? null : editor.trim();
    }

    @Override
    public String toString() {
        return "Shop{" +
                "id=" + id +
                ", receiptId='" + receiptId + '\'' +
                ", userId=" + userId +
                ", title='" + title + '\'' +
                ", code='" + code + '\'' +
                ", image='" + image + '\'' +
                ", status='" + status + '\'' +
                ", price='" + price + '\'' +
                ", quantity='" + quantity + '\'' +
                ", des='" + des + '\'' +
                ", createDate=" + createDate +
                ", updateDate=" + updateDate +
                ", creator='" + creator + '\'' +
                ", editor='" + editor + '\'' +
                '}';
    }
}