package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class LineoverallExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public LineoverallExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalIsNull() {
            addCriterion("all_carriage_total is null");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalIsNotNull() {
            addCriterion("all_carriage_total is not null");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalEqualTo(Double value) {
            addCriterion("all_carriage_total =", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalNotEqualTo(Double value) {
            addCriterion("all_carriage_total <>", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalGreaterThan(Double value) {
            addCriterion("all_carriage_total >", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("all_carriage_total >=", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalLessThan(Double value) {
            addCriterion("all_carriage_total <", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalLessThanOrEqualTo(Double value) {
            addCriterion("all_carriage_total <=", value, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalIn(List<Double> values) {
            addCriterion("all_carriage_total in", values, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalNotIn(List<Double> values) {
            addCriterion("all_carriage_total not in", values, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalBetween(Double value1, Double value2) {
            addCriterion("all_carriage_total between", value1, value2, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAllCarriageTotalNotBetween(Double value1, Double value2) {
            addCriterion("all_carriage_total not between", value1, value2, "allCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIsNull() {
            addCriterion("deal_goods_station is null");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIsNotNull() {
            addCriterion("deal_goods_station is not null");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationEqualTo(String value) {
            addCriterion("deal_goods_station =", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotEqualTo(String value) {
            addCriterion("deal_goods_station <>", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationGreaterThan(String value) {
            addCriterion("deal_goods_station >", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationGreaterThanOrEqualTo(String value) {
            addCriterion("deal_goods_station >=", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLessThan(String value) {
            addCriterion("deal_goods_station <", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLessThanOrEqualTo(String value) {
            addCriterion("deal_goods_station <=", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationLike(String value) {
            addCriterion("deal_goods_station like", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotLike(String value) {
            addCriterion("deal_goods_station not like", value, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationIn(List<String> values) {
            addCriterion("deal_goods_station in", values, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotIn(List<String> values) {
            addCriterion("deal_goods_station not in", values, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationBetween(String value1, String value2) {
            addCriterion("deal_goods_station between", value1, value2, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andDealGoodsStationNotBetween(String value1, String value2) {
            addCriterion("deal_goods_station not between", value1, value2, "dealGoodsStation");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalIsNull() {
            addCriterion("insurance_total is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalIsNotNull() {
            addCriterion("insurance_total is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalEqualTo(Double value) {
            addCriterion("insurance_total =", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalNotEqualTo(Double value) {
            addCriterion("insurance_total <>", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalGreaterThan(Double value) {
            addCriterion("insurance_total >", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance_total >=", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalLessThan(Double value) {
            addCriterion("insurance_total <", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalLessThanOrEqualTo(Double value) {
            addCriterion("insurance_total <=", value, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalIn(List<Double> values) {
            addCriterion("insurance_total in", values, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalNotIn(List<Double> values) {
            addCriterion("insurance_total not in", values, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalBetween(Double value1, Double value2) {
            addCriterion("insurance_total between", value1, value2, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andInsuranceTotalNotBetween(Double value1, Double value2) {
            addCriterion("insurance_total not between", value1, value2, "insuranceTotal");
            return (Criteria) this;
        }

        public Criteria andLoadStationIsNull() {
            addCriterion("load_station is null");
            return (Criteria) this;
        }

        public Criteria andLoadStationIsNotNull() {
            addCriterion("load_station is not null");
            return (Criteria) this;
        }

        public Criteria andLoadStationEqualTo(String value) {
            addCriterion("load_station =", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotEqualTo(String value) {
            addCriterion("load_station <>", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationGreaterThan(String value) {
            addCriterion("load_station >", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationGreaterThanOrEqualTo(String value) {
            addCriterion("load_station >=", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLessThan(String value) {
            addCriterion("load_station <", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLessThanOrEqualTo(String value) {
            addCriterion("load_station <=", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationLike(String value) {
            addCriterion("load_station like", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotLike(String value) {
            addCriterion("load_station not like", value, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationIn(List<String> values) {
            addCriterion("load_station in", values, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotIn(List<String> values) {
            addCriterion("load_station not in", values, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationBetween(String value1, String value2) {
            addCriterion("load_station between", value1, value2, "loadStation");
            return (Criteria) this;
        }

        public Criteria andLoadStationNotBetween(String value1, String value2) {
            addCriterion("load_station not between", value1, value2, "loadStation");
            return (Criteria) this;
        }

        public Criteria andTimesIsNull() {
            addCriterion("times is null");
            return (Criteria) this;
        }

        public Criteria andTimesIsNotNull() {
            addCriterion("times is not null");
            return (Criteria) this;
        }

        public Criteria andTimesEqualTo(Integer value) {
            addCriterion("times =", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotEqualTo(Integer value) {
            addCriterion("times <>", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThan(Integer value) {
            addCriterion("times >", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesGreaterThanOrEqualTo(Integer value) {
            addCriterion("times >=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThan(Integer value) {
            addCriterion("times <", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesLessThanOrEqualTo(Integer value) {
            addCriterion("times <=", value, "times");
            return (Criteria) this;
        }

        public Criteria andTimesIn(List<Integer> values) {
            addCriterion("times in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotIn(List<Integer> values) {
            addCriterion("times not in", values, "times");
            return (Criteria) this;
        }

        public Criteria andTimesBetween(Integer value1, Integer value2) {
            addCriterion("times between", value1, value2, "times");
            return (Criteria) this;
        }

        public Criteria andTimesNotBetween(Integer value1, Integer value2) {
            addCriterion("times not between", value1, value2, "times");
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