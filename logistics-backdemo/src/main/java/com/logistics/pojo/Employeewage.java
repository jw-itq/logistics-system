package com.logistics.pojo;

import java.util.Date;

public class Employeewage {
    private Integer id;

    private Double allowance;

    private Double basicWage;

    private Date date;

    private String employee;

    private String employeeCode;

    private Double stationWage;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(Double basicWage) {
        this.basicWage = basicWage;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee == null ? null : employee.trim();
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public Double getStationWage() {
        return stationWage;
    }

    public void setStationWage(Double stationWage) {
        this.stationWage = stationWage;
    }
}