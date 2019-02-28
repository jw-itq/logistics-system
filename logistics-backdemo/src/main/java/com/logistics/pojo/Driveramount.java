package com.logistics.pojo;

public class Driveramount {
    private String driverCode;

    private Double addCarriageTotal;

    private Double carryFeeTotal;

    private Double total;

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode == null ? null : driverCode.trim();
    }

    public Double getAddCarriageTotal() {
        return addCarriageTotal;
    }

    public void setAddCarriageTotal(Double addCarriageTotal) {
        this.addCarriageTotal = addCarriageTotal;
    }

    public Double getCarryFeeTotal() {
        return carryFeeTotal;
    }

    public void setCarryFeeTotal(Double carryFeeTotal) {
        this.carryFeeTotal = carryFeeTotal;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }
}