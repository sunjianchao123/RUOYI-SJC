package com.ruoyi.cgb.domain;
/**
 * 采购订单明细
 * */
import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class RmPoDetail extends BaseEntity {
    private static final long serialVersionUID = 1L;
    /**采购订单号*/
    private String poNum;

    /**行项目号*/
    private String lineNum;

    /**物料编码*/
    private String wlxxId;

    /**物料名称*/
    private String wlmcId;

    /**计划重量*/
    private String plan_weight;

    /**发货重量*/
    private String sipping_weight;

    public String getPoNum() {
        return poNum;
    }

    public void setPoNum(String poNum) {
        this.poNum = poNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getWlxxId() {
        return wlxxId;
    }

    public void setWlxxId(String wlxxId) {
        this.wlxxId = wlxxId;
    }

    public String getWlmcId() {
        return wlmcId;
    }

    public void setWlmcId(String wlmcId) {
        this.wlmcId = wlmcId;
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

    @Override
    public String toString(){
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("poNum",getPoNum())
                .append("lineNum",getLineNum())
                .append("wlxxId",getWlxxId())
                .append("wlmcId",getWlxxId())
                .append("plan_weight",getPlan_weight())
                .append("sipping_weight",getSipping_weight())
                .toString();
    }
}
