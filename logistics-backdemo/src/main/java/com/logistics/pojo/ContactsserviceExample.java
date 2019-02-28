package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContactsserviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ContactsserviceExample() {
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

        public Criteria andBalanceIsNull() {
            addCriterion("balance is null");
            return (Criteria) this;
        }

        public Criteria andBalanceIsNotNull() {
            addCriterion("balance is not null");
            return (Criteria) this;
        }

        public Criteria andBalanceEqualTo(Double value) {
            addCriterion("balance =", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotEqualTo(Double value) {
            addCriterion("balance <>", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThan(Double value) {
            addCriterion("balance >", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceGreaterThanOrEqualTo(Double value) {
            addCriterion("balance >=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThan(Double value) {
            addCriterion("balance <", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceLessThanOrEqualTo(Double value) {
            addCriterion("balance <=", value, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceIn(List<Double> values) {
            addCriterion("balance in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotIn(List<Double> values) {
            addCriterion("balance not in", values, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceBetween(Double value1, Double value2) {
            addCriterion("balance between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBalanceNotBetween(Double value1, Double value2) {
            addCriterion("balance not between", value1, value2, "balance");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNull() {
            addCriterion("bill_money is null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIsNotNull() {
            addCriterion("bill_money is not null");
            return (Criteria) this;
        }

        public Criteria andBillMoneyEqualTo(Double value) {
            addCriterion("bill_money =", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotEqualTo(Double value) {
            addCriterion("bill_money <>", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThan(Double value) {
            addCriterion("bill_money >", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("bill_money >=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThan(Double value) {
            addCriterion("bill_money <", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyLessThanOrEqualTo(Double value) {
            addCriterion("bill_money <=", value, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyIn(List<Double> values) {
            addCriterion("bill_money in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotIn(List<Double> values) {
            addCriterion("bill_money not in", values, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyBetween(Double value1, Double value2) {
            addCriterion("bill_money between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andBillMoneyNotBetween(Double value1, Double value2) {
            addCriterion("bill_money not between", value1, value2, "billMoney");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNull() {
            addCriterion("carriage is null");
            return (Criteria) this;
        }

        public Criteria andCarriageIsNotNull() {
            addCriterion("carriage is not null");
            return (Criteria) this;
        }

        public Criteria andCarriageEqualTo(Double value) {
            addCriterion("carriage =", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotEqualTo(Double value) {
            addCriterion("carriage <>", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThan(Double value) {
            addCriterion("carriage >", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageGreaterThanOrEqualTo(Double value) {
            addCriterion("carriage >=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThan(Double value) {
            addCriterion("carriage <", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageLessThanOrEqualTo(Double value) {
            addCriterion("carriage <=", value, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageIn(List<Double> values) {
            addCriterion("carriage in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotIn(List<Double> values) {
            addCriterion("carriage not in", values, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageBetween(Double value1, Double value2) {
            addCriterion("carriage between", value1, value2, "carriage");
            return (Criteria) this;
        }

        public Criteria andCarriageNotBetween(Double value1, Double value2) {
            addCriterion("carriage not between", value1, value2, "carriage");
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

        public Criteria andInsuranceIsNull() {
            addCriterion("insurance is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceIsNotNull() {
            addCriterion("insurance is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceEqualTo(Double value) {
            addCriterion("insurance =", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotEqualTo(Double value) {
            addCriterion("insurance <>", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThan(Double value) {
            addCriterion("insurance >", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceGreaterThanOrEqualTo(Double value) {
            addCriterion("insurance >=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThan(Double value) {
            addCriterion("insurance <", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceLessThanOrEqualTo(Double value) {
            addCriterion("insurance <=", value, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceIn(List<Double> values) {
            addCriterion("insurance in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotIn(List<Double> values) {
            addCriterion("insurance not in", values, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceBetween(Double value1, Double value2) {
            addCriterion("insurance between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andInsuranceNotBetween(Double value1, Double value2) {
            addCriterion("insurance not between", value1, value2, "insurance");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableIsNull() {
            addCriterion("money_receivable is null");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableIsNotNull() {
            addCriterion("money_receivable is not null");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableEqualTo(Double value) {
            addCriterion("money_receivable =", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotEqualTo(Double value) {
            addCriterion("money_receivable <>", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableGreaterThan(Double value) {
            addCriterion("money_receivable >", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableGreaterThanOrEqualTo(Double value) {
            addCriterion("money_receivable >=", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableLessThan(Double value) {
            addCriterion("money_receivable <", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableLessThanOrEqualTo(Double value) {
            addCriterion("money_receivable <=", value, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableIn(List<Double> values) {
            addCriterion("money_receivable in", values, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotIn(List<Double> values) {
            addCriterion("money_receivable not in", values, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableBetween(Double value1, Double value2) {
            addCriterion("money_receivable between", value1, value2, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andMoneyReceivableNotBetween(Double value1, Double value2) {
            addCriterion("money_receivable not between", value1, value2, "moneyReceivable");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIsNull() {
            addCriterion("receive_goods_addr is null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIsNotNull() {
            addCriterion("receive_goods_addr is not null");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrEqualTo(String value) {
            addCriterion("receive_goods_addr =", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotEqualTo(String value) {
            addCriterion("receive_goods_addr <>", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrGreaterThan(String value) {
            addCriterion("receive_goods_addr >", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("receive_goods_addr >=", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLessThan(String value) {
            addCriterion("receive_goods_addr <", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLessThanOrEqualTo(String value) {
            addCriterion("receive_goods_addr <=", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrLike(String value) {
            addCriterion("receive_goods_addr like", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotLike(String value) {
            addCriterion("receive_goods_addr not like", value, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrIn(List<String> values) {
            addCriterion("receive_goods_addr in", values, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotIn(List<String> values) {
            addCriterion("receive_goods_addr not in", values, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrBetween(String value1, String value2) {
            addCriterion("receive_goods_addr between", value1, value2, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceiveGoodsAddrNotBetween(String value1, String value2) {
            addCriterion("receive_goods_addr not between", value1, value2, "receiveGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNull() {
            addCriterion("received_money is null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIsNotNull() {
            addCriterion("received_money is not null");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyEqualTo(Double value) {
            addCriterion("received_money =", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotEqualTo(Double value) {
            addCriterion("received_money <>", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThan(Double value) {
            addCriterion("received_money >", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyGreaterThanOrEqualTo(Double value) {
            addCriterion("received_money >=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThan(Double value) {
            addCriterion("received_money <", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyLessThanOrEqualTo(Double value) {
            addCriterion("received_money <=", value, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyIn(List<Double> values) {
            addCriterion("received_money in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotIn(List<Double> values) {
            addCriterion("received_money not in", values, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyBetween(Double value1, Double value2) {
            addCriterion("received_money between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andReceivedMoneyNotBetween(Double value1, Double value2) {
            addCriterion("received_money not between", value1, value2, "receivedMoney");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrIsNull() {
            addCriterion("send_goods_addr is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrIsNotNull() {
            addCriterion("send_goods_addr is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrEqualTo(String value) {
            addCriterion("send_goods_addr =", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotEqualTo(String value) {
            addCriterion("send_goods_addr <>", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrGreaterThan(String value) {
            addCriterion("send_goods_addr >", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrGreaterThanOrEqualTo(String value) {
            addCriterion("send_goods_addr >=", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLessThan(String value) {
            addCriterion("send_goods_addr <", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLessThanOrEqualTo(String value) {
            addCriterion("send_goods_addr <=", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrLike(String value) {
            addCriterion("send_goods_addr like", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotLike(String value) {
            addCriterion("send_goods_addr not like", value, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrIn(List<String> values) {
            addCriterion("send_goods_addr in", values, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotIn(List<String> values) {
            addCriterion("send_goods_addr not in", values, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrBetween(String value1, String value2) {
            addCriterion("send_goods_addr between", value1, value2, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsAddrNotBetween(String value1, String value2) {
            addCriterion("send_goods_addr not between", value1, value2, "sendGoodsAddr");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIsNull() {
            addCriterion("send_goods_date is null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIsNotNull() {
            addCriterion("send_goods_date is not null");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateEqualTo(Date value) {
            addCriterion("send_goods_date =", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotEqualTo(Date value) {
            addCriterion("send_goods_date <>", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateGreaterThan(Date value) {
            addCriterion("send_goods_date >", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateGreaterThanOrEqualTo(Date value) {
            addCriterion("send_goods_date >=", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateLessThan(Date value) {
            addCriterion("send_goods_date <", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateLessThanOrEqualTo(Date value) {
            addCriterion("send_goods_date <=", value, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateIn(List<Date> values) {
            addCriterion("send_goods_date in", values, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotIn(List<Date> values) {
            addCriterion("send_goods_date not in", values, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateBetween(Date value1, Date value2) {
            addCriterion("send_goods_date between", value1, value2, "sendGoodsDate");
            return (Criteria) this;
        }

        public Criteria andSendGoodsDateNotBetween(Date value1, Date value2) {
            addCriterion("send_goods_date not between", value1, value2, "sendGoodsDate");
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