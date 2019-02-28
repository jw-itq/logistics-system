package com.logistics.pojo;

import java.util.Date;

public class Managefee {
    private Integer id;

    private Double houseRent;

    private Double officeFee;

    private Double otherPayout;

    private String payoutMonth;

    private Double phoneFee;

    private Double waterElecFee;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Double houseRent) {
        this.houseRent = houseRent;
    }

    public Double getOfficeFee() {
        return officeFee;
    }

    public void setOfficeFee(Double officeFee) {
        this.officeFee = officeFee;
    }

    public Double getOtherPayout() {
        return otherPayout;
    }

    public void setOtherPayout(Double otherPayout) {
        this.otherPayout = otherPayout;
    }

    public String getPayoutMonth() {
        return payoutMonth;
    }

    public void setPayoutMonth(String payoutMonth) {
        this.payoutMonth = payoutMonth == null ? null : payoutMonth.trim();
    }

    public Double getPhoneFee() {
        return phoneFee;
    }

    public void setPhoneFee(Double phoneFee) {
        this.phoneFee = phoneFee;
    }

    public Double getWaterElecFee() {
        return waterElecFee;
    }

    public void setWaterElecFee(Double waterElecFee) {
        this.waterElecFee = waterElecFee;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}