package com.ruoyi.cgb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 装车单主对象 rm_truck_main
 *
 * @author ruoyi
 * @date 2020-08-07
 */
public class RmTruckMain extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 采购订单号
     */
    @Excel(name = "采购订单号")
    private String poNum;

    /**
     * 装车单号
     */
    @Excel(name = "装车单号")
    private String truckNum;

    /**
     * 发货单号
     */
    @Excel(name = "发货单号")
    private String invoiceNum;

    /**
     * 物料编码
     */
    @Excel(name = "物料编码")
    private String wlxxid;

    /**
     * 物料名称
     */
    @Excel(name = "物料名称")
    private String wlmcId;

    /**
     * 审核重量
     */
    @Excel(name = "审核重量")
    private Long checkWeight;

    /**
     * 发货重量
     */
    @Excel(name = "发货重量")
    private Long sippingWeight;

    /**
     * 预计到货时间
     */
    @Excel(name = "预计到货时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date arriveDate;

    /**
     * 驾驶员电话
     */
    @Excel(name = "驾驶员电话")
    private String driverPhone;

    /**
     * 驾驶员车辆
     */
    @Excel(name = "驾驶员车辆")
    private String driverCar;

    /**
     * 扫描数量
     */
    @Excel(name = "扫描数量")
    private String scanCount;

    /**
     * 状态(1创建，2完成)
     */
    @Excel(name = "状态(1创建，2完成)")
    private Long status;

    /**
     * 发往地
     */
    @Excel(name = "目的库房")
    private String bourn;

    /**
     * 操作时间
     */
    @Excel(name = "操作时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setTruckNum(String truckNum) {
        this.truckNum = truckNum;
    }

    public String getTruckNum() {
        return truckNum;
    }

    public void setPoNum(String poNum) {
        this.poNum = poNum;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceNum() {
        return invoiceNum;
    }

    public void setWlxxid(String wlxxid) {
        this.wlxxid = wlxxid;
    }

    public String getWlxxid() {
        return wlxxid;
    }

    public void setCheckWeight(Long checkWeight) {
        this.checkWeight = checkWeight;
    }

    public Long getCheckWeight() {
        return checkWeight;
    }

    public void setSippingWeight(Long sippingWeight) {
        this.sippingWeight = sippingWeight;
    }

    public Long getSippingWeight() {
        return sippingWeight;
    }

    public void setArriveDate(Date arriveDate) {
        this.arriveDate = arriveDate;
    }

    public Date getArriveDate() {
        return arriveDate;
    }

    public void setDriverPhone(String driverPhone) {
        this.driverPhone = driverPhone;
    }

    public String getDriverPhone() {
        return driverPhone;
    }

    public void setDriverCar(String driverCar) {
        this.driverCar = driverCar;
    }

    public String getDriverCar() {
        return driverCar;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public Long getStatus() {
        return status;
    }

    public void setBourn(String bourn) {
        this.bourn = bourn;
    }

    public String getBourn() {
        return bourn;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public String getWlmcId() {
        return wlmcId;
    }

    public void setWlmcId(String wlmcId) {
        this.wlmcId = wlmcId;
    }

    public String getScanCount() {
        return scanCount;
    }

    public void setScanCount(String scanCount) {
        this.scanCount = scanCount;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("truckNum", getTruckNum())
                .append("poNum", getPoNum())
                .append("invoiceNum", getInvoiceNum())
                .append("wlxxid", getWlxxid())
                .append("checkWeight", getCheckWeight())
                .append("sippingWeight", getSippingWeight())
                .append("arriveDate", getArriveDate())
                .append("driverPhone", getDriverPhone())
                .append("driverCar", getDriverCar())
                .append("status", getStatus())
                .append("bourn", getBourn())
                .append("wlmcId",getWlmcId() )
                .append("scanCount",getScanCount() )
                .append("createDate", getCreateDate())
                .toString();
    }
}
