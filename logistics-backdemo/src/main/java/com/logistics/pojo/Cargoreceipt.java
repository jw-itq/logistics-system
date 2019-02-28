package com.logistics.pojo;

import java.util.Date;

public class Cargoreceipt {
    private String goodsRevertBillCode;

    private String acceptStation;

    private Double allCarriage;

    private Date arriveTime;

    private String backBillState;

    private String carriageBanlanceMode;

    private String carriageMode;

    private Double carryGoodsBillDeposit;

    private Double carryGoodsInsurance;

    private String dealGoodsStation;

    private Double dispatchServiceFee;

    private String driverId;

    private String ifBalance;

    private Double insurance;

    private String linkmanPhone;

    private String loadStation;

    private String receiveGoodsDetailAddr;

    private String receiveGoodsLinkman;

    private String remark;

    private Date signTime;

    private Double startAdvance;

    private Date startCarryTime;

    public String getGoodsRevertBillCode() {
        return goodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        this.goodsRevertBillCode = goodsRevertBillCode == null ? null : goodsRevertBillCode.trim();
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation == null ? null : acceptStation.trim();
    }

    public Double getAllCarriage() {
        return allCarriage;
    }

    public void setAllCarriage(Double allCarriage) {
        this.allCarriage = allCarriage;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public String getBackBillState() {
        return backBillState;
    }

    public void setBackBillState(String backBillState) {
        this.backBillState = backBillState == null ? null : backBillState.trim();
    }

    public String getCarriageBanlanceMode() {
        return carriageBanlanceMode;
    }

    public void setCarriageBanlanceMode(String carriageBanlanceMode) {
        this.carriageBanlanceMode = carriageBanlanceMode == null ? null : carriageBanlanceMode.trim();
    }

    public String getCarriageMode() {
        return carriageMode;
    }

    public void setCarriageMode(String carriageMode) {
        this.carriageMode = carriageMode == null ? null : carriageMode.trim();
    }

    public Double getCarryGoodsBillDeposit() {
        return carryGoodsBillDeposit;
    }

    public void setCarryGoodsBillDeposit(Double carryGoodsBillDeposit) {
        this.carryGoodsBillDeposit = carryGoodsBillDeposit;
    }

    public Double getCarryGoodsInsurance() {
        return carryGoodsInsurance;
    }

    public void setCarryGoodsInsurance(Double carryGoodsInsurance) {
        this.carryGoodsInsurance = carryGoodsInsurance;
    }

    public String getDealGoodsStation() {
        return dealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        this.dealGoodsStation = dealGoodsStation == null ? null : dealGoodsStation.trim();
    }

    public Double getDispatchServiceFee() {
        return dispatchServiceFee;
    }

    public void setDispatchServiceFee(Double dispatchServiceFee) {
        this.dispatchServiceFee = dispatchServiceFee;
    }

    public String getDriverId() {
        return driverId;
    }

    public void setDriverId(String driverId) {
        this.driverId = driverId == null ? null : driverId.trim();
    }

    public String getIfBalance() {
        return ifBalance;
    }

    public void setIfBalance(String ifBalance) {
        this.ifBalance = ifBalance == null ? null : ifBalance.trim();
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public String getLinkmanPhone() {
        return linkmanPhone;
    }

    public void setLinkmanPhone(String linkmanPhone) {
        this.linkmanPhone = linkmanPhone == null ? null : linkmanPhone.trim();
    }

    public String getLoadStation() {
        return loadStation;
    }

    public void setLoadStation(String loadStation) {
        this.loadStation = loadStation == null ? null : loadStation.trim();
    }

    public String getReceiveGoodsDetailAddr() {
        return receiveGoodsDetailAddr;
    }

    public void setReceiveGoodsDetailAddr(String receiveGoodsDetailAddr) {
        this.receiveGoodsDetailAddr = receiveGoodsDetailAddr == null ? null : receiveGoodsDetailAddr.trim();
    }

    public String getReceiveGoodsLinkman() {
        return receiveGoodsLinkman;
    }

    public void setReceiveGoodsLinkman(String receiveGoodsLinkman) {
        this.receiveGoodsLinkman = receiveGoodsLinkman == null ? null : receiveGoodsLinkman.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public Double getStartAdvance() {
        return startAdvance;
    }

    public void setStartAdvance(Double startAdvance) {
        this.startAdvance = startAdvance;
    }

    public Date getStartCarryTime() {
        return startCarryTime;
    }

    public void setStartCarryTime(Date startCarryTime) {
        this.startCarryTime = startCarryTime;
    }
}