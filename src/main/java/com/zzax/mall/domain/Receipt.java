package com.zzax.mall.domain;

public class Receipt {
    private Integer id;

    private String code;

    private String price;

    private String status;

    private String brand;

    private String depotAddress;

    private String valid;

    public Receipt(Integer id, String code, String price, String status, String brand, String depotAddress, String valid) {
        this.id = id;
        this.code = code;
        this.price = price;
        this.status = status;
        this.brand = brand;
        this.depotAddress = depotAddress;
        this.valid = valid;
    }

    public Receipt() {
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

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public String getDepotAddress() {
        return depotAddress;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress == null ? null : depotAddress.trim();
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid == null ? null : valid.trim();
    }
}