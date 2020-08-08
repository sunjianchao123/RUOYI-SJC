package com.ruoyi.cgb.mapper;

import com.ruoyi.cgb.domain.RmInvoiceMain;

import java.util.List;

/**
 * 发货单主Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
public interface RmInvoiceMainMapper 
{
    /**
     * 查询发货单主
     * 
     * @param invoiceNum 发货单主ID
     * @return 发货单主
     */
    public RmInvoiceMain selectRmInvoiceMainById(String invoiceNum);

    /**
     * 查询发货单主列表
     * 
     * @param rmInvoiceMain 发货单主
     * @return 发货单主集合
     */
    public List<RmInvoiceMain> selectRmInvoiceMainList(RmInvoiceMain rmInvoiceMain);

    /**
     * 修改发货单主
     *
     * @param rmInvoiceMain 发货单主
     * @return 结果
     */
    public int updateRmInvoiceMain(RmInvoiceMain rmInvoiceMain);

}
