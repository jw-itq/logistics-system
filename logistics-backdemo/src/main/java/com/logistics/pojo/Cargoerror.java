package com.logistics.pojo;

public class Cargoerror {
    private Integer id;

    private String customer;

    private String goodsBillCode;

    private String goodsName;

    private String goodsRevertBillCode;

    private Double goodsValue;

    private String mistakeType;

    private Integer pieceAmount;

    private String size;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public String getGoodsRevertBillCode() {
        return goodsRevertBillCode;
    }

    public void setGoodsRevertBillCode(String goodsRevertBillCode) {
        this.goodsRevertBillCode = goodsRevertBillCode == null ? null : goodsRevertBillCode.trim();
    }

    public Double getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    public String getMistakeType() {
        return mistakeType;
    }

    public void setMistakeType(String mistakeType) {
        this.mistakeType = mistakeType == null ? null : mistakeType.trim();
    }

    public Integer getPieceAmount() {
        return pieceAmount;
    }

    public void setPieceAmount(Integer pieceAmount) {
        this.pieceAmount = pieceAmount;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size == null ? null : size.trim();
    }
}