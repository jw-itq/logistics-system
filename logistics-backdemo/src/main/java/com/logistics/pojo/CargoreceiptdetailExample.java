package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class CargoreceiptdetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CargoreceiptdetailExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andGoodsRevertBillIdIsNull() {
            addCriterion("goods_revert_bill_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdIsNotNull() {
            addCriterion("goods_revert_bill_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdEqualTo(String value) {
            addCriterion("goods_revert_bill_id =", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdNotEqualTo(String value) {
            addCriterion("goods_revert_bill_id <>", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdGreaterThan(String value) {
            addCriterion("goods_revert_bill_id >", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_id >=", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdLessThan(String value) {
            addCriterion("goods_revert_bill_id <", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdLessThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_id <=", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdLike(String value) {
            addCriterion("goods_revert_bill_id like", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdNotLike(String value) {
            addCriterion("goods_revert_bill_id not like", value, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdIn(List<String> values) {
            addCriterion("goods_revert_bill_id in", values, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdNotIn(List<String> values) {
            addCriterion("goods_revert_bill_id not in", values, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_id between", value1, value2, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillIdNotBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_id not between", value1, value2, "goodsRevertBillId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdIsNull() {
            addCriterion("goods_bill_detail_id is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdIsNotNull() {
            addCriterion("goods_bill_detail_id is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdEqualTo(String value) {
            addCriterion("goods_bill_detail_id =", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdNotEqualTo(String value) {
            addCriterion("goods_bill_detail_id <>", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdGreaterThan(String value) {
            addCriterion("goods_bill_detail_id >", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdGreaterThanOrEqualTo(String value) {
            addCriterion("goods_bill_detail_id >=", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdLessThan(String value) {
            addCriterion("goods_bill_detail_id <", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdLessThanOrEqualTo(String value) {
            addCriterion("goods_bill_detail_id <=", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdLike(String value) {
            addCriterion("goods_bill_detail_id like", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdNotLike(String value) {
            addCriterion("goods_bill_detail_id not like", value, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdIn(List<String> values) {
            addCriterion("goods_bill_detail_id in", values, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdNotIn(List<String> values) {
            addCriterion("goods_bill_detail_id not in", values, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdBetween(String value1, String value2) {
            addCriterion("goods_bill_detail_id between", value1, value2, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsBillDetailIdNotBetween(String value1, String value2) {
            addCriterion("goods_bill_detail_id not between", value1, value2, "goodsBillDetailId");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNull() {
            addCriterion("goods_value is null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIsNotNull() {
            addCriterion("goods_value is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsValueEqualTo(Double value) {
            addCriterion("goods_value =", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotEqualTo(Double value) {
            addCriterion("goods_value <>", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThan(Double value) {
            addCriterion("goods_value >", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_value >=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThan(Double value) {
            addCriterion("goods_value <", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueLessThanOrEqualTo(Double value) {
            addCriterion("goods_value <=", value, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueIn(List<Double> values) {
            addCriterion("goods_value in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotIn(List<Double> values) {
            addCriterion("goods_value not in", values, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueBetween(Double value1, Double value2) {
            addCriterion("goods_value between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andGoodsValueNotBetween(Double value1, Double value2) {
            addCriterion("goods_value not between", value1, value2, "goodsValue");
            return (Criteria) this;
        }

        public Criteria andPieceAmountIsNull() {
            addCriterion("piece_amount is null");
            return (Criteria) this;
        }

        public Criteria andPieceAmountIsNotNull() {
            addCriterion("piece_amount is not null");
            return (Criteria) this;
        }

        public Criteria andPieceAmountEqualTo(Integer value) {
            addCriterion("piece_amount =", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountNotEqualTo(Integer value) {
            addCriterion("piece_amount <>", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountGreaterThan(Integer value) {
            addCriterion("piece_amount >", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountGreaterThanOrEqualTo(Integer value) {
            addCriterion("piece_amount >=", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountLessThan(Integer value) {
            addCriterion("piece_amount <", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountLessThanOrEqualTo(Integer value) {
            addCriterion("piece_amount <=", value, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountIn(List<Integer> values) {
            addCriterion("piece_amount in", values, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountNotIn(List<Integer> values) {
            addCriterion("piece_amount not in", values, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountBetween(Integer value1, Integer value2) {
            addCriterion("piece_amount between", value1, value2, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPieceAmountNotBetween(Integer value1, Integer value2) {
            addCriterion("piece_amount not between", value1, value2, "pieceAmount");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNull() {
            addCriterion("price_mode is null");
            return (Criteria) this;
        }

        public Criteria andPriceModeIsNotNull() {
            addCriterion("price_mode is not null");
            return (Criteria) this;
        }

        public Criteria andPriceModeEqualTo(String value) {
            addCriterion("price_mode =", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotEqualTo(String value) {
            addCriterion("price_mode <>", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThan(String value) {
            addCriterion("price_mode >", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeGreaterThanOrEqualTo(String value) {
            addCriterion("price_mode >=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThan(String value) {
            addCriterion("price_mode <", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLessThanOrEqualTo(String value) {
            addCriterion("price_mode <=", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeLike(String value) {
            addCriterion("price_mode like", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotLike(String value) {
            addCriterion("price_mode not like", value, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeIn(List<String> values) {
            addCriterion("price_mode in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotIn(List<String> values) {
            addCriterion("price_mode not in", values, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeBetween(String value1, String value2) {
            addCriterion("price_mode between", value1, value2, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceModeNotBetween(String value1, String value2) {
            addCriterion("price_mode not between", value1, value2, "priceMode");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIsNull() {
            addCriterion("price_standard is null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIsNotNull() {
            addCriterion("price_standard is not null");
            return (Criteria) this;
        }

        public Criteria andPriceStandardEqualTo(String value) {
            addCriterion("price_standard =", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotEqualTo(String value) {
            addCriterion("price_standard <>", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardGreaterThan(String value) {
            addCriterion("price_standard >", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardGreaterThanOrEqualTo(String value) {
            addCriterion("price_standard >=", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLessThan(String value) {
            addCriterion("price_standard <", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLessThanOrEqualTo(String value) {
            addCriterion("price_standard <=", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardLike(String value) {
            addCriterion("price_standard like", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotLike(String value) {
            addCriterion("price_standard not like", value, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardIn(List<String> values) {
            addCriterion("price_standard in", values, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotIn(List<String> values) {
            addCriterion("price_standard not in", values, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardBetween(String value1, String value2) {
            addCriterion("price_standard between", value1, value2, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andPriceStandardNotBetween(String value1, String value2) {
            addCriterion("price_standard not between", value1, value2, "priceStandard");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Double value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Double value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Double value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Double value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Double value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Double> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Double> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Double value1, Double value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Double value1, Double value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(Double value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(Double value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(Double value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(Double value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(Double value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<Double> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<Double> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(Double value1, Double value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(Double value1, Double value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}