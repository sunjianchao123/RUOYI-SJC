package com.ruoyi.cgb.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 【请填写功能名称】对象 rm_po_main
 *
 * @author ruoyi
 * @date 2020-07-28
 */
public class RmPoMain extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 采购订单号 */
    @Excel(name = "采购订单号")
    private String poNum;

    /** 供应商编号 */
    @Excel(name = "供应商编号")
    private String supplier_num;

    /** 供应商名称 */
    @Excel(name = "供应商名称")
    private String supplier;

    /** 计划重量 */
    @Excel(name = "计划重量")
    private String plan_weight;

    /** 发货重量 */
    @Excel(name = "发货重量")
    private String sipping_weight;

    /** 状态(1创建，2完成) */
    @Excel(name = "状态(1创建，2完成)")
    private Long status;

    /** 目的库房 */
    @Excel(name = "目的库房")
    private String bourn;

    /** 创建时间 */
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createDate;

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String poNum) {
        this.poNum = poNum;
    }

    public String getSupplier_num() {
        return supplier_num;
    }

    public void setSupplier_num(String supplier_num) {
        this.supplier_num = supplier_num;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getPlan_weight() {
        return plan_weight;
    }

    public void setPlan_weight(String plan_weight) {
        this.plan_weight = plan_weight;
    }

    public String getSipping_weight() {
        return sipping_weight;
    }

    public void setSipping_weight(String sipping_weight) {
        this.sipping_weight = sipping_weight;
    }

    public Long getStatus() {
        return status;
    }

    public void setStatus(Long status) {
        this.status = status;
    }

    public String getbourn() {
        return bourn;
    }

    public void setbourn(String bourn) {
        this.bourn = bourn;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
                .append("poNum", getPoNum())
                .append("supplier_num",getSupplier_num())
                .append("supplier",getSupplier())
                .append("plan_weight",getPlan_weight())
                .append("sipping_weight",getSipping_weight())
                .append("status", getStatus())
                .append("bourn", getbourn())
                .append("createDate", getCreateDate())
                .toString();
    }
}
