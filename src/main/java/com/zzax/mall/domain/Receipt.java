package com.zzax.mall.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Receipt implements Serializable{
    private String id;

    private String userId;

    private String code;

    private BigDecimal price;

    private String status;

    private String depotAddress;

    private String positionName;

    private String positionCode;

    private String insuranceNam;

    private String insuranceNo;

    public Receipt(String id, String userId, String code, BigDecimal price, String status, String depotAddress, String positionName, String positionCode, String insuranceNam, String insuranceNo) {
        this.id = id;
        this.userId = userId;
        this.code = code;
        this.price = price;
        this.status = status;
        this.depotAddress = depotAddress;
        this.positionName = positionName;
        this.positionCode = positionCode;
        this.insuranceNam = insuranceNam;
        this.insuranceNo = insuranceNo;
    }

    public Receipt() {
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public String getDepotAddress() {
        return depotAddress;
    }

    public void setDepotAddress(String depotAddress) {
        this.depotAddress = depotAddress == null ? null : depotAddress.trim();
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName == null ? null : positionName.trim();
    }

    public String getPositionCode() {
        return positionCode;
    }

    public void setPositionCode(String positionCode) {
        this.positionCode = positionCode == null ? null : positionCode.trim();
    }

    public String getInsuranceNam() {
        return insuranceNam;
    }

    public void setInsuranceNam(String insuranceNam) {
        this.insuranceNam = insuranceNam == null ? null : insuranceNam.trim();
    }

    public String getInsuranceNo() {
        return insuranceNo;
    }

    public void setInsuranceNo(String insuranceNo) {
        this.insuranceNo = insuranceNo == null ? null : insuranceNo.trim();
    }

    @Override
    public String toString() {
        return "Receipt{" +
                "id='" + id + '\'' +
                ", userId='" + userId + '\'' +
                ", code='" + code + '\'' +
                ", price=" + price +
                ", status='" + status + '\'' +
                ", depotAddress='" + depotAddress + '\'' +
                ", positionName='" + positionName + '\'' +
                ", positionCode='" + positionCode + '\'' +
                ", insuranceNam='" + insuranceNam + '\'' +
                ", insuranceNo='" + insuranceNo + '\'' +
                '}';
    }
}