package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Announcement implements Serializable {
    /**
     * 公告表id
     */
    private Long announcementId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 被通知部们
     */
    private String department;

    /**
     * 公告表创建时间
     */
    private Date createTime;

    /**
     * 公告表最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示公告未发布 1 表示公告已发布 2 表示反馈失败  -1 表示注销
     */
    private Integer active;

    /**
     * 公告内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getAnnouncementId() {
        return announcementId;
    }

    public void setAnnouncementId(Long announcementId) {
        this.announcementId = announcementId;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department == null ? null : department.trim();
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

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", announcementId=").append(announcementId);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffId=").append(staffId);
        sb.append(", department=").append(department);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}