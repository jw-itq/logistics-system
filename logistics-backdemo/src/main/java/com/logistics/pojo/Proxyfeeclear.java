package com.logistics.pojo;

import java.util.Date;

public class Proxyfeeclear {
    private String goodsBillCode;

    private Double accountReceivable;

    private Date balanceDate;

    private Float commisionRate;

    private Double commisionReceivable;

    private String customerCode;

    private Double factReceiveFund;

    private Double goodsPayChange;

    private Double receivedCommision;

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public Double getAccountReceivable() {
        return accountReceivable;
    }

    public void setAccountReceivable(Double accountReceivable) {
        this.accountReceivable = accountReceivable;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }

    public Float getCommisionRate() {
        return commisionRate;
    }

    public void setCommisionRate(Float commisionRate) {
        this.commisionRate = commisionRate;
    }

    public Double getCommisionReceivable() {
        return commisionReceivable;
    }

    public void setCommisionReceivable(Double commisionReceivable) {
        this.commisionReceivable = commisionReceivable;
    }

    public String getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(String customerCode) {
        this.customerCode = customerCode == null ? null : customerCode.trim();
    }

    public Double getFactReceiveFund() {
        return factReceiveFund;
    }

    public void setFactReceiveFund(Double factReceiveFund) {
        this.factReceiveFund = factReceiveFund;
    }

    public Double getGoodsPayChange() {
        return goodsPayChange;
    }

    public void setGoodsPayChange(Double goodsPayChange) {
        this.goodsPayChange = goodsPayChange;
    }

    public Double getReceivedCommision() {
        return receivedCommision;
    }

    public void setReceivedCommision(Double receivedCommision) {
        this.receivedCommision = receivedCommision;
    }
}