package com.logistics.pojo;

public class Cityexpand {
    private Integer id;

    private Integer cityId;

    private String rangeCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public String getRangeCity() {
        return rangeCity;
    }

    public void setRangeCity(String rangeCity) {
        this.rangeCity = rangeCity == null ? null : rangeCity.trim();
    }
}