package com.logistics.pojo;

public class Complaintinfo {
    private Integer id;

    private String appealContent;

    private String appealDate;

    private String callBackDate;

    private String customer;

    private String dealDate;

    private String dealPerson;

    private String dealResult;

    private String goodsBillCode;

    private Boolean ifCallback;

    private Boolean ifHandle;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppealContent() {
        return appealContent;
    }

    public void setAppealContent(String appealContent) {
        this.appealContent = appealContent == null ? null : appealContent.trim();
    }

    public String getAppealDate() {
        return appealDate;
    }

    public void setAppealDate(String appealDate) {
        this.appealDate = appealDate == null ? null : appealDate.trim();
    }

    public String getCallBackDate() {
        return callBackDate;
    }

    public void setCallBackDate(String callBackDate) {
        this.callBackDate = callBackDate == null ? null : callBackDate.trim();
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getDealDate() {
        return dealDate;
    }

    public void setDealDate(String dealDate) {
        this.dealDate = dealDate == null ? null : dealDate.trim();
    }

    public String getDealPerson() {
        return dealPerson;
    }

    public void setDealPerson(String dealPerson) {
        this.dealPerson = dealPerson == null ? null : dealPerson.trim();
    }

    public String getDealResult() {
        return dealResult;
    }

    public void setDealResult(String dealResult) {
        this.dealResult = dealResult == null ? null : dealResult.trim();
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public Boolean getIfCallback() {
        return ifCallback;
    }

    public void setIfCallback(Boolean ifCallback) {
        this.ifCallback = ifCallback;
    }

    public Boolean getIfHandle() {
        return ifHandle;
    }

    public void setIfHandle(Boolean ifHandle) {
        this.ifHandle = ifHandle;
    }
}