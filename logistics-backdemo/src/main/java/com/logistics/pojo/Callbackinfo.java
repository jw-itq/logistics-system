package com.logistics.pojo;

import java.util.Date;

public class Callbackinfo {
    private Integer id;

    private String billId;

    private String billType;

    private String content;

    private String dialNo;

    private Date finallyDialTime;

    private String goodsBillId;

    private Boolean locked;

    private Boolean success;

    private String type;

    private Date writeTime;

    private String writer;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId == null ? null : billId.trim();
    }

    public String getBillType() {
        return billType;
    }

    public void setBillType(String billType) {
        this.billType = billType == null ? null : billType.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getDialNo() {
        return dialNo;
    }

    public void setDialNo(String dialNo) {
        this.dialNo = dialNo == null ? null : dialNo.trim();
    }

    public Date getFinallyDialTime() {
        return finallyDialTime;
    }

    public void setFinallyDialTime(Date finallyDialTime) {
        this.finallyDialTime = finallyDialTime;
    }

    public String getGoodsBillId() {
        return goodsBillId;
    }

    public void setGoodsBillId(String goodsBillId) {
        this.goodsBillId = goodsBillId == null ? null : goodsBillId.trim();
    }

    public Boolean getLocked() {
        return locked;
    }

    public void setLocked(Boolean locked) {
        this.locked = locked;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer == null ? null : writer.trim();
    }
}