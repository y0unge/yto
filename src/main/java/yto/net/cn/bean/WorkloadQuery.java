package yto.net.cn.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkloadQuery {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer pageNo = 1;

    protected Integer startRow;

    protected Integer pageSize = 10;

    protected String fields;

    public WorkloadQuery() {
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

    public void setPageNo(Integer pageNo) {
        this.pageNo=pageNo;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setStartRow(Integer startRow) {
        this.startRow=startRow;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize=pageSize;
        this.startRow = (pageNo-1)*this.pageSize;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setFields(String fields) {
        this.fields=fields;
    }

    public String getFields() {
        return fields;
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

        public Criteria andWorkloadIdIsNull() {
            addCriterion("workload_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdIsNotNull() {
            addCriterion("workload_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdEqualTo(Long value) {
            addCriterion("workload_id =", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdNotEqualTo(Long value) {
            addCriterion("workload_id <>", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdGreaterThan(Long value) {
            addCriterion("workload_id >", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdGreaterThanOrEqualTo(Long value) {
            addCriterion("workload_id >=", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdLessThan(Long value) {
            addCriterion("workload_id <", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdLessThanOrEqualTo(Long value) {
            addCriterion("workload_id <=", value, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdIn(List<Long> values) {
            addCriterion("workload_id in", values, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdNotIn(List<Long> values) {
            addCriterion("workload_id not in", values, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdBetween(Long value1, Long value2) {
            addCriterion("workload_id between", value1, value2, "workloadId");
            return (Criteria) this;
        }

        public Criteria andWorkloadIdNotBetween(Long value1, Long value2) {
            addCriterion("workload_id not between", value1, value2, "workloadId");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNull() {
            addCriterion("staff_name is null");
            return (Criteria) this;
        }

        public Criteria andStaffNameIsNotNull() {
            addCriterion("staff_name is not null");
            return (Criteria) this;
        }

        public Criteria andStaffNameEqualTo(String value) {
            addCriterion("staff_name =", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotEqualTo(String value) {
            addCriterion("staff_name <>", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThan(String value) {
            addCriterion("staff_name >", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameGreaterThanOrEqualTo(String value) {
            addCriterion("staff_name >=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThan(String value) {
            addCriterion("staff_name <", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLessThanOrEqualTo(String value) {
            addCriterion("staff_name <=", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameLike(String value) {
            addCriterion("staff_name like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotLike(String value) {
            addCriterion("staff_name not like", value, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameIn(List<String> values) {
            addCriterion("staff_name in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotIn(List<String> values) {
            addCriterion("staff_name not in", values, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameBetween(String value1, String value2) {
            addCriterion("staff_name between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andStaffNameNotBetween(String value1, String value2) {
            addCriterion("staff_name not between", value1, value2, "staffName");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityIsNull() {
            addCriterion("orders_quantity is null");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityIsNotNull() {
            addCriterion("orders_quantity is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityEqualTo(Integer value) {
            addCriterion("orders_quantity =", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityNotEqualTo(Integer value) {
            addCriterion("orders_quantity <>", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityGreaterThan(Integer value) {
            addCriterion("orders_quantity >", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders_quantity >=", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityLessThan(Integer value) {
            addCriterion("orders_quantity <", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityLessThanOrEqualTo(Integer value) {
            addCriterion("orders_quantity <=", value, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityIn(List<Integer> values) {
            addCriterion("orders_quantity in", values, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityNotIn(List<Integer> values) {
            addCriterion("orders_quantity not in", values, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityBetween(Integer value1, Integer value2) {
            addCriterion("orders_quantity between", value1, value2, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andOrdersQuantityNotBetween(Integer value1, Integer value2) {
            addCriterion("orders_quantity not between", value1, value2, "ordersQuantity");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNull() {
            addCriterion("work_start is null");
            return (Criteria) this;
        }

        public Criteria andWorkStartIsNotNull() {
            addCriterion("work_start is not null");
            return (Criteria) this;
        }

        public Criteria andWorkStartEqualTo(Date value) {
            addCriterion("work_start =", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotEqualTo(Date value) {
            addCriterion("work_start <>", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThan(Date value) {
            addCriterion("work_start >", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartGreaterThanOrEqualTo(Date value) {
            addCriterion("work_start >=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThan(Date value) {
            addCriterion("work_start <", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartLessThanOrEqualTo(Date value) {
            addCriterion("work_start <=", value, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartIn(List<Date> values) {
            addCriterion("work_start in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotIn(List<Date> values) {
            addCriterion("work_start not in", values, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartBetween(Date value1, Date value2) {
            addCriterion("work_start between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkStartNotBetween(Date value1, Date value2) {
            addCriterion("work_start not between", value1, value2, "workStart");
            return (Criteria) this;
        }

        public Criteria andWorkEndIsNull() {
            addCriterion("work_end is null");
            return (Criteria) this;
        }

        public Criteria andWorkEndIsNotNull() {
            addCriterion("work_end is not null");
            return (Criteria) this;
        }

        public Criteria andWorkEndEqualTo(Date value) {
            addCriterion("work_end =", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotEqualTo(Date value) {
            addCriterion("work_end <>", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndGreaterThan(Date value) {
            addCriterion("work_end >", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndGreaterThanOrEqualTo(Date value) {
            addCriterion("work_end >=", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndLessThan(Date value) {
            addCriterion("work_end <", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndLessThanOrEqualTo(Date value) {
            addCriterion("work_end <=", value, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndIn(List<Date> values) {
            addCriterion("work_end in", values, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotIn(List<Date> values) {
            addCriterion("work_end not in", values, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndBetween(Date value1, Date value2) {
            addCriterion("work_end between", value1, value2, "workEnd");
            return (Criteria) this;
        }

        public Criteria andWorkEndNotBetween(Date value1, Date value2) {
            addCriterion("work_end not between", value1, value2, "workEnd");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNull() {
            addCriterion("staff_id is null");
            return (Criteria) this;
        }

        public Criteria andStaffIdIsNotNull() {
            addCriterion("staff_id is not null");
            return (Criteria) this;
        }

        public Criteria andStaffIdEqualTo(Long value) {
            addCriterion("staff_id =", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotEqualTo(Long value) {
            addCriterion("staff_id <>", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThan(Long value) {
            addCriterion("staff_id >", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdGreaterThanOrEqualTo(Long value) {
            addCriterion("staff_id >=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThan(Long value) {
            addCriterion("staff_id <", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdLessThanOrEqualTo(Long value) {
            addCriterion("staff_id <=", value, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdIn(List<Long> values) {
            addCriterion("staff_id in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotIn(List<Long> values) {
            addCriterion("staff_id not in", values, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdBetween(Long value1, Long value2) {
            addCriterion("staff_id between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andStaffIdNotBetween(Long value1, Long value2) {
            addCriterion("staff_id not between", value1, value2, "staffId");
            return (Criteria) this;
        }

        public Criteria andActiveIsNull() {
            addCriterion("active is null");
            return (Criteria) this;
        }

        public Criteria andActiveIsNotNull() {
            addCriterion("active is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEqualTo(Integer value) {
            addCriterion("active =", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotEqualTo(Integer value) {
            addCriterion("active <>", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThan(Integer value) {
            addCriterion("active >", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveGreaterThanOrEqualTo(Integer value) {
            addCriterion("active >=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThan(Integer value) {
            addCriterion("active <", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveLessThanOrEqualTo(Integer value) {
            addCriterion("active <=", value, "active");
            return (Criteria) this;
        }

        public Criteria andActiveIn(List<Integer> values) {
            addCriterion("active in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotIn(List<Integer> values) {
            addCriterion("active not in", values, "active");
            return (Criteria) this;
        }

        public Criteria andActiveBetween(Integer value1, Integer value2) {
            addCriterion("active between", value1, value2, "active");
            return (Criteria) this;
        }

        public Criteria andActiveNotBetween(Integer value1, Integer value2) {
            addCriterion("active not between", value1, value2, "active");
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