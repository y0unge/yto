package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Signin implements Serializable {
    /**
     * 签到表id
     */
    private Long signinId;

    /**
     * 签到时间
     */
    private Date signinTime;

    /**
     * 定位详细信息
     */
    private String address;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 0 表示未签 1 表示签到 -1 表示注销
     */
    private Integer active;

    private static final long serialVersionUID = 1L;

    public Long getSigninId() {
        return signinId;
    }

    public void setSigninId(Long signinId) {
        this.signinId = signinId;
    }

    public Date getSigninTime() {
        return signinTime;
    }

    public void setSigninTime(Date signinTime) {
        this.signinTime = signinTime;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
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
        sb.append(", signinId=").append(signinId);
        sb.append(", signinTime=").append(signinTime);
        sb.append(", address=").append(address);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffId=").append(staffId);
        sb.append(", active=").append(active);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}