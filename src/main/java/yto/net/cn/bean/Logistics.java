package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Logistics implements Serializable {
    /**
     * 物流信息表id
     */
    private Long logisticsId;

    /**
     * 物流公司
     */
    private String company;

    /**
     * 发货时间
     */
    private Date sendTime;

    /**
     * 预计到达时间
     */
    private Date arriveTime;

    /**
     * 0 订单处理中 1 货物已提交到物流公司 2 运输中 3到达目的地 4派件中 5已签收
     */
    private Byte logisticsStatus;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 派件人姓名
     */
    private String staffName;

    /**
     * 联系手机号
     */
    private Long staffPhone;

    /**
     * 签收时间
     */
    private Date signTime;

    /**
     * 签收人
     */
    private String name;

    /**
     * 物流信息表创建时间
     */
    private Date createTime;

    /**
     * 物流信息表最后更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company == null ? null : company.trim();
    }

    public Date getSendTime() {
        return sendTime;
    }

    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
    }

    public Byte getLogisticsStatus() {
        return logisticsStatus;
    }

    public void setLogisticsStatus(Byte logisticsStatus) {
        this.logisticsStatus = logisticsStatus;
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
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

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", company=").append(company);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", logisticsStatus=").append(logisticsStatus);
        sb.append(", staffId=").append(staffId);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffPhone=").append(staffPhone);
        sb.append(", signTime=").append(signTime);
        sb.append(", name=").append(name);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}