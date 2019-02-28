package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class SentlistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SentlistExample() {
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

        public Criteria andBackCostIsNull() {
            addCriterion("back_cost is null");
            return (Criteria) this;
        }

        public Criteria andBackCostIsNotNull() {
            addCriterion("back_cost is not null");
            return (Criteria) this;
        }

        public Criteria andBackCostEqualTo(Double value) {
            addCriterion("back_cost =", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostNotEqualTo(Double value) {
            addCriterion("back_cost <>", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostGreaterThan(Double value) {
            addCriterion("back_cost >", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostGreaterThanOrEqualTo(Double value) {
            addCriterion("back_cost >=", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostLessThan(Double value) {
            addCriterion("back_cost <", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostLessThanOrEqualTo(Double value) {
            addCriterion("back_cost <=", value, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostIn(List<Double> values) {
            addCriterion("back_cost in", values, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostNotIn(List<Double> values) {
            addCriterion("back_cost not in", values, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostBetween(Double value1, Double value2) {
            addCriterion("back_cost between", value1, value2, "backCost");
            return (Criteria) this;
        }

        public Criteria andBackCostNotBetween(Double value1, Double value2) {
            addCriterion("back_cost not between", value1, value2, "backCost");
            return (Criteria) this;
        }

        public Criteria andCarCardNoIsNull() {
            addCriterion("car_card_no is null");
            return (Criteria) this;
        }

        public Criteria andCarCardNoIsNotNull() {
            addCriterion("car_card_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarCardNoEqualTo(String value) {
            addCriterion("car_card_no =", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoNotEqualTo(String value) {
            addCriterion("car_card_no <>", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoGreaterThan(String value) {
            addCriterion("car_card_no >", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_card_no >=", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoLessThan(String value) {
            addCriterion("car_card_no <", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoLessThanOrEqualTo(String value) {
            addCriterion("car_card_no <=", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoLike(String value) {
            addCriterion("car_card_no like", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoNotLike(String value) {
            addCriterion("car_card_no not like", value, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoIn(List<String> values) {
            addCriterion("car_card_no in", values, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoNotIn(List<String> values) {
            addCriterion("car_card_no not in", values, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoBetween(String value1, String value2) {
            addCriterion("car_card_no between", value1, value2, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCarCardNoNotBetween(String value1, String value2) {
            addCriterion("car_card_no not between", value1, value2, "carCardNo");
            return (Criteria) this;
        }

        public Criteria andCashPayIsNull() {
            addCriterion("cash_pay is null");
            return (Criteria) this;
        }

        public Criteria andCashPayIsNotNull() {
            addCriterion("cash_pay is not null");
            return (Criteria) this;
        }

        public Criteria andCashPayEqualTo(Double value) {
            addCriterion("cash_pay =", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayNotEqualTo(Double value) {
            addCriterion("cash_pay <>", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayGreaterThan(Double value) {
            addCriterion("cash_pay >", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayGreaterThanOrEqualTo(Double value) {
            addCriterion("cash_pay >=", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayLessThan(Double value) {
            addCriterion("cash_pay <", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayLessThanOrEqualTo(Double value) {
            addCriterion("cash_pay <=", value, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayIn(List<Double> values) {
            addCriterion("cash_pay in", values, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayNotIn(List<Double> values) {
            addCriterion("cash_pay not in", values, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayBetween(Double value1, Double value2) {
            addCriterion("cash_pay between", value1, value2, "cashPay");
            return (Criteria) this;
        }

        public Criteria andCashPayNotBetween(Double value1, Double value2) {
            addCriterion("cash_pay not between", value1, value2, "cashPay");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNull() {
            addCriterion("driver_name is null");
            return (Criteria) this;
        }

        public Criteria andDriverNameIsNotNull() {
            addCriterion("driver_name is not null");
            return (Criteria) this;
        }

        public Criteria andDriverNameEqualTo(String value) {
            addCriterion("driver_name =", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotEqualTo(String value) {
            addCriterion("driver_name <>", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThan(String value) {
            addCriterion("driver_name >", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameGreaterThanOrEqualTo(String value) {
            addCriterion("driver_name >=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThan(String value) {
            addCriterion("driver_name <", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLessThanOrEqualTo(String value) {
            addCriterion("driver_name <=", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameLike(String value) {
            addCriterion("driver_name like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotLike(String value) {
            addCriterion("driver_name not like", value, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameIn(List<String> values) {
            addCriterion("driver_name in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotIn(List<String> values) {
            addCriterion("driver_name not in", values, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameBetween(String value1, String value2) {
            addCriterion("driver_name between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andDriverNameNotBetween(String value1, String value2) {
            addCriterion("driver_name not between", value1, value2, "driverName");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNull() {
            addCriterion("goods_code is null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIsNotNull() {
            addCriterion("goods_code is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeEqualTo(String value) {
            addCriterion("goods_code =", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotEqualTo(String value) {
            addCriterion("goods_code <>", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThan(String value) {
            addCriterion("goods_code >", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeGreaterThanOrEqualTo(String value) {
            addCriterion("goods_code >=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThan(String value) {
            addCriterion("goods_code <", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLessThanOrEqualTo(String value) {
            addCriterion("goods_code <=", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeLike(String value) {
            addCriterion("goods_code like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotLike(String value) {
            addCriterion("goods_code not like", value, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeIn(List<String> values) {
            addCriterion("goods_code in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotIn(List<String> values) {
            addCriterion("goods_code not in", values, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeBetween(String value1, String value2) {
            addCriterion("goods_code between", value1, value2, "goodsCode");
            return (Criteria) this;
        }

        public Criteria andGoodsCodeNotBetween(String value1, String value2) {
            addCriterion("goods_code not between", value1, value2, "goodsCode");
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

        public Criteria andHelpAcceptFundIsNull() {
            addCriterion("help_accept_fund is null");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundIsNotNull() {
            addCriterion("help_accept_fund is not null");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundEqualTo(String value) {
            addCriterion("help_accept_fund =", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundNotEqualTo(String value) {
            addCriterion("help_accept_fund <>", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundGreaterThan(String value) {
            addCriterion("help_accept_fund >", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundGreaterThanOrEqualTo(String value) {
            addCriterion("help_accept_fund >=", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundLessThan(String value) {
            addCriterion("help_accept_fund <", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundLessThanOrEqualTo(String value) {
            addCriterion("help_accept_fund <=", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundLike(String value) {
            addCriterion("help_accept_fund like", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundNotLike(String value) {
            addCriterion("help_accept_fund not like", value, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundIn(List<String> values) {
            addCriterion("help_accept_fund in", values, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundNotIn(List<String> values) {
            addCriterion("help_accept_fund not in", values, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundBetween(String value1, String value2) {
            addCriterion("help_accept_fund between", value1, value2, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andHelpAcceptFundNotBetween(String value1, String value2) {
            addCriterion("help_accept_fund not between", value1, value2, "helpAcceptFund");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andPickupPayIsNull() {
            addCriterion("pickup_pay is null");
            return (Criteria) this;
        }

        public Criteria andPickupPayIsNotNull() {
            addCriterion("pickup_pay is not null");
            return (Criteria) this;
        }

        public Criteria andPickupPayEqualTo(Double value) {
            addCriterion("pickup_pay =", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayNotEqualTo(Double value) {
            addCriterion("pickup_pay <>", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayGreaterThan(Double value) {
            addCriterion("pickup_pay >", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayGreaterThanOrEqualTo(Double value) {
            addCriterion("pickup_pay >=", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayLessThan(Double value) {
            addCriterion("pickup_pay <", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayLessThanOrEqualTo(Double value) {
            addCriterion("pickup_pay <=", value, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayIn(List<Double> values) {
            addCriterion("pickup_pay in", values, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayNotIn(List<Double> values) {
            addCriterion("pickup_pay not in", values, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayBetween(Double value1, Double value2) {
            addCriterion("pickup_pay between", value1, value2, "pickupPay");
            return (Criteria) this;
        }

        public Criteria andPickupPayNotBetween(Double value1, Double value2) {
            addCriterion("pickup_pay not between", value1, value2, "pickupPay");
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

        public Criteria andRemarkIsNull() {
            addCriterion("remark is null");
            return (Criteria) this;
        }

        public Criteria andRemarkIsNotNull() {
            addCriterion("remark is not null");
            return (Criteria) this;
        }

        public Criteria andRemarkEqualTo(String value) {
            addCriterion("remark =", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotEqualTo(String value) {
            addCriterion("remark <>", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThan(String value) {
            addCriterion("remark >", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("remark >=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThan(String value) {
            addCriterion("remark <", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLessThanOrEqualTo(String value) {
            addCriterion("remark <=", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkLike(String value) {
            addCriterion("remark like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotLike(String value) {
            addCriterion("remark not like", value, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkIn(List<String> values) {
            addCriterion("remark in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotIn(List<String> values) {
            addCriterion("remark not in", values, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkBetween(String value1, String value2) {
            addCriterion("remark between", value1, value2, "remark");
            return (Criteria) this;
        }

        public Criteria andRemarkNotBetween(String value1, String value2) {
            addCriterion("remark not between", value1, value2, "remark");
            return (Criteria) this;
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

        public Criteria andSendGoodsCustomerTelIsNull() {
            addCriterion("send_goods_customer_tel is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelIsNotNull() {
            addCriterion("send_goods_customer_tel is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelEqualTo(String value) {
            addCriterion("send_goods_customer_tel =", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotEqualTo(String value) {
            addCriterion("send_goods_customer_tel <>", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelGreaterThan(String value) {
            addCriterion("send_goods_customer_tel >", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_tel >=", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLessThan(String value) {
            addCriterion("send_goods_customer_tel <", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLessThanOrEqualTo(String value) {
            addCriterion("send_goods_customer_tel <=", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelLike(String value) {
            addCriterion("send_goods_customer_tel like", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotLike(String value) {
            addCriterion("send_goods_customer_tel not like", value, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelIn(List<String> values) {
            addCriterion("send_goods_customer_tel in", values, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotIn(List<String> values) {
            addCriterion("send_goods_customer_tel not in", values, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelBetween(String value1, String value2) {
            addCriterion("send_goods_customer_tel between", value1, value2, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andSendGoodsCustomerTelNotBetween(String value1, String value2) {
            addCriterion("send_goods_customer_tel not between", value1, value2, "sendGoodsCustomerTel");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationIsNull() {
            addCriterion("transfer_destination is null");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationIsNotNull() {
            addCriterion("transfer_destination is not null");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationEqualTo(String value) {
            addCriterion("transfer_destination =", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationNotEqualTo(String value) {
            addCriterion("transfer_destination <>", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationGreaterThan(String value) {
            addCriterion("transfer_destination >", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_destination >=", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationLessThan(String value) {
            addCriterion("transfer_destination <", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationLessThanOrEqualTo(String value) {
            addCriterion("transfer_destination <=", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationLike(String value) {
            addCriterion("transfer_destination like", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationNotLike(String value) {
            addCriterion("transfer_destination not like", value, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationIn(List<String> values) {
            addCriterion("transfer_destination in", values, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationNotIn(List<String> values) {
            addCriterion("transfer_destination not in", values, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationBetween(String value1, String value2) {
            addCriterion("transfer_destination between", value1, value2, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andTransferDestinationNotBetween(String value1, String value2) {
            addCriterion("transfer_destination not between", value1, value2, "transferDestination");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
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