package com.logistics.pojo;

import java.util.Date;

public class Customerreceiptinfo {
    private Integer id;

    private Integer carryBillEventId;

    private String checkGoodsRecord;

    private String customer;

    private String goodsBillCode;

    private Date receiveGoodsDate;

    private String receiveGoodsPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCarryBillEventId() {
        return carryBillEventId;
    }

    public void setCarryBillEventId(Integer carryBillEventId) {
        this.carryBillEventId = carryBillEventId;
    }

    public String getCheckGoodsRecord() {
        return checkGoodsRecord;
    }

    public void setCheckGoodsRecord(String checkGoodsRecord) {
        this.checkGoodsRecord = checkGoodsRecord == null ? null : checkGoodsRecord.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public Date getReceiveGoodsDate() {
        return receiveGoodsDate;
    }

    public void setReceiveGoodsDate(Date receiveGoodsDate) {
        this.receiveGoodsDate = receiveGoodsDate;
    }

    public String getReceiveGoodsPerson() {
        return receiveGoodsPerson;
    }

    public void setReceiveGoodsPerson(String receiveGoodsPerson) {
        this.receiveGoodsPerson = receiveGoodsPerson == null ? null : receiveGoodsPerson.trim();
    }
}