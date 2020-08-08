package com.ruoyi.cgb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

import java.util.Date;

/**
 * 发货单明细对象 rm_invoice_detaiil
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
public class RmInvoiceDetaiil extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 发货单号 */
    @Excel(name = "发货单号")
    private String invoiceNum;

    /** 采购订单号*/
    @Excel(name = "采购订单号")
    private String poNum;

    /** 物料编码 */
    @Excel(name = "物料编码")
    private String wlxxid;

    /**物料名称*/
    @Excel(name = "物料名称")
    private String wlmcId;

    /** 计划重量 */
    @Excel(name = "计划重量")
    private Long planWeight;

    /** 申报重量 */
    @Excel(name = "申报重量")
    private Long declareWeight;

    /** 审核重量 */
    @Excel(name = "审核重量")
    private Long checkWeight;

    /** 发货重量 */
    @Excel(name = "发货重量")
    private Long sippingWeight;

    /** 发往地 */
    @Excel(name = "发往地")
    private String bourn;

    /** 创建时间*/
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setWlxxid(String wlxxid) 
    {
        this.wlxxid = wlxxid;
    }

    public String getWlxxid() 
    {
        return wlxxid;
    }
    public void setInvoiceNum(String invoiceNum) 
    {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceNum() 
    {
        return invoiceNum;
    }
    public void setPlanWeight(Long planWeight) 
    {
        this.planWeight = planWeight;
    }

    public Long getPlanWeight() 
    {
        return planWeight;
    }
    public void setDeclareWeight(Long declareWeight) 
    {
        this.declareWeight = declareWeight;
    }

    public Long getDeclareWeight() 
    {
        return declareWeight;
    }
    public void setCheckWeight(Long checkWeight) 
    {
        this.checkWeight = checkWeight;
    }

    public Long getCheckWeight() 
    {
        return checkWeight;
    }
    public void setSippingWeight(Long sippingWeight) 
    {
        this.sippingWeight = sippingWeight;
    }

    public Long getSippingWeight() 
    {
        return sippingWeight;
    }

    public String getWlmcId() {
        return wlmcId;
    }

    public void setWlmcId(String wlmcId) {
        this.wlmcId = wlmcId;
    }

    public String getBourn() {
        return bourn;
    }

    public void setBourn(String bourn) {
        this.bourn = bourn;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String poNum) {
        this.poNum = poNum;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("wlxxid", getWlxxid())
            .append("invoiceNum", getInvoiceNum())
            .append("planWeight", getPlanWeight())
            .append("declareWeight", getDeclareWeight())
            .append("checkWeight", getCheckWeight())
            .append("sippingWeight", getSippingWeight())
                .append("wlmcId",getWlmcId())
                .append("bourn",getBourn())
                .append("createDate",getCreateDate())
                .append("poNum",getPoNum())
            .toString();
    }
}
