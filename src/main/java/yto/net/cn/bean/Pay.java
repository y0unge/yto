package yto.net.cn.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Pay implements Serializable {
    /**
     * 支付信息表id
     */
    private Long payId;

    /**
     * 订单id
     */
    private Long ordersId;

    /**
     * 流水号
     */
    private Long payNumber;

    /**
     * 物品名称
     */
    private String goodsName;

    /**
     * 物品id
     */
    private Long goodsId;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    /**
     * 登陆用户名
     */
    private String loginUsername;

    /**
     * 1 表示微信 2 表示支付宝
     */
    private Byte payType;

    /**
     * 0 表示还未支付 1表示支付成功 -1表示支付失败 
     */
    private Byte payStatus;

    /**
     * 支付金额
     */
    private BigDecimal payMoney;

    /**
     * 支付信息表创建时间
     */
    private Date createTime;

    /**
     * 支付信息表最后更新时间
     */
    private Date updateTime;

    private static final long serialVersionUID = 1L;

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
    }

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public Long getPayNumber() {
        return payNumber;
    }

    public void setPayNumber(Long payNumber) {
        this.payNumber = payNumber;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
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

    public Byte getPayType() {
        return payType;
    }

    public void setPayType(Byte payType) {
        this.payType = payType;
    }

    public Byte getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(Byte payStatus) {
        this.payStatus = payStatus;
    }

    public BigDecimal getPayMoney() {
        return payMoney;
    }

    public void setPayMoney(BigDecimal payMoney) {
        this.payMoney = payMoney;
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
        sb.append(", payId=").append(payId);
        sb.append(", ordersId=").append(ordersId);
        sb.append(", payNumber=").append(payNumber);
        sb.append(", goodsName=").append(goodsName);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", loginId=").append(loginId);
        sb.append(", loginUsername=").append(loginUsername);
        sb.append(", payType=").append(payType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}