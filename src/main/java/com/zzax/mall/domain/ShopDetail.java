package com.zzax.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;
/**
 * @Description 商品详情对象
 * @Created By : wzj
 * @DATE 2018年1月6日10:34:18
 */
public class ShopDetail implements Serializable{

    private Integer id;
    /* 商品标题 */
    private String name;
    /* 商品编码 */
    private String code;
    /* 商品状态 */
    private String status;

    private String brand;

    private Integer count;

    private BigDecimal price;

    private String manufacturer;

    private String depotAddress;

    private String grants;

    private String warranty;

    private String yearType;

    private String environmentalStandards;

    private String engine;

    private String gearbox;

    private String driverMode;

    private String carBody;

    private Double frontTireSize;

    private String rearTireSize;

    private String vin;

    public ShopDetail(Integer id, String name, String code, String status, String brand, Integer count, BigDecimal price, String manufacturer, String depotAddress, String grants, String warranty, String yearType, String environmentalStandards, String engine, String gearbox, String driverMode, String carBody, Double frontTireSize, String rearTireSize, String vin) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.status = status;
        this.brand = brand;
        this.count = count;
        this.price = price;
        this.manufacturer = manufacturer;
        this.depotAddress = depotAddress;
        this.grants = grants;
        this.warranty = warranty;
        this.yearType = yearType;
        this.environmentalStandards = environmentalStandards;
        this.engine = engine;
        this.gearbox = gearbox;
        this.driverMode = driverMode;
        this.carBody = carBody;
        this.frontTireSize = frontTireSize;
        this.rearTireSize = rearTireSize;
        this.vin = vin;
    }

    public ShopDetail() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer == null ? null : manufacturer.trim();
    }

    public String getDepotAddress() {
        return depotAddress;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress == null ? null : depotAddress.trim();
    }

    public String getGrants() {
        return grants;
    }

    public void setGrants(String grants) {
        this.grants = grants == null ? null : grants.trim();
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty == null ? null : warranty.trim();
    }

    public String getYearType() {
        return yearType;
    }

    public void setYearType(String yearType) {
        this.yearType = yearType == null ? null : yearType.trim();
    }

    public String getEnvironmentalStandards() {
        return environmentalStandards;
    }

    public void setEnvironmentalStandards(String environmentalStandards) {
        this.environmentalStandards = environmentalStandards == null ? null : environmentalStandards.trim();
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine == null ? null : engine.trim();
    }

    public String getGearbox() {
        return gearbox;
    }

    public void setGearbox(String gearbox) {
        this.gearbox = gearbox == null ? null : gearbox.trim();
    }

    public String getDriverMode() {
        return driverMode;
    }

    public void setDriverMode(String driverMode) {
        this.driverMode = driverMode == null ? null : driverMode.trim();
    }

    public String getCarBody() {
        return carBody;
    }

    public void setCarBody(String carBody) {
        this.carBody = carBody == null ? null : carBody.trim();
    }

    public Double getFrontTireSize() {
        return frontTireSize;
    }

    public void setFrontTireSize(Double frontTireSize) {
        this.frontTireSize = frontTireSize;
    }

    public String getRearTireSize() {
        return rearTireSize;
    }

    public void setRearTireSize(String rearTireSize) {
        this.rearTireSize = rearTireSize == null ? null : rearTireSize.trim();
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin == null ? null : vin.trim();
    }
}