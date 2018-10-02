package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Workload implements Serializable {
    /**
     * 工作量id
     */
    private Long workloadId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 订单数量
     */
    private Integer ordersQuantity;

    /**
     * 工作起始时间
     */
    private Date workStart;

    /**
     * 工作结束时间
     */
    private Date workEnd;

    /**
     * 工作量信息最后更新时间
     */
    private Date updateTime;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 0 表示休息 1 表示在职 -1 表示注销
     */
    private Integer active;

    private static final long serialVersionUID = 1L;

    public Long getWorkloadId() {
        return workloadId;
    }

    public void setWorkloadId(Long workloadId) {
        this.workloadId = workloadId;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Integer getOrdersQuantity() {
        return ordersQuantity;
    }

    public void setOrdersQuantity(Integer ordersQuantity) {
        this.ordersQuantity = ordersQuantity;
    }

    public Date getWorkStart() {
        return workStart;
    }

    public void setWorkStart(Date workStart) {
        this.workStart = workStart;
    }

    public Date getWorkEnd() {
        return workEnd;
    }

    public void setWorkEnd(Date workEnd) {
        this.workEnd = workEnd;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", workloadId=").append(workloadId);
        sb.append(", staffName=").append(staffName);
        sb.append(", ordersQuantity=").append(ordersQuantity);
        sb.append(", workStart=").append(workStart);
        sb.append(", workEnd=").append(workEnd);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", staffId=").append(staffId);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}