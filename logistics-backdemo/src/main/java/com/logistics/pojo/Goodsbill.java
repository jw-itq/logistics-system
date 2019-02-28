package com.logistics.pojo;

import java.util.Date;

public class Goodsbill {
    private String goodsBillCode;

    private String acceptProcedureRate;

    private String acceptStation;

    private Double carriage;

    private Double carryGoodsFee;

    private String employeeCode;

    private Date factDealDate;

    private String fetchGoodsMode;

    private Double helpAcceptPayment;

    private Boolean ifAudit;

    private Boolean ifSettleAccounts;

    private Double insurance;

    private Double moneyOfChangePay;

    private Double payKickback;

    private String payMode;

    private Date predeliveryDate;

    private String receiveGoodsAddr;

    private String receiveGoodsCustomer;

    private String receiveGoodsCustomerAddr;

    private String receiveGoodsCustomerCode;

    private String receiveGoodsCustomerTel;

    private Double reduceFund;

    private String remark;

    private String sendGoodsAddr;

    private String sendGoodsCustomer;

    private String sendGoodsCustomerAddr;

    private String sendGoodsCustomerNo;

    private String sendGoodsCustomerTel;

    private Date sendGoodsDate;

    private Double transferFee;

    private String transferStation;

    private Boolean validity;

    private String writeBillPerson;

    private Date writeDate;

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public String getAcceptProcedureRate() {
        return acceptProcedureRate;
    }

    public void setAcceptProcedureRate(String acceptProcedureRate) {
        this.acceptProcedureRate = acceptProcedureRate == null ? null : acceptProcedureRate.trim();
    }

    public String getAcceptStation() {
        return acceptStation;
    }

    public void setAcceptStation(String acceptStation) {
        this.acceptStation = acceptStation == null ? null : acceptStation.trim();
    }

    public Double getCarriage() {
        return carriage;
    }

    public void setCarriage(Double carriage) {
        this.carriage = carriage;
    }

    public Double getCarryGoodsFee() {
        return carryGoodsFee;
    }

