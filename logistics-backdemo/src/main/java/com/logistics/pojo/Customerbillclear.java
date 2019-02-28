package com.logistics.pojo;

import java.util.Date;

public class Customerbillclear {
    private String goodsBillCode;

    private String customerCode;

    private Double balance;

    private Date balanceTime;

    private String balanceType;

    private Double billMoney;

    private Double carriageReduceFund;

    private Double carryGoodsFee;

    private Double insurance;

    private Double moneyReceivable;

    private Double payKickback;

    private Double prepayMoney;

    private Double receivedMoney;

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType == null ? null : balanceType.trim();
    }

    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    public Double getCarriageReduceFund() {
        return carriageReduceFund;
    }

    public void setCarriageReduceFund(Double carriageReduceFund) {
        this.carriageReduceFund = carriageReduceFund;
    }

    public Double getCarryGoodsFee() {
        return carryGoodsFee;
    }

    public void setCarryGoodsFee(Double carryGoodsFee) {
        this.carryGoodsFee = carryGoodsFee;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getMoneyReceivable() {
        return moneyReceivable;
    }

    public void setMoneyReceivable(Double moneyReceivable) {
        this.moneyReceivable = moneyReceivable;
    }

    public Double getPayKickback() {
        return payKickback;
    }

    public void setPayKickback(Double payKickback) {
        this.payKickback = payKickback;
    }

    public Double getPrepayMoney() {
        return prepayMoney;
    }

    public void setPrepayMoney(Double prepayMoney) {
        this.prepayMoney = prepayMoney;
    }

    public Double getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(Double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }
}