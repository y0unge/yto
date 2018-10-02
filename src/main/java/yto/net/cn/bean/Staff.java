package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Staff implements Serializable {
    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 员工工号
     */
    private String staffNumber;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 联系手机号
     */
    private Long staffPhone;

    /**
     * 所属部门
     */
    private String department;

    /**
     * 员工简介
     */
    private String introduce;

    /**
     * 员工基本信息创建时间
     */
    private Date createTime;

    /**
     * 员工基本信息最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示实习生 1 表示在职人员 -1 表示注销
     */
    private Integer active;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    private static final long serialVersionUID = 1L;

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getStaffNumber() {
        return staffNumber;
    }

    public void setStaffNumber(String staffNumber) {
        this.staffNumber = staffNumber == null ? null : staffNumber.trim();
    }

    public String getStaffName() {
        return staffName;
    }

    public void setStaffName(String staffName) {
        this.staffName = staffName == null ? null : staffName.trim();
    }

    public Long getStaffPhone() {
        return staffPhone;
    }

    public void setStaffPhone(Long staffPhone) {
        this.staffPhone = staffPhone;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce == null ? null : introduce.trim();
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

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", staffId=").append(staffId);
        sb.append(", staffNumber=").append(staffNumber);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffPhone=").append(staffPhone);
        sb.append(", department=").append(department);
        sb.append(", introduce=").append(introduce);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", loginId=").append(loginId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}