    public void setCarryGoodsFee(Double carryGoodsFee) {
        this.carryGoodsFee = carryGoodsFee;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public Date getFactDealDate() {
        return factDealDate;
    }

    public void setFactDealDate(Date factDealDate) {
        this.factDealDate = factDealDate;
    }

    public String getFetchGoodsMode() {
        return fetchGoodsMode;
    }

    public void setFetchGoodsMode(String fetchGoodsMode) {
        this.fetchGoodsMode = fetchGoodsMode == null ? null : fetchGoodsMode.trim();
    }

    public Double getHelpAcceptPayment() {
        return helpAcceptPayment;
    }

    public void setHelpAcceptPayment(Double helpAcceptPayment) {
        this.helpAcceptPayment = helpAcceptPayment;
    }

    public Boolean getIfAudit() {
        return ifAudit;
    }

    public void setIfAudit(Boolean ifAudit) {
        this.ifAudit = ifAudit;
    }

    public Boolean getIfSettleAccounts() {
        return ifSettleAccounts;
    }

    public void setIfSettleAccounts(Boolean ifSettleAccounts) {
        this.ifSettleAccounts = ifSettleAccounts;
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getMoneyOfChangePay() {
        return moneyOfChangePay;
    }

    public void setMoneyOfChangePay(Double moneyOfChangePay) {
        this.moneyOfChangePay = moneyOfChangePay;
    }

    public Double getPayKickback() {
        return payKickback;
    }

    public void setPayKickback(Double payKickback) {
        this.payKickback = payKickback;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode == null ? null : payMode.trim();
    }

    public Date getPredeliveryDate() {
        return predeliveryDate;
    }

    public void setPredeliveryDate(Date predeliveryDate) {
        this.predeliveryDate = predeliveryDate;
    }

    public String getReceiveGoodsAddr() {
        return receiveGoodsAddr;
    }

    public void setReceiveGoodsAddr(String receiveGoodsAddr) {
        this.receiveGoodsAddr = receiveGoodsAddr == null ? null : receiveGoodsAddr.trim();
    }

    public String getReceiveGoodsCustomer() {
        return receiveGoodsCustomer;
    }

    public void setReceiveGoodsCustomer(String receiveGoodsCustomer) {
        this.receiveGoodsCustomer = receiveGoodsCustomer == null ? null : receiveGoodsCustomer.trim();
    }

    public String getReceiveGoodsCustomerAddr() {
        return receiveGoodsCustomerAddr;
    }

    public void setReceiveGoodsCustomerAddr(String receiveGoodsCustomerAddr) {
        this.receiveGoodsCustomerAddr = receiveGoodsCustomerAddr == null ? null : receiveGoodsCustomerAddr.trim();
    }

    public String getReceiveGoodsCustomerCode() {
        return receiveGoodsCustomerCode;
    }

    public void setReceiveGoodsCustomerCode(String receiveGoodsCustomerCode) {
        this.receiveGoodsCustomerCode = receiveGoodsCustomerCode == null ? null : receiveGoodsCustomerCode.trim();
    }

    public String getReceiveGoodsCustomerTel() {
        return receiveGoodsCustomerTel;
    }

    public void setReceiveGoodsCustomerTel(String receiveGoodsCustomerTel) {
        this.receiveGoodsCustomerTel = receiveGoodsCustomerTel == null ? null : receiveGoodsCustomerTel.trim();
    }

    public Double getReduceFund() {
        return reduceFund;
    }

    public void setReduceFund(Double reduceFund) {
        this.reduceFund = reduceFund;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getSendGoodsAddr() {
        return sendGoodsAddr;
    }

    public void setSendGoodsAddr(String sendGoodsAddr) {
        this.sendGoodsAddr = sendGoodsAddr == null ? null : sendGoodsAddr.trim();
    }

    public String getSendGoodsCustomer() {
        return sendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        this.sendGoodsCustomer = sendGoodsCustomer == null ? null : sendGoodsCustomer.trim();
    }

    public String getSendGoodsCustomerAddr() {
        return sendGoodsCustomerAddr;
    }

    public void setSendGoodsCustomerAddr(String sendGoodsCustomerAddr) {
        this.sendGoodsCustomerAddr = sendGoodsCustomerAddr == null ? null : sendGoodsCustomerAddr.trim();
    }

    public String getSendGoodsCustomerNo() {
        return sendGoodsCustomerNo;
    }

    public void setSendGoodsCustomerNo(String sendGoodsCustomerNo) {
        this.sendGoodsCustomerNo = sendGoodsCustomerNo == null ? null : sendGoodsCustomerNo.trim();
    }

    public String getSendGoodsCustomerTel() {
        return sendGoodsCustomerTel;
    }

    public void setSendGoodsCustomerTel(String sendGoodsCustomerTel) {
        this.sendGoodsCustomerTel = sendGoodsCustomerTel == null ? null : sendGoodsCustomerTel.trim();
    }

    public Date getSendGoodsDate() {
        return sendGoodsDate;
    }

    public void setSendGoodsDate(Date sendGoodsDate) {
        this.sendGoodsDate = sendGoodsDate;
    }

    public Double getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(Double transferFee) {
        this.transferFee = transferFee;
    }

    public String getTransferStation() {
        return transferStation;
    }

    public void setTransferStation(String transferStation) {
        this.transferStation = transferStation == null ? null : transferStation.trim();
    }

    public Boolean getValidity() {
        return validity;
    }

    public void setValidity(Boolean validity) {
        this.validity = validity;
    }

    public String getWriteBillPerson() {
        return writeBillPerson;
    }

    public void setWriteBillPerson(String writeBillPerson) {
        this.writeBillPerson = writeBillPerson == null ? null : writeBillPerson.trim();
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}