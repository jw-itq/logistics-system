package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class CargoerrorExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CargoerrorExample() {
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

        public Criteria andCustomerIsNull() {
            addCriterion("customer is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIsNotNull() {
            addCriterion("customer is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerEqualTo(String value) {
            addCriterion("customer =", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotEqualTo(String value) {
            addCriterion("customer <>", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThan(String value) {
            addCriterion("customer >", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("customer >=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThan(String value) {
            addCriterion("customer <", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLessThanOrEqualTo(String value) {
            addCriterion("customer <=", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerLike(String value) {
            addCriterion("customer like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotLike(String value) {
            addCriterion("customer not like", value, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerIn(List<String> values) {
            addCriterion("customer in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotIn(List<String> values) {
            addCriterion("customer not in", values, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerBetween(String value1, String value2) {
            addCriterion("customer between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andCustomerNotBetween(String value1, String value2) {
            addCriterion("customer not between", value1, value2, "customer");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeIsNull() {
            addCriterion("goods_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeIsNotNull() {
            addCriterion("goods_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeEqualTo(String value) {
            addCriterion("goods_bill_code =", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotEqualTo(String value) {
            addCriterion("goods_bill_code <>", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeGreaterThan(String value) {
            addCriterion("goods_bill_code >", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_bill_code >=", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLessThan(String value) {
            addCriterion("goods_bill_code <", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_bill_code <=", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeLike(String value) {
            addCriterion("goods_bill_code like", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotLike(String value) {
            addCriterion("goods_bill_code not like", value, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeIn(List<String> values) {
            addCriterion("goods_bill_code in", values, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotIn(List<String> values) {
            addCriterion("goods_bill_code not in", values, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeBetween(String value1, String value2) {
            addCriterion("goods_bill_code between", value1, value2, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsBillCodeNotBetween(String value1, String value2) {
            addCriterion("goods_bill_code not between", value1, value2, "goodsBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNull() {
            addCriterion("goods_name is null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIsNotNull() {
            addCriterion("goods_name is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsNameEqualTo(String value) {
            addCriterion("goods_name =", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotEqualTo(String value) {
            addCriterion("goods_name <>", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThan(String value) {
            addCriterion("goods_name >", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameGreaterThanOrEqualTo(String value) {
            addCriterion("goods_name >=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThan(String value) {
            addCriterion("goods_name <", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLessThanOrEqualTo(String value) {
            addCriterion("goods_name <=", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameLike(String value) {
            addCriterion("goods_name like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotLike(String value) {
            addCriterion("goods_name not like", value, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameIn(List<String> values) {
            addCriterion("goods_name in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotIn(List<String> values) {
            addCriterion("goods_name not in", values, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameBetween(String value1, String value2) {
            addCriterion("goods_name between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsNameNotBetween(String value1, String value2) {
            addCriterion("goods_name not between", value1, value2, "goodsName");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeIsNull() {
            addCriterion("goods_revert_bill_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeIsNotNull() {
            addCriterion("goods_revert_bill_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeEqualTo(String value) {
            addCriterion("goods_revert_bill_code =", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotEqualTo(String value) {
            addCriterion("goods_revert_bill_code <>", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeGreaterThan(String value) {
            addCriterion("goods_revert_bill_code >", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_code >=", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLessThan(String value) {
            addCriterion("goods_revert_bill_code <", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_revert_bill_code <=", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeLike(String value) {
            addCriterion("goods_revert_bill_code like", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotLike(String value) {
            addCriterion("goods_revert_bill_code not like", value, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeIn(List<String> values) {
            addCriterion("goods_revert_bill_code in", values, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotIn(List<String> values) {
            addCriterion("goods_revert_bill_code not in", values, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_code between", value1, value2, "goodsRevertBillCode");
            return (Criteria) this;
        }

        public Criteria andGoodsRevertBillCodeNotBetween(String value1, String value2) {
            addCriterion("goods_revert_bill_code not between", value1, value2, "goodsRevertBillCode");
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

        public Criteria andMistakeTypeIsNull() {
            addCriterion("mistake_type is null");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeIsNotNull() {
            addCriterion("mistake_type is not null");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeEqualTo(String value) {
            addCriterion("mistake_type =", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeNotEqualTo(String value) {
            addCriterion("mistake_type <>", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeGreaterThan(String value) {
            addCriterion("mistake_type >", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mistake_type >=", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeLessThan(String value) {
            addCriterion("mistake_type <", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeLessThanOrEqualTo(String value) {
            addCriterion("mistake_type <=", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeLike(String value) {
            addCriterion("mistake_type like", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeNotLike(String value) {
            addCriterion("mistake_type not like", value, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeIn(List<String> values) {
            addCriterion("mistake_type in", values, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeNotIn(List<String> values) {
            addCriterion("mistake_type not in", values, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeBetween(String value1, String value2) {
            addCriterion("mistake_type between", value1, value2, "mistakeType");
            return (Criteria) this;
        }

        public Criteria andMistakeTypeNotBetween(String value1, String value2) {
            addCriterion("mistake_type not between", value1, value2, "mistakeType");
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

        public Criteria andSizeIsNull() {
            addCriterion("size is null");
            return (Criteria) this;
        }

        public Criteria andSizeIsNotNull() {
            addCriterion("size is not null");
            return (Criteria) this;
        }

        public Criteria andSizeEqualTo(String value) {
            addCriterion("size =", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotEqualTo(String value) {
            addCriterion("size <>", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThan(String value) {
            addCriterion("size >", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeGreaterThanOrEqualTo(String value) {
            addCriterion("size >=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThan(String value) {
            addCriterion("size <", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLessThanOrEqualTo(String value) {
            addCriterion("size <=", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeLike(String value) {
            addCriterion("size like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotLike(String value) {
            addCriterion("size not like", value, "size");
            return (Criteria) this;
        }

        public Criteria andSizeIn(List<String> values) {
            addCriterion("size in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotIn(List<String> values) {
            addCriterion("size not in", values, "size");
            return (Criteria) this;
        }

        public Criteria andSizeBetween(String value1, String value2) {
            addCriterion("size between", value1, value2, "size");
            return (Criteria) this;
        }

        public Criteria andSizeNotBetween(String value1, String value2) {
            addCriterion("size not between", value1, value2, "size");
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