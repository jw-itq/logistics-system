package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class ProxyfeeclearExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ProxyfeeclearExample() {
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

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
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

        public Criteria andAccountReceivableIsNull() {
            addCriterion("account_receivable is null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableIsNotNull() {
            addCriterion("account_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableEqualTo(Double value) {
            addCriterion("account_receivable =", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotEqualTo(Double value) {
            addCriterion("account_receivable <>", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableGreaterThan(Double value) {
            addCriterion("account_receivable >", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("account_receivable >=", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableLessThan(Double value) {
            addCriterion("account_receivable <", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableLessThanOrEqualTo(Double value) {
            addCriterion("account_receivable <=", value, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableIn(List<Double> values) {
            addCriterion("account_receivable in", values, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotIn(List<Double> values) {
            addCriterion("account_receivable not in", values, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableBetween(Double value1, Double value2) {
            addCriterion("account_receivable between", value1, value2, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andAccountReceivableNotBetween(Double value1, Double value2) {
            addCriterion("account_receivable not between", value1, value2, "accountReceivable");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNull() {
            addCriterion("balance_date is null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIsNotNull() {
            addCriterion("balance_date is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceDateEqualTo(Date value) {
            addCriterionForJDBCDate("balance_date =", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("balance_date <>", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThan(Date value) {
            addCriterionForJDBCDate("balance_date >", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("balance_date >=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThan(Date value) {
            addCriterionForJDBCDate("balance_date <", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("balance_date <=", value, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateIn(List<Date> values) {
            addCriterionForJDBCDate("balance_date in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("balance_date not in", values, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("balance_date between", value1, value2, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andBalanceDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("balance_date not between", value1, value2, "balanceDate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateIsNull() {
            addCriterion("commision_rate is null");
            return (Criteria) this;
        }

        public Criteria andCommisionRateIsNotNull() {
            addCriterion("commision_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCommisionRateEqualTo(Float value) {
            addCriterion("commision_rate =", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateNotEqualTo(Float value) {
            addCriterion("commision_rate <>", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateGreaterThan(Float value) {
            addCriterion("commision_rate >", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateGreaterThanOrEqualTo(Float value) {
            addCriterion("commision_rate >=", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateLessThan(Float value) {
            addCriterion("commision_rate <", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateLessThanOrEqualTo(Float value) {
            addCriterion("commision_rate <=", value, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateIn(List<Float> values) {
            addCriterion("commision_rate in", values, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateNotIn(List<Float> values) {
            addCriterion("commision_rate not in", values, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateBetween(Float value1, Float value2) {
            addCriterion("commision_rate between", value1, value2, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionRateNotBetween(Float value1, Float value2) {
            addCriterion("commision_rate not between", value1, value2, "commisionRate");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableIsNull() {
            addCriterion("commision_receivable is null");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableIsNotNull() {
            addCriterion("commision_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableEqualTo(Double value) {
            addCriterion("commision_receivable =", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableNotEqualTo(Double value) {
            addCriterion("commision_receivable <>", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableGreaterThan(Double value) {
            addCriterion("commision_receivable >", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("commision_receivable >=", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableLessThan(Double value) {
            addCriterion("commision_receivable <", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableLessThanOrEqualTo(Double value) {
            addCriterion("commision_receivable <=", value, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableIn(List<Double> values) {
            addCriterion("commision_receivable in", values, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableNotIn(List<Double> values) {
            addCriterion("commision_receivable not in", values, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableBetween(Double value1, Double value2) {
            addCriterion("commision_receivable between", value1, value2, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCommisionReceivableNotBetween(Double value1, Double value2) {
            addCriterion("commision_receivable not between", value1, value2, "commisionReceivable");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNull() {
            addCriterion("customer_code is null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIsNotNull() {
            addCriterion("customer_code is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeEqualTo(String value) {
            addCriterion("customer_code =", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotEqualTo(String value) {
            addCriterion("customer_code <>", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThan(String value) {
            addCriterion("customer_code >", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeGreaterThanOrEqualTo(String value) {
            addCriterion("customer_code >=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThan(String value) {
            addCriterion("customer_code <", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLessThanOrEqualTo(String value) {
            addCriterion("customer_code <=", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeLike(String value) {
            addCriterion("customer_code like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotLike(String value) {
            addCriterion("customer_code not like", value, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeIn(List<String> values) {
            addCriterion("customer_code in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotIn(List<String> values) {
            addCriterion("customer_code not in", values, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeBetween(String value1, String value2) {
            addCriterion("customer_code between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andCustomerCodeNotBetween(String value1, String value2) {
            addCriterion("customer_code not between", value1, value2, "customerCode");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundIsNull() {
            addCriterion("fact_receive_fund is null");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundIsNotNull() {
            addCriterion("fact_receive_fund is not null");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundEqualTo(Double value) {
            addCriterion("fact_receive_fund =", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundNotEqualTo(Double value) {
            addCriterion("fact_receive_fund <>", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundGreaterThan(Double value) {
            addCriterion("fact_receive_fund >", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundGreaterThanOrEqualTo(Double value) {
            addCriterion("fact_receive_fund >=", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundLessThan(Double value) {
            addCriterion("fact_receive_fund <", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundLessThanOrEqualTo(Double value) {
            addCriterion("fact_receive_fund <=", value, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundIn(List<Double> values) {
            addCriterion("fact_receive_fund in", values, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundNotIn(List<Double> values) {
            addCriterion("fact_receive_fund not in", values, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundBetween(Double value1, Double value2) {
            addCriterion("fact_receive_fund between", value1, value2, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andFactReceiveFundNotBetween(Double value1, Double value2) {
            addCriterion("fact_receive_fund not between", value1, value2, "factReceiveFund");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeIsNull() {
            addCriterion("goods_pay_change is null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeIsNotNull() {
            addCriterion("goods_pay_change is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeEqualTo(Double value) {
            addCriterion("goods_pay_change =", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeNotEqualTo(Double value) {
            addCriterion("goods_pay_change <>", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeGreaterThan(Double value) {
            addCriterion("goods_pay_change >", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeGreaterThanOrEqualTo(Double value) {
            addCriterion("goods_pay_change >=", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeLessThan(Double value) {
            addCriterion("goods_pay_change <", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeLessThanOrEqualTo(Double value) {
            addCriterion("goods_pay_change <=", value, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeIn(List<Double> values) {
            addCriterion("goods_pay_change in", values, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeNotIn(List<Double> values) {
            addCriterion("goods_pay_change not in", values, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeBetween(Double value1, Double value2) {
            addCriterion("goods_pay_change between", value1, value2, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andGoodsPayChangeNotBetween(Double value1, Double value2) {
            addCriterion("goods_pay_change not between", value1, value2, "goodsPayChange");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionIsNull() {
            addCriterion("received_commision is null");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionIsNotNull() {
            addCriterion("received_commision is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionEqualTo(Double value) {
            addCriterion("received_commision =", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionNotEqualTo(Double value) {
            addCriterion("received_commision <>", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionGreaterThan(Double value) {
            addCriterion("received_commision >", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionGreaterThanOrEqualTo(Double value) {
            addCriterion("received_commision >=", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionLessThan(Double value) {
            addCriterion("received_commision <", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionLessThanOrEqualTo(Double value) {
            addCriterion("received_commision <=", value, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionIn(List<Double> values) {
            addCriterion("received_commision in", values, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionNotIn(List<Double> values) {
            addCriterion("received_commision not in", values, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionBetween(Double value1, Double value2) {
            addCriterion("received_commision between", value1, value2, "receivedCommision");
            return (Criteria) this;
        }

        public Criteria andReceivedCommisionNotBetween(Double value1, Double value2) {
            addCriterion("received_commision not between", value1, value2, "receivedCommision");
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