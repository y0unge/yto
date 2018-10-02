package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Feedback implements Serializable {
    /**
     * 反馈表id
     */
    private Long feedbackId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 员工id
     */
    private Long feedbackLeaderId;

    /**
     * 员工姓名
     */
    private String feedbackLeaderName;

    /**
     * 反馈表创建时间
     */
    private Date createTime;

    /**
     * 反馈表最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示反馈中 1 表示反馈成功 2 表示反馈失败  -1 表示注销
     */
    private Integer active;

    /**
     * 反馈内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Long feedbackId) {
        this.feedbackId = feedbackId;
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

    public Long getFeedbackLeaderId() {
        return feedbackLeaderId;
    }

    public void setFeedbackLeaderId(Long feedbackLeaderId) {
        this.feedbackLeaderId = feedbackLeaderId;
    }

    public String getFeedbackLeaderName() {
        return feedbackLeaderName;
    }

    public void setFeedbackLeaderName(String feedbackLeaderName) {
        this.feedbackLeaderName = feedbackLeaderName == null ? null : feedbackLeaderName.trim();
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
        sb.append(", feedbackId=").append(feedbackId);
        sb.append(", staffName=").append(staffName);
        sb.append(", staffId=").append(staffId);
        sb.append(", feedbackLeaderId=").append(feedbackLeaderId);
        sb.append(", feedbackLeaderName=").append(feedbackLeaderName);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}