package com.logistics.pojo;

/**
 * 货物回执单详表
 * @author shiwanming
 */
public class Cargoreceiptdetail {
    private String goodsRevertBillId;

    private String goodsBillDetailId;

    private Double goodsValue;

    private Integer pieceAmount;

    private String priceMode;

    private String priceStandard;

    private Double volume;

    private Double weight;

    public String getGoodsRevertBillId() {
        return goodsRevertBillId;
    }

    public void setGoodsRevertBillId(String goodsRevertBillId) {
        this.goodsRevertBillId = goodsRevertBillId == null ? null : goodsRevertBillId.trim();
    }

    public String getGoodsBillDetailId() {
        return goodsBillDetailId;
    }

    public void setGoodsBillDetailId(String goodsBillDetailId) {
        this.goodsBillDetailId = goodsBillDetailId == null ? null : goodsBillDetailId.trim();
    }

    public Double getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(Double goodsValue) {
        this.goodsValue = goodsValue;
    }

    public Integer getPieceAmount() {
        return pieceAmount;
    }

    public void setPieceAmount(Integer pieceAmount) {
        this.pieceAmount = pieceAmount;
    }

    public String getPriceMode() {
        return priceMode;
    }

    public void setPriceMode(String priceMode) {
        this.priceMode = priceMode == null ? null : priceMode.trim();
    }

    public String getPriceStandard() {
        return priceStandard;
    }

    public void setPriceStandard(String priceStandard) {
        this.priceStandard = priceStandard == null ? null : priceStandard.trim();
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}