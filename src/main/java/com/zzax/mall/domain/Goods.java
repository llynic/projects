package com.zzax.mall.domain;

import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {
    private String id;

    private String receiptId;

    private String name;

    private String kind;

    private String kindCode;

    private String code;

    private String pack;

    private String brand;

    private String model;

    private String mark;

    private String weight;

    private String standards;

    private String quantity;

    private String unit;

    private String price;

    private String producer;

    private String producerArea;

    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date producerDate;

    private String vinCode;

    public Goods(String id, String receiptId, String name, String kind, String kindCode, String code, String pack, String brand, String model, String mark, String weight, String standards, String quantity, String unit, String price, String producer, String producerArea, Date producerDate,String  vinCode) {
        this.id = id;
        this.receiptId = receiptId;
        this.name = name;
        this.kind = kind;
        this.kindCode = kindCode;
        this.code = code;
        this.pack = pack;
        this.brand = brand;
        this.model = model;
        this.mark = mark;
        this.weight = weight;
        this.standards = standards;
        this.quantity = quantity;
        this.unit = unit;
        this.price = price;
        this.producer = producer;
        this.producerArea = producerArea;
        this.producerDate = producerDate;
        this.vinCode = vinCode;
    }

    public Goods() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId == null ? null : receiptId.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind == null ? null : kind.trim();
    }

    public String getKindCode() {
        return kindCode;
    }

    public void setKindCode(String kindCode) {
        this.kindCode = kindCode == null ? null : kindCode.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model == null ? null : model.trim();
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark == null ? null : mark.trim();
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight == null ? null : weight.trim();
    }

    public String getStandards() {
        return standards;
    }

    public void setStandards(String standards) {
        this.standards = standards == null ? null : standards.trim();
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity == null ? null : quantity.trim();
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price == null ? null : price.trim();
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer == null ? null : producer.trim();
    }

    public String getProducerArea() {
        return producerArea;
    }

    public void setProducerArea(String producerArea) {
        this.producerArea = producerArea == null ? null : producerArea.trim();
    }

    public Date getProducerDate() {
        return producerDate;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd")
    public void setProducerDate(Date producerDate) {
        this.producerDate = producerDate;
    }

    public String getVinCode() {
        return vinCode;
    }

    public void setVinCode(String vinCode) {
        this.vinCode = vinCode;
    }

    @Override
    public String toString() {
        return "Goods{" +
                "id='" + id + '\'' +
                ", receiptId='" + receiptId + '\'' +
                ", name='" + name + '\'' +
                ", kind='" + kind + '\'' +
                ", kindCode='" + kindCode + '\'' +
                ", code='" + code + '\'' +
                ", pack='" + pack + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mark='" + mark + '\'' +
                ", weight='" + weight + '\'' +
                ", standards='" + standards + '\'' +
                ", quantity='" + quantity + '\'' +
                ", unit='" + unit + '\'' +
                ", price='" + price + '\'' +
                ", producer='" + producer + '\'' +
                ", producerArea='" + producerArea + '\'' +
                ", producerDate=" + producerDate +
                ", vinCode=" + vinCode +
                '}';
    }
}