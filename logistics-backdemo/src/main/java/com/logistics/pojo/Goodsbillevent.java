package com.logistics.pojo;

import java.util.Date;

public class Goodsbillevent {
    private String goodsBillId;

    private String eventName;

    private Date occurTime;

    private String remark;

    public String getGoodsBillId() {
        return goodsBillId;
    }

    public void setGoodsBillId(String goodsBillId) {
        this.goodsBillId = goodsBillId == null ? null : goodsBillId.trim();
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName == null ? null : eventName.trim();
    }

    public Date getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(Date occurTime) {
        this.occurTime = occurTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}