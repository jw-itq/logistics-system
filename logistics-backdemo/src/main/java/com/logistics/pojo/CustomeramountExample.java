package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomeramountExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomeramountExample() {
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

        public Criteria andSendGoodsCustomerIsNull() {
            addCriterion("send_goods_customer is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerIsNotNull() {
            addCriterion("send_goods_customer is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerEqualTo(String value) {
            addCriterion("send_goods_customer =", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotEqualTo(String value) {
            addCriterion("send_goods_customer <>", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerGreaterThan(String value) {
            addCriterion("send_goods_customer >", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer >=", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLessThan(String value) {
            addCriterion("send_goods_customer <", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer <=", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerLike(String value) {
            addCriterion("send_goods_customer like", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotLike(String value) {
            addCriterion("send_goods_customer not like", value, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerIn(List<String> values) {
            addCriterion("send_goods_customer in", values, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotIn(List<String> values) {
            addCriterion("send_goods_customer not in", values, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerBetween(String value1, String value2) {
            addCriterion("send_goods_customer between", value1, value2, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer not between", value1, value2, "sendGoodsCustomer");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalIsNull() {
            addCriterion("carriage_total is null");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalIsNotNull() {
            addCriterion("carriage_total is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalEqualTo(Double value) {
            addCriterion("carriage_total =", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalNotEqualTo(Double value) {
            addCriterion("carriage_total <>", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalGreaterThan(Double value) {
            addCriterion("carriage_total >", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalGreaterThanOrEqualTo(Double value) {
            addCriterion("carriage_total >=", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalLessThan(Double value) {
            addCriterion("carriage_total <", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalLessThanOrEqualTo(Double value) {
            addCriterion("carriage_total <=", value, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalIn(List<Double> values) {
            addCriterion("carriage_total in", values, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalNotIn(List<Double> values) {
            addCriterion("carriage_total not in", values, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalBetween(Double value1, Double value2) {
            addCriterion("carriage_total between", value1, value2, "carriageTotal");
            return (Criteria) this;
        }

        public Criteria andCarriageTotalNotBetween(Double value1, Double value2) {
            addCriterion("carriage_total not between", value1, value2, "carriageTotal");
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

        public Criteria andPieceAmountTotalIsNull() {
            addCriterion("piece_amount_total is null");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalIsNotNull() {
            addCriterion("piece_amount_total is not null");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalEqualTo(Integer value) {
            addCriterion("piece_amount_total =", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalNotEqualTo(Integer value) {
            addCriterion("piece_amount_total <>", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalGreaterThan(Integer value) {
            addCriterion("piece_amount_total >", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalGreaterThanOrEqualTo(Integer value) {
            addCriterion("piece_amount_total >=", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalLessThan(Integer value) {
            addCriterion("piece_amount_total <", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalLessThanOrEqualTo(Integer value) {
            addCriterion("piece_amount_total <=", value, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalIn(List<Integer> values) {
            addCriterion("piece_amount_total in", values, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalNotIn(List<Integer> values) {
            addCriterion("piece_amount_total not in", values, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalBetween(Integer value1, Integer value2) {
            addCriterion("piece_amount_total between", value1, value2, "pieceAmountTotal");
            return (Criteria) this;
        }

        public Criteria andPieceAmountTotalNotBetween(Integer value1, Integer value2) {
            addCriterion("piece_amount_total not between", value1, value2, "pieceAmountTotal");
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