package yto.net.cn.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Rewards implements Serializable {
    /**
     * 员工惩奖表id
     */
    private Long rewardsId;

    /**
     * 惩奖金额
     */
    private BigDecimal money;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 员工惩奖表创建时间
     */
    private Date createTime;

    /**
     * 员工惩奖表最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示公告未发布惩罚 1 表示奖励 -1 表示注销
     */
    private Integer active;

    /**
     * 惩奖原因
     */
    private String reason;

    private static final long serialVersionUID = 1L;

    public Long getRewardsId() {
        return rewardsId;
    }

    public void setRewardsId(Long rewardsId) {
        this.rewardsId = rewardsId;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getActive() {
        return active;
    }

    public void setActive(Integer active) {
        this.active = active;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", rewardsId=").append(rewardsId);
        sb.append(", money=").append(money);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffId=").append(staffId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", reason=").append(reason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}