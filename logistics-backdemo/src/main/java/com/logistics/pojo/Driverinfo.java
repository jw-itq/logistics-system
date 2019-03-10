package com.logistics.pojo;

import java.util.Date;

public class Driverinfo {
    private String id;

    private String address;

    private Double allowCarryVolume;

    private Double allowCarryWeight;

    private Date birthday;

    private String bizLicence;

    private String carDept;

    private String carDeptTel;

    private String carFrameNo;

    private String carLength;

    private String carNo;

    private String carType;

    private String carWidth;

    private Boolean companyCar;

    private String driveLicence;

    private String driverName;

    private String engineNo;

    private String gender;

    private String goodsHeight;

    private String idCard;

    private String insuranceCard;

    private String phone;

    private String remark;

    private String runLicence;

    private String state;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Double getAllowCarryVolume() {
        return allowCarryVolume;
    }

    public void setAllowCarryVolume(Double allowCarryVolume) {
        this.allowCarryVolume = allowCarryVolume;
    }

    public Double getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(Double allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence == null ? null : bizLicence.trim();
    }

    public String getCarDept() {
        return carDept;
    }

    public void setCarDept(String carDept) {
        this.carDept = carDept == null ? null : carDept.trim();
    }

    public String getCarDeptTel() {
        return carDeptTel;
    }

    public void setCarDeptTel(String carDeptTel) {
        this.carDeptTel = carDeptTel == null ? null : carDeptTel.trim();
    }

    public String getCarFrameNo() {
        return carFrameNo;
    }

    public void setCarFrameNo(String carFrameNo) {
        this.carFrameNo = carFrameNo == null ? null : carFrameNo.trim();
    }

    public String getCarLength() {
        return carLength;
    }

    public void setCarLength(String carLength) {
        this.carLength = carLength == null ? null : carLength.trim();
    }

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo == null ? null : carNo.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth == null ? null : carWidth.trim();
    }

    public Boolean getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(Boolean companyCar) {
        this.companyCar = companyCar;
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence == null ? null : driveLicence.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getEngineNo() {
        return engineNo;
    }

    public void setEngineNo(String engineNo) {
        this.engineNo = engineNo == null ? null : engineNo.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight == null ? null : goodsHeight.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(String insuranceCard) {
        this.insuranceCard = insuranceCard == null ? null : insuranceCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getRunLicence() {
        return runLicence;
    }

    public void setRunLicence(String runLicence) {
        this.runLicence = runLicence == null ? null : runLicence.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    @Override
    public String toString() {
        return "Driverinfo{" +
                "id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", allowCarryVolume=" + allowCarryVolume +
                ", allowCarryWeight=" + allowCarryWeight +
                ", birthday=" + birthday +
                ", bizLicence='" + bizLicence + '\'' +
                ", carDept='" + carDept + '\'' +
                ", carDeptTel='" + carDeptTel + '\'' +
                ", carFrameNo='" + carFrameNo + '\'' +
                ", carLength='" + carLength + '\'' +
                ", carNo='" + carNo + '\'' +
                ", carType='" + carType + '\'' +
                ", carWidth='" + carWidth + '\'' +
                ", companyCar=" + companyCar +
                ", driveLicence='" + driveLicence + '\'' +
                ", driverName='" + driverName + '\'' +
                ", engineNo='" + engineNo + '\'' +
                ", gender='" + gender + '\'' +
                ", goodsHeight='" + goodsHeight + '\'' +
                ", idCard='" + idCard + '\'' +
                ", insuranceCard='" + insuranceCard + '\'' +
                ", phone='" + phone + '\'' +
                ", remark='" + remark + '\'' +
                ", runLicence='" + runLicence + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}