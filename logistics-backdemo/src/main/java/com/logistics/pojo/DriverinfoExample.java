package com.logistics.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class DriverinfoExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DriverinfoExample() {
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

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeIsNull() {
            addCriterion("allow_carry_volume is null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeIsNotNull() {
            addCriterion("allow_carry_volume is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeEqualTo(Double value) {
            addCriterion("allow_carry_volume =", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeNotEqualTo(Double value) {
            addCriterion("allow_carry_volume <>", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeGreaterThan(Double value) {
            addCriterion("allow_carry_volume >", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeGreaterThanOrEqualTo(Double value) {
            addCriterion("allow_carry_volume >=", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeLessThan(Double value) {
            addCriterion("allow_carry_volume <", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeLessThanOrEqualTo(Double value) {
            addCriterion("allow_carry_volume <=", value, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeIn(List<Double> values) {
            addCriterion("allow_carry_volume in", values, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeNotIn(List<Double> values) {
            addCriterion("allow_carry_volume not in", values, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeBetween(Double value1, Double value2) {
            addCriterion("allow_carry_volume between", value1, value2, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryVolumeNotBetween(Double value1, Double value2) {
            addCriterion("allow_carry_volume not between", value1, value2, "allowCarryVolume");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIsNull() {
            addCriterion("allow_carry_weight is null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIsNotNull() {
            addCriterion("allow_carry_weight is not null");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightEqualTo(Double value) {
            addCriterion("allow_carry_weight =", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotEqualTo(Double value) {
            addCriterion("allow_carry_weight <>", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightGreaterThan(Double value) {
            addCriterion("allow_carry_weight >", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("allow_carry_weight >=", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightLessThan(Double value) {
            addCriterion("allow_carry_weight <", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightLessThanOrEqualTo(Double value) {
            addCriterion("allow_carry_weight <=", value, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightIn(List<Double> values) {
            addCriterion("allow_carry_weight in", values, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotIn(List<Double> values) {
            addCriterion("allow_carry_weight not in", values, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightBetween(Double value1, Double value2) {
            addCriterion("allow_carry_weight between", value1, value2, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andAllowCarryWeightNotBetween(Double value1, Double value2) {
            addCriterion("allow_carry_weight not between", value1, value2, "allowCarryWeight");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNull() {
            addCriterion("birthday is null");
            return (Criteria) this;
        }

        public Criteria andBirthdayIsNotNull() {
            addCriterion("birthday is not null");
            return (Criteria) this;
        }

        public Criteria andBirthdayEqualTo(Date value) {
            addCriterionForJDBCDate("birthday =", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <>", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThan(Date value) {
            addCriterionForJDBCDate("birthday >", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday >=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThan(Date value) {
            addCriterionForJDBCDate("birthday <", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("birthday <=", value, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayIn(List<Date> values) {
            addCriterionForJDBCDate("birthday in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotIn(List<Date> values) {
            addCriterionForJDBCDate("birthday not in", values, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBirthdayNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("birthday not between", value1, value2, "birthday");
            return (Criteria) this;
        }

        public Criteria andBizLicenceIsNull() {
            addCriterion("biz_licence is null");
            return (Criteria) this;
        }

        public Criteria andBizLicenceIsNotNull() {
            addCriterion("biz_licence is not null");
            return (Criteria) this;
        }

        public Criteria andBizLicenceEqualTo(String value) {
            addCriterion("biz_licence =", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceNotEqualTo(String value) {
            addCriterion("biz_licence <>", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceGreaterThan(String value) {
            addCriterion("biz_licence >", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("biz_licence >=", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceLessThan(String value) {
            addCriterion("biz_licence <", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceLessThanOrEqualTo(String value) {
            addCriterion("biz_licence <=", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceLike(String value) {
            addCriterion("biz_licence like", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceNotLike(String value) {
            addCriterion("biz_licence not like", value, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceIn(List<String> values) {
            addCriterion("biz_licence in", values, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceNotIn(List<String> values) {
            addCriterion("biz_licence not in", values, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceBetween(String value1, String value2) {
            addCriterion("biz_licence between", value1, value2, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andBizLicenceNotBetween(String value1, String value2) {
            addCriterion("biz_licence not between", value1, value2, "bizLicence");
            return (Criteria) this;
        }

        public Criteria andCarDeptIsNull() {
            addCriterion("car_dept is null");
            return (Criteria) this;
        }

        public Criteria andCarDeptIsNotNull() {
            addCriterion("car_dept is not null");
            return (Criteria) this;
        }

        public Criteria andCarDeptEqualTo(String value) {
            addCriterion("car_dept =", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptNotEqualTo(String value) {
            addCriterion("car_dept <>", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptGreaterThan(String value) {
            addCriterion("car_dept >", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptGreaterThanOrEqualTo(String value) {
            addCriterion("car_dept >=", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptLessThan(String value) {
            addCriterion("car_dept <", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptLessThanOrEqualTo(String value) {
            addCriterion("car_dept <=", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptLike(String value) {
            addCriterion("car_dept like", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptNotLike(String value) {
            addCriterion("car_dept not like", value, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptIn(List<String> values) {
            addCriterion("car_dept in", values, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptNotIn(List<String> values) {
            addCriterion("car_dept not in", values, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptBetween(String value1, String value2) {
            addCriterion("car_dept between", value1, value2, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptNotBetween(String value1, String value2) {
            addCriterion("car_dept not between", value1, value2, "carDept");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelIsNull() {
            addCriterion("car_dept_tel is null");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelIsNotNull() {
            addCriterion("car_dept_tel is not null");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelEqualTo(String value) {
            addCriterion("car_dept_tel =", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelNotEqualTo(String value) {
            addCriterion("car_dept_tel <>", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelGreaterThan(String value) {
            addCriterion("car_dept_tel >", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelGreaterThanOrEqualTo(String value) {
            addCriterion("car_dept_tel >=", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelLessThan(String value) {
            addCriterion("car_dept_tel <", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelLessThanOrEqualTo(String value) {
            addCriterion("car_dept_tel <=", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelLike(String value) {
            addCriterion("car_dept_tel like", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelNotLike(String value) {
            addCriterion("car_dept_tel not like", value, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelIn(List<String> values) {
            addCriterion("car_dept_tel in", values, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelNotIn(List<String> values) {
            addCriterion("car_dept_tel not in", values, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelBetween(String value1, String value2) {
            addCriterion("car_dept_tel between", value1, value2, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarDeptTelNotBetween(String value1, String value2) {
            addCriterion("car_dept_tel not between", value1, value2, "carDeptTel");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIsNull() {
            addCriterion("car_frame_no is null");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIsNotNull() {
            addCriterion("car_frame_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoEqualTo(String value) {
            addCriterion("car_frame_no =", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotEqualTo(String value) {
            addCriterion("car_frame_no <>", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoGreaterThan(String value) {
            addCriterion("car_frame_no >", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_frame_no >=", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLessThan(String value) {
            addCriterion("car_frame_no <", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLessThanOrEqualTo(String value) {
            addCriterion("car_frame_no <=", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoLike(String value) {
            addCriterion("car_frame_no like", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotLike(String value) {
            addCriterion("car_frame_no not like", value, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoIn(List<String> values) {
            addCriterion("car_frame_no in", values, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotIn(List<String> values) {
            addCriterion("car_frame_no not in", values, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoBetween(String value1, String value2) {
            addCriterion("car_frame_no between", value1, value2, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarFrameNoNotBetween(String value1, String value2) {
            addCriterion("car_frame_no not between", value1, value2, "carFrameNo");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNull() {
            addCriterion("car_length is null");
            return (Criteria) this;
        }

        public Criteria andCarLengthIsNotNull() {
            addCriterion("car_length is not null");
            return (Criteria) this;
        }

        public Criteria andCarLengthEqualTo(String value) {
            addCriterion("car_length =", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotEqualTo(String value) {
            addCriterion("car_length <>", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThan(String value) {
            addCriterion("car_length >", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthGreaterThanOrEqualTo(String value) {
            addCriterion("car_length >=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThan(String value) {
            addCriterion("car_length <", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLessThanOrEqualTo(String value) {
            addCriterion("car_length <=", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthLike(String value) {
            addCriterion("car_length like", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotLike(String value) {
            addCriterion("car_length not like", value, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthIn(List<String> values) {
            addCriterion("car_length in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotIn(List<String> values) {
            addCriterion("car_length not in", values, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthBetween(String value1, String value2) {
            addCriterion("car_length between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarLengthNotBetween(String value1, String value2) {
            addCriterion("car_length not between", value1, value2, "carLength");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNull() {
            addCriterion("car_no is null");
            return (Criteria) this;
        }

        public Criteria andCarNoIsNotNull() {
            addCriterion("car_no is not null");
            return (Criteria) this;
        }

        public Criteria andCarNoEqualTo(String value) {
            addCriterion("car_no =", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotEqualTo(String value) {
            addCriterion("car_no <>", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThan(String value) {
            addCriterion("car_no >", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoGreaterThanOrEqualTo(String value) {
            addCriterion("car_no >=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThan(String value) {
            addCriterion("car_no <", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLessThanOrEqualTo(String value) {
            addCriterion("car_no <=", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoLike(String value) {
            addCriterion("car_no like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotLike(String value) {
            addCriterion("car_no not like", value, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoIn(List<String> values) {
            addCriterion("car_no in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotIn(List<String> values) {
            addCriterion("car_no not in", values, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoBetween(String value1, String value2) {
            addCriterion("car_no between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarNoNotBetween(String value1, String value2) {
            addCriterion("car_no not between", value1, value2, "carNo");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNull() {
            addCriterion("car_type is null");
            return (Criteria) this;
        }

        public Criteria andCarTypeIsNotNull() {
            addCriterion("car_type is not null");
            return (Criteria) this;
        }

        public Criteria andCarTypeEqualTo(String value) {
            addCriterion("car_type =", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotEqualTo(String value) {
            addCriterion("car_type <>", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThan(String value) {
            addCriterion("car_type >", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("car_type >=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThan(String value) {
            addCriterion("car_type <", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLessThanOrEqualTo(String value) {
            addCriterion("car_type <=", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeLike(String value) {
            addCriterion("car_type like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotLike(String value) {
            addCriterion("car_type not like", value, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeIn(List<String> values) {
            addCriterion("car_type in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotIn(List<String> values) {
            addCriterion("car_type not in", values, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeBetween(String value1, String value2) {
            addCriterion("car_type between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarTypeNotBetween(String value1, String value2) {
            addCriterion("car_type not between", value1, value2, "carType");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNull() {
            addCriterion("car_width is null");
            return (Criteria) this;
        }

        public Criteria andCarWidthIsNotNull() {
            addCriterion("car_width is not null");
            return (Criteria) this;
        }

        public Criteria andCarWidthEqualTo(String value) {
            addCriterion("car_width =", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotEqualTo(String value) {
            addCriterion("car_width <>", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThan(String value) {
            addCriterion("car_width >", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthGreaterThanOrEqualTo(String value) {
            addCriterion("car_width >=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThan(String value) {
            addCriterion("car_width <", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLessThanOrEqualTo(String value) {
            addCriterion("car_width <=", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthLike(String value) {
            addCriterion("car_width like", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotLike(String value) {
            addCriterion("car_width not like", value, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthIn(List<String> values) {
            addCriterion("car_width in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotIn(List<String> values) {
            addCriterion("car_width not in", values, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthBetween(String value1, String value2) {
            addCriterion("car_width between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCarWidthNotBetween(String value1, String value2) {
            addCriterion("car_width not between", value1, value2, "carWidth");
            return (Criteria) this;
        }

        public Criteria andCompanyCarIsNull() {
            addCriterion("company_car is null");
            return (Criteria) this;
        }

        public Criteria andCompanyCarIsNotNull() {
            addCriterion("company_car is not null");
            return (Criteria) this;
        }

        public Criteria andCompanyCarEqualTo(Boolean value) {
            addCriterion("company_car =", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarNotEqualTo(Boolean value) {
            addCriterion("company_car <>", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarGreaterThan(Boolean value) {
            addCriterion("company_car >", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarGreaterThanOrEqualTo(Boolean value) {
            addCriterion("company_car >=", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarLessThan(Boolean value) {
            addCriterion("company_car <", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarLessThanOrEqualTo(Boolean value) {
            addCriterion("company_car <=", value, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarIn(List<Boolean> values) {
            addCriterion("company_car in", values, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarNotIn(List<Boolean> values) {
            addCriterion("company_car not in", values, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarBetween(Boolean value1, Boolean value2) {
            addCriterion("company_car between", value1, value2, "companyCar");
            return (Criteria) this;
        }

        public Criteria andCompanyCarNotBetween(Boolean value1, Boolean value2) {
            addCriterion("company_car not between", value1, value2, "companyCar");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceIsNull() {
            addCriterion("drive_licence is null");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceIsNotNull() {
            addCriterion("drive_licence is not null");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceEqualTo(String value) {
            addCriterion("drive_licence =", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceNotEqualTo(String value) {
            addCriterion("drive_licence <>", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceGreaterThan(String value) {
            addCriterion("drive_licence >", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("drive_licence >=", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceLessThan(String value) {
            addCriterion("drive_licence <", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceLessThanOrEqualTo(String value) {
            addCriterion("drive_licence <=", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceLike(String value) {
            addCriterion("drive_licence like", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceNotLike(String value) {
            addCriterion("drive_licence not like", value, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceIn(List<String> values) {
            addCriterion("drive_licence in", values, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceNotIn(List<String> values) {
            addCriterion("drive_licence not in", values, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceBetween(String value1, String value2) {
            addCriterion("drive_licence between", value1, value2, "driveLicence");
            return (Criteria) this;
        }

        public Criteria andDriveLicenceNotBetween(String value1, String value2) {
            addCriterion("drive_licence not between", value1, value2, "driveLicence");
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

        public Criteria andEngineNoIsNull() {
            addCriterion("engine_no is null");
            return (Criteria) this;
        }

        public Criteria andEngineNoIsNotNull() {
            addCriterion("engine_no is not null");
            return (Criteria) this;
        }

        public Criteria andEngineNoEqualTo(String value) {
            addCriterion("engine_no =", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotEqualTo(String value) {
            addCriterion("engine_no <>", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThan(String value) {
            addCriterion("engine_no >", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoGreaterThanOrEqualTo(String value) {
            addCriterion("engine_no >=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThan(String value) {
            addCriterion("engine_no <", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLessThanOrEqualTo(String value) {
            addCriterion("engine_no <=", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoLike(String value) {
            addCriterion("engine_no like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotLike(String value) {
            addCriterion("engine_no not like", value, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoIn(List<String> values) {
            addCriterion("engine_no in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotIn(List<String> values) {
            addCriterion("engine_no not in", values, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoBetween(String value1, String value2) {
            addCriterion("engine_no between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andEngineNoNotBetween(String value1, String value2) {
            addCriterion("engine_no not between", value1, value2, "engineNo");
            return (Criteria) this;
        }

        public Criteria andGenderIsNull() {
            addCriterion("gender is null");
            return (Criteria) this;
        }

        public Criteria andGenderIsNotNull() {
            addCriterion("gender is not null");
            return (Criteria) this;
        }

        public Criteria andGenderEqualTo(String value) {
            addCriterion("gender =", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotEqualTo(String value) {
            addCriterion("gender <>", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThan(String value) {
            addCriterion("gender >", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderGreaterThanOrEqualTo(String value) {
            addCriterion("gender >=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThan(String value) {
            addCriterion("gender <", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLessThanOrEqualTo(String value) {
            addCriterion("gender <=", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderLike(String value) {
            addCriterion("gender like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotLike(String value) {
            addCriterion("gender not like", value, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderIn(List<String> values) {
            addCriterion("gender in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotIn(List<String> values) {
            addCriterion("gender not in", values, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderBetween(String value1, String value2) {
            addCriterion("gender between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGenderNotBetween(String value1, String value2) {
            addCriterion("gender not between", value1, value2, "gender");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNull() {
            addCriterion("goods_height is null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIsNotNull() {
            addCriterion("goods_height is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightEqualTo(String value) {
            addCriterion("goods_height =", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotEqualTo(String value) {
            addCriterion("goods_height <>", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThan(String value) {
            addCriterion("goods_height >", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightGreaterThanOrEqualTo(String value) {
            addCriterion("goods_height >=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThan(String value) {
            addCriterion("goods_height <", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLessThanOrEqualTo(String value) {
            addCriterion("goods_height <=", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightLike(String value) {
            addCriterion("goods_height like", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotLike(String value) {
            addCriterion("goods_height not like", value, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightIn(List<String> values) {
            addCriterion("goods_height in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotIn(List<String> values) {
            addCriterion("goods_height not in", values, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightBetween(String value1, String value2) {
            addCriterion("goods_height between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andGoodsHeightNotBetween(String value1, String value2) {
            addCriterion("goods_height not between", value1, value2, "goodsHeight");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNull() {
            addCriterion("id_card is null");
            return (Criteria) this;
        }

        public Criteria andIdCardIsNotNull() {
            addCriterion("id_card is not null");
            return (Criteria) this;
        }

        public Criteria andIdCardEqualTo(String value) {
            addCriterion("id_card =", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotEqualTo(String value) {
            addCriterion("id_card <>", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThan(String value) {
            addCriterion("id_card >", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("id_card >=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThan(String value) {
            addCriterion("id_card <", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLessThanOrEqualTo(String value) {
            addCriterion("id_card <=", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardLike(String value) {
            addCriterion("id_card like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotLike(String value) {
            addCriterion("id_card not like", value, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardIn(List<String> values) {
            addCriterion("id_card in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotIn(List<String> values) {
            addCriterion("id_card not in", values, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardBetween(String value1, String value2) {
            addCriterion("id_card between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andIdCardNotBetween(String value1, String value2) {
            addCriterion("id_card not between", value1, value2, "idCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardIsNull() {
            addCriterion("insurance_card is null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardIsNotNull() {
            addCriterion("insurance_card is not null");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardEqualTo(String value) {
            addCriterion("insurance_card =", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardNotEqualTo(String value) {
            addCriterion("insurance_card <>", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardGreaterThan(String value) {
            addCriterion("insurance_card >", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardGreaterThanOrEqualTo(String value) {
            addCriterion("insurance_card >=", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardLessThan(String value) {
            addCriterion("insurance_card <", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardLessThanOrEqualTo(String value) {
            addCriterion("insurance_card <=", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardLike(String value) {
            addCriterion("insurance_card like", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardNotLike(String value) {
            addCriterion("insurance_card not like", value, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardIn(List<String> values) {
            addCriterion("insurance_card in", values, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardNotIn(List<String> values) {
            addCriterion("insurance_card not in", values, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardBetween(String value1, String value2) {
            addCriterion("insurance_card between", value1, value2, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andInsuranceCardNotBetween(String value1, String value2) {
            addCriterion("insurance_card not between", value1, value2, "insuranceCard");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNull() {
            addCriterion("phone is null");
            return (Criteria) this;
        }

        public Criteria andPhoneIsNotNull() {
            addCriterion("phone is not null");
            return (Criteria) this;
        }

        public Criteria andPhoneEqualTo(String value) {
            addCriterion("phone =", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotEqualTo(String value) {
            addCriterion("phone <>", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThan(String value) {
            addCriterion("phone >", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("phone >=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThan(String value) {
            addCriterion("phone <", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLessThanOrEqualTo(String value) {
            addCriterion("phone <=", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneLike(String value) {
            addCriterion("phone like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotLike(String value) {
            addCriterion("phone not like", value, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneIn(List<String> values) {
            addCriterion("phone in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotIn(List<String> values) {
            addCriterion("phone not in", values, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneBetween(String value1, String value2) {
            addCriterion("phone between", value1, value2, "phone");
            return (Criteria) this;
        }

        public Criteria andPhoneNotBetween(String value1, String value2) {
            addCriterion("phone not between", value1, value2, "phone");
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

        public Criteria andRunLicenceIsNull() {
            addCriterion("run_licence is null");
            return (Criteria) this;
        }

        public Criteria andRunLicenceIsNotNull() {
            addCriterion("run_licence is not null");
            return (Criteria) this;
        }

        public Criteria andRunLicenceEqualTo(String value) {
            addCriterion("run_licence =", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceNotEqualTo(String value) {
            addCriterion("run_licence <>", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceGreaterThan(String value) {
            addCriterion("run_licence >", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceGreaterThanOrEqualTo(String value) {
            addCriterion("run_licence >=", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceLessThan(String value) {
            addCriterion("run_licence <", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceLessThanOrEqualTo(String value) {
            addCriterion("run_licence <=", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceLike(String value) {
            addCriterion("run_licence like", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceNotLike(String value) {
            addCriterion("run_licence not like", value, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceIn(List<String> values) {
            addCriterion("run_licence in", values, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceNotIn(List<String> values) {
            addCriterion("run_licence not in", values, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceBetween(String value1, String value2) {
            addCriterion("run_licence between", value1, value2, "runLicence");
            return (Criteria) this;
        }

        public Criteria andRunLicenceNotBetween(String value1, String value2) {
            addCriterion("run_licence not between", value1, value2, "runLicence");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
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