package com.logistics.pojo;

public class Routeinfo {
    private Integer id;

    private Double distance;

    private String endStation;

    private Double fetchTime;

    private String passStation;

    private String startStation;

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

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation == null ? null : endStation.trim();
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

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation == null ? null : startStation.trim();
    }
}