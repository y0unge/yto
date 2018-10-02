package yto.net.cn.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Orderss implements Serializable {
    /**
     * 订单表id
     */
    private Long ordersId;

    /**
     * 订单号
     */
    private String ordersNumber;

    /**
     * 登陆id , 一般不会加外键约束
     */
    private Long loginId;

    /**
     * 发货人
     */
    private String loginUsername;

    /**
     * 地址信息id
     */
    private Long addressId;

    /**
     * 物品信息表id
     */
    private Long goodsId;

    /**
     * 物流信息表id
     */
    private Long logisticsId;

    /**
     * 预计到达时间
     */
    private Date arriveTime;

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
     * 支付信息表id
     */
    private Long payId;

    /**
     * 订单表创建时间
     */
    private Date createTime;

    /**
     * 订单表最后更新时间
     */
    private Date updateTime;

    /**
     * 1正常
     */
    private Byte status;

    private static final long serialVersionUID = 1L;

    public Long getOrdersId() {
        return ordersId;
    }

    public void setOrdersId(Long ordersId) {
        this.ordersId = ordersId;
    }

    public String getOrdersNumber() {
        return ordersNumber;
    }

    public void setOrdersNumber(String ordersNumber) {
        this.ordersNumber = ordersNumber == null ? null : ordersNumber.trim();
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

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Long getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(Long logisticsId) {
        this.logisticsId = logisticsId;
    }

    public Date getArriveTime() {
        return arriveTime;
    }

    public void setArriveTime(Date arriveTime) {
        this.arriveTime = arriveTime;
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

    public Long getPayId() {
        return payId;
    }

    public void setPayId(Long payId) {
        this.payId = payId;
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

    public Byte getStatus() {
        return status;
    }

    public void setStatus(Byte status) {
        this.status = status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ordersId=").append(ordersId);
        sb.append(", ordersNumber=").append(ordersNumber);
        sb.append(", loginId=").append(loginId);
        sb.append(", loginUsername=").append(loginUsername);
        sb.append(", addressId=").append(addressId);
        sb.append(", goodsId=").append(goodsId);
        sb.append(", logisticsId=").append(logisticsId);
        sb.append(", arriveTime=").append(arriveTime);
        sb.append(", payType=").append(payType);
        sb.append(", payStatus=").append(payStatus);
        sb.append(", payMoney=").append(payMoney);
        sb.append(", payId=").append(payId);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}