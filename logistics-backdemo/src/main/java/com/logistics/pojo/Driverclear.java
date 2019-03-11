package com.logistics.pojo;

import java.util.Date;

public class Driverclear {
    private String backBillCode;

    private Double addCarriage;

    private Double balance;

    private Date balanceTime;

    private String balanceType;

    private Double bindInsurance;

    private Double carryFee;

    private Double dispatchServiceFee;

    private String driverCode;

    private Double insurance;

    private Double needPayment;

    private Double payedMoney;

    private Double prepayMoney;

    public String getBackBillCode() {
        return backBillCode;
    }

    public void setBackBillCode(String backBillCode) {
        this.backBillCode = backBillCode == null ? null : backBillCode.trim();
    }

    public Double getAddCarriage() {
        return addCarriage;
    }

    public void setAddCarriage(Double addCarriage) {
        this.addCarriage = addCarriage;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getBalanceTime() {
        return balanceTime;
    }

    public void setBalanceTime(Date balanceTime) {
        this.balanceTime = balanceTime;
    }

    public String getBalanceType() {
        return balanceType;
    }

    public void setBalanceType(String balanceType) {
        this.balanceType = balanceType == null ? null : balanceType.trim();
    }

    public Double getBindInsurance() {
        return bindInsurance;
    }

    public void setBindInsurance(Double bindInsurance) {
        this.bindInsurance = bindInsurance;
    }

    public Double getCarryFee() {
        return carryFee;
    }

    public void setCarryFee(Double carryFee) {
        this.carryFee = carryFee;
    }

    public Double getDispatchServiceFee() {
        return dispatchServiceFee;
    }

    public void setDispatchServiceFee(Double dispatchServiceFee) {
        this.dispatchServiceFee = dispatchServiceFee;
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode == null ? null : driverCode.trim();
    }

    public Double getInsurance() {
        return insurance;
    }

    public void setInsurance(Double insurance) {
        this.insurance = insurance;
    }

    public Double getNeedPayment() {
        return needPayment;
    }

    public void setNeedPayment(Double needPayment) {
        this.needPayment = needPayment;
    }

    public Double getPayedMoney() {
        return payedMoney;
    }

    public void setPayedMoney(Double payedMoney) {
        this.payedMoney = payedMoney;
    }

    public Double getPrepayMoney() {
        return prepayMoney;
    }

    public void setPrepayMoney(Double prepayMoney) {
        this.prepayMoney = prepayMoney;
    }

    @Override
    public String toString() {
        return "Driverclear{" +
                "backBillCode='" + backBillCode + '\'' +
                ", addCarriage=" + addCarriage +
                ", balance=" + balance +
                ", balanceTime=" + balanceTime +
                ", balanceType='" + balanceType + '\'' +
                ", bindInsurance=" + bindInsurance +
                ", carryFee=" + carryFee +
                ", dispatchServiceFee=" + dispatchServiceFee +
                ", driverCode='" + driverCode + '\'' +
                ", insurance=" + insurance +
                ", needPayment=" + needPayment +
                ", payedMoney=" + payedMoney +
                ", prepayMoney=" + prepayMoney +
                '}';
    }
}