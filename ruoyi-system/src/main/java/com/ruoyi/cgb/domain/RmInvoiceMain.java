package com.ruoyi.cgb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 发货单主对象 rm_invoice_main
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
public class RmInvoiceMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 发货单号 */
    @Excel(name = "发货单号")
    private String invoiceNum;

    /** 采购订单号 */
    @Excel(name = "采购订单号")
    private String poNum;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplierNum;

    /**供应商名称*/
    @Excel(name = "供应商名称")
    private  String supplier;

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


    /** 状态（1创建2完成） */
    @Excel(name = "状态", readConverterExp = "1=创建2完成")
    private Long status;

    /** 目的库房ID */
    @Excel(name = "目的库房ID")
    private String bourn;


    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public void setInvoiceNum(String invoiceNum) 
    {
        this.invoiceNum = invoiceNum;
    }

    public String getInvoiceNum() 
    {
        return invoiceNum;
    }
    public void setPoNum(String poNum) 
    {
        this.poNum = poNum;
    }

    public String getPoNum() 
    {
        return poNum;
    }
    public void setSupplierNum(String supplierNum) 
    {
        this.supplierNum = supplierNum;
    }

    public String getSupplierNum() 
    {
        return supplierNum;
    }
    public void setStatus(Long status) 
    {
        this.status = status;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Long getPlanWeight() {
        return planWeight;
    }

    public void setPlanWeight(Long planWeight) {
        this.planWeight = planWeight;
    }

    public Long getDeclareWeight() {
        return declareWeight;
    }

    public void setDeclareWeight(Long declareWeight) {
        this.declareWeight = declareWeight;
    }

    public Long getCheckWeight() {
        return checkWeight;
    }

    public void setCheckWeight(Long checkWeight) {
        this.checkWeight = checkWeight;
    }

    public Long getSippingWeight() {
        return sippingWeight;
    }

    public void setSippingWeight(Long sippingWeight) {
        this.sippingWeight = sippingWeight;
    }

    public Long getStatus()
    {
        return status;
    }
    public void setBourn(String bourn)
    {
        this.bourn = bourn;
    }

    public String getBourn()
    {
        return bourn;
    }
    public void setCreateDate(Date createDate) 
    {
        this.createDate = createDate;
    }

    public Date getCreateDate() 
    {
        return createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("invoiceNum", getInvoiceNum())
            .append("poNum", getPoNum())
            .append("supplierNum", getSupplierNum())
                .append("supplier", getSupplier())
                .append("planWeight", getPlanWeight())
                .append("DeclareWeight",getDeclareWeight())
                .append("CheckWeight",getCheckWeight())
                .append("SippingWeight",getSippingWeight())
            .append("status", getStatus())
            .append("bourn", getBourn())
            .append("createDate", getCreateDate())
            .toString();
    }
}
