package com.logistics.pojo;

import java.util.Date;

public class Contactsservice {
    private String sendGoodsCustomer;

    private Double balance;

    private Double billMoney;

    private Double carriage;

    private String goodsBillCode;

    private Double insurance;

    private Double moneyReceivable;

    private String receiveGoodsAddr;

    private Double receivedMoney;

    private String sendGoodsAddr;

    private Date sendGoodsDate;

    public String getSendGoodsCustomer() {
        return sendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        this.sendGoodsCustomer = sendGoodsCustomer == null ? null : sendGoodsCustomer.trim();
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getBillMoney() {
        return billMoney;
    }

    public void setBillMoney(Double billMoney) {
        this.billMoney = billMoney;
    }

    public Double getCarriage() {
        return carriage;
    }

    public void setCarriage(Double carriage) {
        this.carriage = carriage;
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
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

    public String getReceiveGoodsAddr() {
        return receiveGoodsAddr;
    }

    public void setReceiveGoodsAddr(String receiveGoodsAddr) {
        this.receiveGoodsAddr = receiveGoodsAddr == null ? null : receiveGoodsAddr.trim();
    }

    public Double getReceivedMoney() {
        return receivedMoney;
    }

    public void setReceivedMoney(Double receivedMoney) {
        this.receivedMoney = receivedMoney;
    }

    public String getSendGoodsAddr() {
        return sendGoodsAddr;
    }

    public void setSendGoodsAddr(String sendGoodsAddr) {
        this.sendGoodsAddr = sendGoodsAddr == null ? null : sendGoodsAddr.trim();
    }

    public Date getSendGoodsDate() {
        return sendGoodsDate;
    }

    public void setSendGoodsDate(Date sendGoodsDate) {
        this.sendGoodsDate = sendGoodsDate;
    }
}