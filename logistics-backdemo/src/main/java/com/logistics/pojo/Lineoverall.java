package com.logistics.pojo;

public class Lineoverall {
    private Integer id;

    private Double allCarriageTotal;

    private String dealGoodsStation;

    private Double insuranceTotal;

    private String loadStation;

    private Integer times;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAllCarriageTotal() {
        return allCarriageTotal;
    }

    public void setAllCarriageTotal(Double allCarriageTotal) {
        this.allCarriageTotal = allCarriageTotal;
    }

    public String getDealGoodsStation() {
        return dealGoodsStation;
    }

    public void setDealGoodsStation(String dealGoodsStation) {
        this.dealGoodsStation = dealGoodsStation == null ? null : dealGoodsStation.trim();
    }

    public Double getInsuranceTotal() {
        return insuranceTotal;
    }

    public void setInsuranceTotal(Double insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }

    public String getLoadStation() {
        return loadStation;
    }

    public void setLoadStation(String loadStation) {
        this.loadStation = loadStation == null ? null : loadStation.trim();
    }

    public Integer getTimes() {
        return times;
    }

    public void setTimes(Integer times) {
        this.times = times;
    }
}