package com.logistics.pojo;

import java.util.Date;

public class Goodsreceiptinfo {
    private Integer id;

    private String checkGoodsRecord;

    private String driverName;

    private String goodsRevertCode;

    private Date rceiveGoodsDate;

    private String receiveGoodsPerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCheckGoodsRecord() {
        return checkGoodsRecord;
    }

    public void setCheckGoodsRecord(String checkGoodsRecord) {
        this.checkGoodsRecord = checkGoodsRecord == null ? null : checkGoodsRecord.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getGoodsRevertCode() {
        return goodsRevertCode;
    }

    public void setGoodsRevertCode(String goodsRevertCode) {
        this.goodsRevertCode = goodsRevertCode == null ? null : goodsRevertCode.trim();
    }

    public Date getRceiveGoodsDate() {
        return rceiveGoodsDate;
    }

    public void setRceiveGoodsDate(Date rceiveGoodsDate) {
        this.rceiveGoodsDate = rceiveGoodsDate;
    }

    public String getReceiveGoodsPerson() {
        return receiveGoodsPerson;
    }

    public void setReceiveGoodsPerson(String receiveGoodsPerson) {
        this.receiveGoodsPerson = receiveGoodsPerson == null ? null : receiveGoodsPerson.trim();
    }
}