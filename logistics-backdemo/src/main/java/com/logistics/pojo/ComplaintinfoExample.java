package com.logistics.pojo;

import java.util.ArrayList;
import java.util.List;

public class ComplaintinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ComplaintinfoExample() {
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

        public Criteria andAppealContentIsNull() {
            addCriterion("appeal_content is null");
            return (Criteria) this;
        }

        public Criteria andAppealContentIsNotNull() {
            addCriterion("appeal_content is not null");
            return (Criteria) this;
        }

        public Criteria andAppealContentEqualTo(String value) {
            addCriterion("appeal_content =", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentNotEqualTo(String value) {
            addCriterion("appeal_content <>", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentGreaterThan(String value) {
            addCriterion("appeal_content >", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_content >=", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentLessThan(String value) {
            addCriterion("appeal_content <", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentLessThanOrEqualTo(String value) {
            addCriterion("appeal_content <=", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentLike(String value) {
            addCriterion("appeal_content like", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentNotLike(String value) {
            addCriterion("appeal_content not like", value, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentIn(List<String> values) {
            addCriterion("appeal_content in", values, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentNotIn(List<String> values) {
            addCriterion("appeal_content not in", values, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentBetween(String value1, String value2) {
            addCriterion("appeal_content between", value1, value2, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealContentNotBetween(String value1, String value2) {
            addCriterion("appeal_content not between", value1, value2, "appealContent");
            return (Criteria) this;
        }

        public Criteria andAppealDateIsNull() {
            addCriterion("appeal_date is null");
            return (Criteria) this;
        }

        public Criteria andAppealDateIsNotNull() {
            addCriterion("appeal_date is not null");
            return (Criteria) this;
        }

        public Criteria andAppealDateEqualTo(String value) {
            addCriterion("appeal_date =", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateNotEqualTo(String value) {
            addCriterion("appeal_date <>", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateGreaterThan(String value) {
            addCriterion("appeal_date >", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateGreaterThanOrEqualTo(String value) {
            addCriterion("appeal_date >=", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateLessThan(String value) {
            addCriterion("appeal_date <", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateLessThanOrEqualTo(String value) {
            addCriterion("appeal_date <=", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateLike(String value) {
            addCriterion("appeal_date like", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateNotLike(String value) {
            addCriterion("appeal_date not like", value, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateIn(List<String> values) {
            addCriterion("appeal_date in", values, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateNotIn(List<String> values) {
            addCriterion("appeal_date not in", values, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateBetween(String value1, String value2) {
            addCriterion("appeal_date between", value1, value2, "appealDate");
            return (Criteria) this;
        }

        public Criteria andAppealDateNotBetween(String value1, String value2) {
            addCriterion("appeal_date not between", value1, value2, "appealDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateIsNull() {
            addCriterion("call_back_date is null");
            return (Criteria) this;
        }

        public Criteria andCallBackDateIsNotNull() {
            addCriterion("call_back_date is not null");
            return (Criteria) this;
        }

        public Criteria andCallBackDateEqualTo(String value) {
            addCriterion("call_back_date =", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateNotEqualTo(String value) {
            addCriterion("call_back_date <>", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateGreaterThan(String value) {
            addCriterion("call_back_date >", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateGreaterThanOrEqualTo(String value) {
            addCriterion("call_back_date >=", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateLessThan(String value) {
            addCriterion("call_back_date <", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateLessThanOrEqualTo(String value) {
            addCriterion("call_back_date <=", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateLike(String value) {
            addCriterion("call_back_date like", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateNotLike(String value) {
            addCriterion("call_back_date not like", value, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateIn(List<String> values) {
            addCriterion("call_back_date in", values, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateNotIn(List<String> values) {
            addCriterion("call_back_date not in", values, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateBetween(String value1, String value2) {
            addCriterion("call_back_date between", value1, value2, "callBackDate");
            return (Criteria) this;
        }

        public Criteria andCallBackDateNotBetween(String value1, String value2) {
            addCriterion("call_back_date not between", value1, value2, "callBackDate");
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

        public Criteria andDealDateIsNull() {
            addCriterion("deal_date is null");
            return (Criteria) this;
        }

        public Criteria andDealDateIsNotNull() {
            addCriterion("deal_date is not null");
            return (Criteria) this;
        }

        public Criteria andDealDateEqualTo(String value) {
            addCriterion("deal_date =", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotEqualTo(String value) {
            addCriterion("deal_date <>", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThan(String value) {
            addCriterion("deal_date >", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateGreaterThanOrEqualTo(String value) {
            addCriterion("deal_date >=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThan(String value) {
            addCriterion("deal_date <", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLessThanOrEqualTo(String value) {
            addCriterion("deal_date <=", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateLike(String value) {
            addCriterion("deal_date like", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotLike(String value) {
            addCriterion("deal_date not like", value, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateIn(List<String> values) {
            addCriterion("deal_date in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotIn(List<String> values) {
            addCriterion("deal_date not in", values, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateBetween(String value1, String value2) {
            addCriterion("deal_date between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealDateNotBetween(String value1, String value2) {
            addCriterion("deal_date not between", value1, value2, "dealDate");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNull() {
            addCriterion("deal_person is null");
            return (Criteria) this;
        }

        public Criteria andDealPersonIsNotNull() {
            addCriterion("deal_person is not null");
            return (Criteria) this;
        }

        public Criteria andDealPersonEqualTo(String value) {
            addCriterion("deal_person =", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotEqualTo(String value) {
            addCriterion("deal_person <>", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThan(String value) {
            addCriterion("deal_person >", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonGreaterThanOrEqualTo(String value) {
            addCriterion("deal_person >=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThan(String value) {
            addCriterion("deal_person <", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLessThanOrEqualTo(String value) {
            addCriterion("deal_person <=", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonLike(String value) {
            addCriterion("deal_person like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotLike(String value) {
            addCriterion("deal_person not like", value, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonIn(List<String> values) {
            addCriterion("deal_person in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotIn(List<String> values) {
            addCriterion("deal_person not in", values, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonBetween(String value1, String value2) {
            addCriterion("deal_person between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealPersonNotBetween(String value1, String value2) {
            addCriterion("deal_person not between", value1, value2, "dealPerson");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNull() {
            addCriterion("deal_result is null");
            return (Criteria) this;
        }

        public Criteria andDealResultIsNotNull() {
            addCriterion("deal_result is not null");
            return (Criteria) this;
        }

        public Criteria andDealResultEqualTo(String value) {
            addCriterion("deal_result =", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotEqualTo(String value) {
            addCriterion("deal_result <>", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThan(String value) {
            addCriterion("deal_result >", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultGreaterThanOrEqualTo(String value) {
            addCriterion("deal_result >=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThan(String value) {
            addCriterion("deal_result <", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLessThanOrEqualTo(String value) {
            addCriterion("deal_result <=", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultLike(String value) {
            addCriterion("deal_result like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotLike(String value) {
            addCriterion("deal_result not like", value, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultIn(List<String> values) {
            addCriterion("deal_result in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotIn(List<String> values) {
            addCriterion("deal_result not in", values, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultBetween(String value1, String value2) {
            addCriterion("deal_result between", value1, value2, "dealResult");
            return (Criteria) this;
        }

        public Criteria andDealResultNotBetween(String value1, String value2) {
            addCriterion("deal_result not between", value1, value2, "dealResult");
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

        public Criteria andIfCallbackIsNull() {
            addCriterion("if_callback is null");
            return (Criteria) this;
        }

        public Criteria andIfCallbackIsNotNull() {
            addCriterion("if_callback is not null");
            return (Criteria) this;
        }

        public Criteria andIfCallbackEqualTo(Boolean value) {
            addCriterion("if_callback =", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackNotEqualTo(Boolean value) {
            addCriterion("if_callback <>", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackGreaterThan(Boolean value) {
            addCriterion("if_callback >", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_callback >=", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackLessThan(Boolean value) {
            addCriterion("if_callback <", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackLessThanOrEqualTo(Boolean value) {
            addCriterion("if_callback <=", value, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackIn(List<Boolean> values) {
            addCriterion("if_callback in", values, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackNotIn(List<Boolean> values) {
            addCriterion("if_callback not in", values, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackBetween(Boolean value1, Boolean value2) {
            addCriterion("if_callback between", value1, value2, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfCallbackNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_callback not between", value1, value2, "ifCallback");
            return (Criteria) this;
        }

        public Criteria andIfHandleIsNull() {
            addCriterion("if_handle is null");
            return (Criteria) this;
        }

        public Criteria andIfHandleIsNotNull() {
            addCriterion("if_handle is not null");
            return (Criteria) this;
        }

        public Criteria andIfHandleEqualTo(Boolean value) {
            addCriterion("if_handle =", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleNotEqualTo(Boolean value) {
            addCriterion("if_handle <>", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleGreaterThan(Boolean value) {
            addCriterion("if_handle >", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleGreaterThanOrEqualTo(Boolean value) {
            addCriterion("if_handle >=", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleLessThan(Boolean value) {
            addCriterion("if_handle <", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleLessThanOrEqualTo(Boolean value) {
            addCriterion("if_handle <=", value, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleIn(List<Boolean> values) {
            addCriterion("if_handle in", values, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleNotIn(List<Boolean> values) {
            addCriterion("if_handle not in", values, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleBetween(Boolean value1, Boolean value2) {
            addCriterion("if_handle between", value1, value2, "ifHandle");
            return (Criteria) this;
        }

        public Criteria andIfHandleNotBetween(Boolean value1, Boolean value2) {
            addCriterion("if_handle not between", value1, value2, "ifHandle");
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