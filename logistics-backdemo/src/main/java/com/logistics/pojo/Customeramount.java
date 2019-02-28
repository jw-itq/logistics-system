package com.logistics.pojo;

public class Customeramount {
    private String sendGoodsCustomer;

    private Double carriageTotal;

    private Double insuranceTotal;

    private Integer pieceAmountTotal;

    public String getSendGoodsCustomer() {
        return sendGoodsCustomer;
    }

    public void setSendGoodsCustomer(String sendGoodsCustomer) {
        this.sendGoodsCustomer = sendGoodsCustomer == null ? null : sendGoodsCustomer.trim();
    }

    public Double getCarriageTotal() {
        return carriageTotal;
    }

    public void setCarriageTotal(Double carriageTotal) {
        this.carriageTotal = carriageTotal;
    }

    public Double getInsuranceTotal() {
        return insuranceTotal;
    }

    public void setInsuranceTotal(Double insuranceTotal) {
        this.insuranceTotal = insuranceTotal;
    }

    public Integer getPieceAmountTotal() {
        return pieceAmountTotal;
    }

    public void setPieceAmountTotal(Integer pieceAmountTotal) {
        this.pieceAmountTotal = pieceAmountTotal;
    }
}