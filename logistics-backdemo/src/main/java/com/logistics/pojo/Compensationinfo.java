package com.logistics.pojo;

import java.util.Date;

public class Compensationinfo {
    private Integer id;

    private Double amends;

    private Date amendsTime;

    private Double badDestroyGoods;

    private String customer;

    private Integer receiveStationId;

    private String receiveStationName;

    private String remark;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmends() {
        return amends;
    }

    public void setAmends(Double amends) {
        this.amends = amends;
    }

    public Date getAmendsTime() {
        return amendsTime;
    }

    public void setAmendsTime(Date amendsTime) {
        this.amendsTime = amendsTime;
    }

    public Double getBadDestroyGoods() {
        return badDestroyGoods;
    }

    public void setBadDestroyGoods(Double badDestroyGoods) {
        this.badDestroyGoods = badDestroyGoods;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Integer getReceiveStationId() {
        return receiveStationId;
    }

    public void setReceiveStationId(Integer receiveStationId) {
        this.receiveStationId = receiveStationId;
    }

    public String getReceiveStationName() {
        return receiveStationName;
    }

    public void setReceiveStationName(String receiveStationName) {
        this.receiveStationName = receiveStationName == null ? null : receiveStationName.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}