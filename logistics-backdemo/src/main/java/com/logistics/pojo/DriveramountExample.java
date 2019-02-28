package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class DriveramountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriveramountExample() {
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

        public Criteria andDriverCodeIsNull() {
            addCriterion("driver_code is null");
            return (Criteria) this;
        }

        public Criteria andDriverCodeIsNotNull() {
            addCriterion("driver_code is not null");
            return (Criteria) this;
        }

        public Criteria andDriverCodeEqualTo(String value) {
            addCriterion("driver_code =", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotEqualTo(String value) {
            addCriterion("driver_code <>", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeGreaterThan(String value) {
            addCriterion("driver_code >", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeGreaterThanOrEqualTo(String value) {
            addCriterion("driver_code >=", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLessThan(String value) {
            addCriterion("driver_code <", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLessThanOrEqualTo(String value) {
            addCriterion("driver_code <=", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeLike(String value) {
            addCriterion("driver_code like", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotLike(String value) {
            addCriterion("driver_code not like", value, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeIn(List<String> values) {
            addCriterion("driver_code in", values, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotIn(List<String> values) {
            addCriterion("driver_code not in", values, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeBetween(String value1, String value2) {
            addCriterion("driver_code between", value1, value2, "driverCode");
            return (Criteria) this;
        }

        public Criteria andDriverCodeNotBetween(String value1, String value2) {
            addCriterion("driver_code not between", value1, value2, "driverCode");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIsNull() {
            addCriterion("add_carriage_total is null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIsNotNull() {
            addCriterion("add_carriage_total is not null");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalEqualTo(Double value) {
            addCriterion("add_carriage_total =", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotEqualTo(Double value) {
            addCriterion("add_carriage_total <>", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalGreaterThan(Double value) {
            addCriterion("add_carriage_total >", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("add_carriage_total >=", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalLessThan(Double value) {
            addCriterion("add_carriage_total <", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalLessThanOrEqualTo(Double value) {
            addCriterion("add_carriage_total <=", value, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalIn(List<Double> values) {
            addCriterion("add_carriage_total in", values, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotIn(List<Double> values) {
            addCriterion("add_carriage_total not in", values, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalBetween(Double value1, Double value2) {
            addCriterion("add_carriage_total between", value1, value2, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andAddCarriageTotalNotBetween(Double value1, Double value2) {
            addCriterion("add_carriage_total not between", value1, value2, "addCarriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIsNull() {
            addCriterion("carry_fee_total is null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIsNotNull() {
            addCriterion("carry_fee_total is not null");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalEqualTo(Double value) {
            addCriterion("carry_fee_total =", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotEqualTo(Double value) {
            addCriterion("carry_fee_total <>", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalGreaterThan(Double value) {
            addCriterion("carry_fee_total >", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("carry_fee_total >=", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalLessThan(Double value) {
            addCriterion("carry_fee_total <", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalLessThanOrEqualTo(Double value) {
            addCriterion("carry_fee_total <=", value, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalIn(List<Double> values) {
            addCriterion("carry_fee_total in", values, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotIn(List<Double> values) {
            addCriterion("carry_fee_total not in", values, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalBetween(Double value1, Double value2) {
            addCriterion("carry_fee_total between", value1, value2, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andCarryFeeTotalNotBetween(Double value1, Double value2) {
            addCriterion("carry_fee_total not between", value1, value2, "carryFeeTotal");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Double value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Double value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Double value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Double value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Double value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Double> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Double> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Double value1, Double value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Double value1, Double value2) {
            addCriterion("total not between", value1, value2, "total");
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