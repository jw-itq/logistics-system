package com.logistics.pojo;

import java.util.Date;

/**
 * 单据分发表
 */
public class Billrelease {
    private Integer id;

    private String acceptStation;

    private String billCode;

    private String billType;

    private String receiveBillPerson;

    private Date receiveBillTime;

    private String releasePerson;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation == null ? null : acceptStation.trim();
    }

    public String getBillCode() {
        return billCode;
    }

    public void setBillCode(String billCode) {
        this.billCode = billCode == null ? null : billCode.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getReceiveBillPerson() {
        return receiveBillPerson;
    }

    public void setReceiveBillPerson(String receiveBillPerson) {
        this.receiveBillPerson = receiveBillPerson == null ? null : receiveBillPerson.trim();
    }

    public Date getReceiveBillTime() {
        return receiveBillTime;
    }

    public void setReceiveBillTime(Date receiveBillTime) {
        this.receiveBillTime = receiveBillTime;
    }

    public String getReleasePerson() {
        return releasePerson;
    }

    @Override
    public String toString() {
        return "Billrelease{" +
                "id=" + id +
                ", acceptStation='" + acceptStation + '\'' +
                ", billCode='" + billCode + '\'' +
                ", billType='" + billType + '\'' +
                ", receiveBillPerson='" + receiveBillPerson + '\'' +
                ", receiveBillTime=" + receiveBillTime +
                ", releasePerson='" + releasePerson + '\'' +
                '}';
    }

    public void setReleasePerson(String releasePerson) {
        this.releasePerson = releasePerson == null ? null : releasePerson.trim();
    }
}