package yto.net.cn.bean;

import java.io.Serializable;
import java.util.Date;

public class IdentityName implements Serializable {
    /**
     * 实名信息id
     */
    private Long identityId;

    /**
     * 真实姓名
     */
    private String realName;

    /**
     * 身份证号码
     */
    private String idCardNumber;

    /**
     * 性别 0 男 1 女
     */
    private Boolean sex;

    /**
     * 家庭住址
     */
    private String address;

    /**
     * 头像url
     */
    private String imgUrl;

    /**
     * 实名信息创建时间
     */
    private Date createTime;

    /**
     * 实名信息最后更新时间
     */
    private Date updateTime;

    /**
     * 0 表示为认证 1 表示认证通过 -1 表示认证失败
     */
    private Integer active;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    private static final long serialVersionUID = 1L;

    public Long getIdentityId() {
        return identityId;
    }

    public void setIdentityId(Long identityId) {
        this.identityId = identityId;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName == null ? null : realName.trim();
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber == null ? null : idCardNumber.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl == null ? null : imgUrl.trim();
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
        sb.append(", identityId=").append(identityId);
        sb.append(", realName=").append(realName);
        sb.append(", idCardNumber=").append(idCardNumber);
        sb.append(", sex=").append(sex);
        sb.append(", address=").append(address);
        sb.append(", imgUrl=").append(imgUrl);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", active=").append(active);
        sb.append(", loginId=").append(loginId);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}