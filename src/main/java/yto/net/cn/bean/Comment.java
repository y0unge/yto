package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
    /**
     * 评价表id
     */
    private Long commentId;

    /**
     * 评价类型
     */
    private Integer commentType;

    /**
     * 图片url
     */
    private String imgUrl;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    /**
     * 登陆用户名
     */
    private String loginUsername;

    /**
     * 员工id
     */
    private Long staffId;

    /**
     * 员工姓名
     */
    private String staffName;

    /**
     * 订单id
     */
    private Long ordersId;

    /**
     * 服务态度
     */
    private Byte attitude;

    /**
     * 物流速度
     */
    private Byte speed;

    /**
     * 包裹完整性
     */
    private Byte packageEntire;

    /**
     * 评价表创建时间
     */
    private Date createTime;

    /**
     * 评价表最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示未评价 1 表示已评价 -1 表示注销
     */
    private Integer active;

    /**
     * 评论内容
     */
    private String content;

    private static final long serialVersionUID = 1L;

    public Long getCommentId() {
        return commentId;
    }

    public void setCommentId(Long commentId) {
        this.commentId = commentId;
    }

    public Integer getCommentType() {
        return commentType;
    }

    public void setCommentType(Integer commentType) {
        this.commentType = commentType;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
    }

    public Long getLoginId() {
        return loginId;
    }

    public void setLoginId(Long loginId) {
        this.loginId = loginId;
    }

    public String getLoginUsername() {
        return loginUsername;
    }

    public void setLoginUsername(String loginUsername) {
        this.loginUsername = loginUsername == null ? null : loginUsername.trim();
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

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Byte getAttitude() {
        return attitude;
    }

    public void setAttitude(Byte attitude) {
        this.attitude = attitude;
    }

    public Byte getSpeed() {
        return speed;
    }

    public void setSpeed(Byte speed) {
        this.speed = speed;
    }

    public Byte getPackageEntire() {
        return packageEntire;
    }

    public void setPackageEntire(Byte packageEntire) {
        this.packageEntire = packageEntire;
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
        sb.append(", commentId=").append(commentId);
        sb.append(", commentType=").append(commentType);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", loginId=").append(loginId);
        sb.append(", loginUsername=").append(loginUsername);
        sb.append(", staffId=").append(staffId);
        sb.append(", staffName=").append(staffName);
        sb.append(", ordersId=").append(ordersId);
        sb.append(", attitude=").append(attitude);
        sb.append(", speed=").append(speed);
        sb.append(", packageEntire=").append(packageEntire);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", content=").append(content);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}