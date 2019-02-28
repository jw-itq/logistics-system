package com.logistics.pojo;

import java.util.Date;

public class Financefee {
    private Integer id;

    private Double fee;

    private String payoutMonth;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFee() {
        return fee;
    }

    public void setFee(Double fee) {
        this.fee = fee;
    }

    public String getPayoutMonth() {
        return payoutMonth;
    }

    public void setPayoutMonth(String payoutMonth) {
        this.payoutMonth = payoutMonth == null ? null : payoutMonth.trim();
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}