package com.logistics.pojo;

public class Sentlist {
    private Integer id;

    private Double backCost;

    private String carCardNo;

    private Double cashPay;

    private String driverName;

    private String goodsCode;

    private String goodsName;

    private String goodsRevertBillCode;

    private String helpAcceptFund;

    private String mobile;

    private Double pickupPay;

    private Integer pieceAmount;

    private String remark;

    private String sendGoodsCustomer;

    private String sendGoodsCustomerTel;

    private String transferDestination;

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getBackCost() {
        return backCost;
    }

    public void setBackCost(Double backCost) {
        this.backCost = backCost;
    }

    public String getCarCardNo() {
        return carCardNo;
    }

    public void setCarCardNo(String carCardNo) {
        this.carCardNo = carCardNo == null ? null : carCardNo.trim();
    }

    public Double getCashPay() {
        return cashPay;
    }

    public void setCashPay(Double cashPay) {
        this.cashPay = cashPay;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getGoodsCode() {
        return goodsCode;
    }

    public void setGoodsCode(String goodsCode) {
        this.goodsCode = goodsCode == null ? null : goodsCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsRevertBillCode() {
        return goodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        this.goodsRevertBillCode = goodsRevertBillCode == null ? null : goodsRevertBillCode.trim();
    }

    public String getHelpAcceptFund() {
        return helpAcceptFund;
    }

    public void setHelpAcceptFund(String helpAcceptFund) {
        this.helpAcceptFund = helpAcceptFund == null ? null : helpAcceptFund.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Double getPickupPay() {
        return pickupPay;
    }

    public void setPickupPay(Double pickupPay) {
        this.pickupPay = pickupPay;
    }

    public Integer getPieceAmount() {
        return pieceAmount;
    }

    public void setPieceAmount(Integer pieceAmount) {
        this.pieceAmount = pieceAmount;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSendGoodsCustomer() {
        return sendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        this.sendGoodsCustomer = sendGoodsCustomer == null ? null : sendGoodsCustomer.trim();
    }

    public String getSendGoodsCustomerTel() {
        return sendGoodsCustomerTel;
    }

    public void setSendGoodsCustomerTel(String sendGoodsCustomerTel) {
        this.sendGoodsCustomerTel = sendGoodsCustomerTel == null ? null : sendGoodsCustomerTel.trim();
    }

    public String getTransferDestination() {
        return transferDestination;
    }

    public void setTransferDestination(String transferDestination) {
        this.transferDestination = transferDestination == null ? null : transferDestination.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}