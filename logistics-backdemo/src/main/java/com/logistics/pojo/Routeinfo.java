package com.logistics.pojo;

public class Routeinfo {
    private Integer id;

    private Double distance;

    private Integer endStation;

    private Double fetchTime;

    private String passStation;

    private Integer startStation;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Integer getEndStation() {
        return endStation;
    }

    public void setEndStation(Integer endStation) {
        this.endStation = endStation;
    }

    public Double getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(Double fetchTime) {
        this.fetchTime = fetchTime;
    }

    public String getPassStation() {
        return passStation;
    }

    public void setPassStation(String passStation) {
        this.passStation = passStation == null ? null : passStation.trim();
    }

    public Integer getStartStation() {
        return startStation;
    }

    public void setStartStation(Integer startStation) {
        this.startStation = startStation;
    }
}