package com.logistics.pojo;

import java.util.Date;

public class Carcost {
    private String driverCode;

    private Double addCarriageTotal;

    private Double allowCarryWeight;

    private String backBillCode;

    private Date balanceTime;

    private String carNo;

    private String carType;

    private String carWidth;

    private Double carryFeeTotal;

    private String dealGoodsStation;

    private Double factCarriageTotal;

    private String goodsHeight;

    private String loadStation;

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode == null ? null : driverCode.trim();
    }

    public Double getAddCarriageTotal() {
        return addCarriageTotal;
    }

    public void setAddCarriageTotal(Double addCarriageTotal) {
        this.addCarriageTotal = addCarriageTotal;
    }

    public Double getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(Double allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight;
    }

    public String getBackBillCode() {
        return backBillCode;
    }

    public void setBackBillCode(String backBillCode) {
        this.backBillCode = backBillCode == null ? null : backBillCode.trim();
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth == null ? null : carWidth.trim();
    }

    public Double getCarryFeeTotal() {
        return carryFeeTotal;
    }

    public void setCarryFeeTotal(Double carryFeeTotal) {
        this.carryFeeTotal = carryFeeTotal;
    }

    public String getDealGoodsStation() {
        return dealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        this.dealGoodsStation = dealGoodsStation == null ? null : dealGoodsStation.trim();
    }

    public Double getFactCarriageTotal() {
        return factCarriageTotal;
    }

    public void setFactCarriageTotal(Double factCarriageTotal) {
        this.factCarriageTotal = factCarriageTotal;
    }

    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight == null ? null : goodsHeight.trim();
    }

    public String getLoadStation() {
        return loadStation;
    }

    public void setLoadStation(String loadStation) {
        this.loadStation = loadStation == null ? null : loadStation.trim();
    }
}