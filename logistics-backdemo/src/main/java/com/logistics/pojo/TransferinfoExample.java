package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class TransferinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TransferinfoExample() {
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

        public Criteria andAfterTransferBillIsNull() {
            addCriterion("after_transfer_bill is null");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillIsNotNull() {
            addCriterion("after_transfer_bill is not null");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillEqualTo(String value) {
            addCriterion("after_transfer_bill =", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillNotEqualTo(String value) {
            addCriterion("after_transfer_bill <>", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillGreaterThan(String value) {
            addCriterion("after_transfer_bill >", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillGreaterThanOrEqualTo(String value) {
            addCriterion("after_transfer_bill >=", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillLessThan(String value) {
            addCriterion("after_transfer_bill <", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillLessThanOrEqualTo(String value) {
            addCriterion("after_transfer_bill <=", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillLike(String value) {
            addCriterion("after_transfer_bill like", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillNotLike(String value) {
            addCriterion("after_transfer_bill not like", value, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillIn(List<String> values) {
            addCriterion("after_transfer_bill in", values, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillNotIn(List<String> values) {
            addCriterion("after_transfer_bill not in", values, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillBetween(String value1, String value2) {
            addCriterion("after_transfer_bill between", value1, value2, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andAfterTransferBillNotBetween(String value1, String value2) {
            addCriterion("after_transfer_bill not between", value1, value2, "afterTransferBill");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Date value) {
            addCriterionForJDBCDate("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Date value) {
            addCriterionForJDBCDate("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Date value) {
            addCriterionForJDBCDate("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Date> values) {
            addCriterionForJDBCDate("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Date> values) {
            addCriterionForJDBCDate("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("check_time not between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
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

        public Criteria andTransferAddrIsNull() {
            addCriterion("transfer_addr is null");
            return (Criteria) this;
        }

        public Criteria andTransferAddrIsNotNull() {
            addCriterion("transfer_addr is not null");
            return (Criteria) this;
        }

        public Criteria andTransferAddrEqualTo(String value) {
            addCriterion("transfer_addr =", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrNotEqualTo(String value) {
            addCriterion("transfer_addr <>", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrGreaterThan(String value) {
            addCriterion("transfer_addr >", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_addr >=", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrLessThan(String value) {
            addCriterion("transfer_addr <", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrLessThanOrEqualTo(String value) {
            addCriterion("transfer_addr <=", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrLike(String value) {
            addCriterion("transfer_addr like", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrNotLike(String value) {
            addCriterion("transfer_addr not like", value, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrIn(List<String> values) {
            addCriterion("transfer_addr in", values, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrNotIn(List<String> values) {
            addCriterion("transfer_addr not in", values, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrBetween(String value1, String value2) {
            addCriterion("transfer_addr between", value1, value2, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferAddrNotBetween(String value1, String value2) {
            addCriterion("transfer_addr not between", value1, value2, "transferAddr");
            return (Criteria) this;
        }

        public Criteria andTransferCheckIsNull() {
            addCriterion("transfer_check is null");
            return (Criteria) this;
        }

        public Criteria andTransferCheckIsNotNull() {
            addCriterion("transfer_check is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCheckEqualTo(String value) {
            addCriterion("transfer_check =", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckNotEqualTo(String value) {
            addCriterion("transfer_check <>", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckGreaterThan(String value) {
            addCriterion("transfer_check >", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_check >=", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckLessThan(String value) {
            addCriterion("transfer_check <", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckLessThanOrEqualTo(String value) {
            addCriterion("transfer_check <=", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckLike(String value) {
            addCriterion("transfer_check like", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckNotLike(String value) {
            addCriterion("transfer_check not like", value, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckIn(List<String> values) {
            addCriterion("transfer_check in", values, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckNotIn(List<String> values) {
            addCriterion("transfer_check not in", values, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckBetween(String value1, String value2) {
            addCriterion("transfer_check between", value1, value2, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCheckNotBetween(String value1, String value2) {
            addCriterion("transfer_check not between", value1, value2, "transferCheck");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyIsNull() {
            addCriterion("transfer_company is null");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyIsNotNull() {
            addCriterion("transfer_company is not null");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyEqualTo(String value) {
            addCriterion("transfer_company =", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyNotEqualTo(String value) {
            addCriterion("transfer_company <>", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyGreaterThan(String value) {
            addCriterion("transfer_company >", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_company >=", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyLessThan(String value) {
            addCriterion("transfer_company <", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyLessThanOrEqualTo(String value) {
            addCriterion("transfer_company <=", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyLike(String value) {
            addCriterion("transfer_company like", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyNotLike(String value) {
            addCriterion("transfer_company not like", value, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyIn(List<String> values) {
            addCriterion("transfer_company in", values, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyNotIn(List<String> values) {
            addCriterion("transfer_company not in", values, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyBetween(String value1, String value2) {
            addCriterion("transfer_company between", value1, value2, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferCompanyNotBetween(String value1, String value2) {
            addCriterion("transfer_company not between", value1, value2, "transferCompany");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNull() {
            addCriterion("transfer_fee is null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIsNotNull() {
            addCriterion("transfer_fee is not null");
            return (Criteria) this;
        }

        public Criteria andTransferFeeEqualTo(Double value) {
            addCriterion("transfer_fee =", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotEqualTo(Double value) {
            addCriterion("transfer_fee <>", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThan(Double value) {
            addCriterion("transfer_fee >", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeGreaterThanOrEqualTo(Double value) {
            addCriterion("transfer_fee >=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThan(Double value) {
            addCriterion("transfer_fee <", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeLessThanOrEqualTo(Double value) {
            addCriterion("transfer_fee <=", value, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeIn(List<Double> values) {
            addCriterion("transfer_fee in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotIn(List<Double> values) {
            addCriterion("transfer_fee not in", values, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeBetween(Double value1, Double value2) {
            addCriterion("transfer_fee between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferFeeNotBetween(Double value1, Double value2) {
            addCriterion("transfer_fee not between", value1, value2, "transferFee");
            return (Criteria) this;
        }

        public Criteria andTransferStationIsNull() {
            addCriterion("transfer_station is null");
            return (Criteria) this;
        }

        public Criteria andTransferStationIsNotNull() {
            addCriterion("transfer_station is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStationEqualTo(String value) {
            addCriterion("transfer_station =", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotEqualTo(String value) {
            addCriterion("transfer_station <>", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationGreaterThan(String value) {
            addCriterion("transfer_station >", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_station >=", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLessThan(String value) {
            addCriterion("transfer_station <", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLessThanOrEqualTo(String value) {
            addCriterion("transfer_station <=", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationLike(String value) {
            addCriterion("transfer_station like", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotLike(String value) {
            addCriterion("transfer_station not like", value, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationIn(List<String> values) {
            addCriterion("transfer_station in", values, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotIn(List<String> values) {
            addCriterion("transfer_station not in", values, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationBetween(String value1, String value2) {
            addCriterion("transfer_station between", value1, value2, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationNotBetween(String value1, String value2) {
            addCriterion("transfer_station not between", value1, value2, "transferStation");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelIsNull() {
            addCriterion("transfer_station_tel is null");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelIsNotNull() {
            addCriterion("transfer_station_tel is not null");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelEqualTo(String value) {
            addCriterion("transfer_station_tel =", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelNotEqualTo(String value) {
            addCriterion("transfer_station_tel <>", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelGreaterThan(String value) {
            addCriterion("transfer_station_tel >", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelGreaterThanOrEqualTo(String value) {
            addCriterion("transfer_station_tel >=", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelLessThan(String value) {
            addCriterion("transfer_station_tel <", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelLessThanOrEqualTo(String value) {
            addCriterion("transfer_station_tel <=", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelLike(String value) {
            addCriterion("transfer_station_tel like", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelNotLike(String value) {
            addCriterion("transfer_station_tel not like", value, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelIn(List<String> values) {
            addCriterion("transfer_station_tel in", values, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelNotIn(List<String> values) {
            addCriterion("transfer_station_tel not in", values, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelBetween(String value1, String value2) {
            addCriterion("transfer_station_tel between", value1, value2, "transferStationTel");
            return (Criteria) this;
        }

        public Criteria andTransferStationTelNotBetween(String value1, String value2) {
            addCriterion("transfer_station_tel not between", value1, value2, "transferStationTel");
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