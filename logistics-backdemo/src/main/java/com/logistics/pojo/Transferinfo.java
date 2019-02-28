package com.logistics.pojo;

import java.util.Date;

public class Transferinfo {
    private Integer id;

    private String afterTransferBill;

    private Date checkTime;

    private String description;

    private String goodsBillCode;

    private String transferAddr;

    private String transferCheck;

    private String transferCompany;

    private Double transferFee;

    private String transferStation;

    private String transferStationTel;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAfterTransferBill() {
        return afterTransferBill;
    }

    public void setAfterTransferBill(String afterTransferBill) {
        this.afterTransferBill = afterTransferBill == null ? null : afterTransferBill.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public String getTransferAddr() {
        return transferAddr;
    }

    public void setTransferAddr(String transferAddr) {
        this.transferAddr = transferAddr == null ? null : transferAddr.trim();
    }

    public String getTransferCheck() {
        return transferCheck;
    }

    public void setTransferCheck(String transferCheck) {
        this.transferCheck = transferCheck == null ? null : transferCheck.trim();
    }

    public String getTransferCompany() {
        return transferCompany;
    }

    public void setTransferCompany(String transferCompany) {
        this.transferCompany = transferCompany == null ? null : transferCompany.trim();
    }

    public Double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }

    public String getTransferStation() {
        return transferStation;
    }

    public void setTransferStation(String transferStation) {
        this.transferStation = transferStation == null ? null : transferStation.trim();
    }

    public String getTransferStationTel() {
        return transferStationTel;
    }

    public void setTransferStationTel(String transferStationTel) {
        this.transferStationTel = transferStationTel == null ? null : transferStationTel.trim();
    }
}