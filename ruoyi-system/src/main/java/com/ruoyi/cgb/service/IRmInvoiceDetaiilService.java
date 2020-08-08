package com.ruoyi.cgb.service;

import com.ruoyi.cgb.domain.RmInvoiceDetaiil;

import java.util.List;

/**
 * 发货单明细Service接口
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
public interface IRmInvoiceDetaiilService 
{
    /**
     * 查询发货单明细
     * 
     * @param wlxxid 发货单明细ID
     * @return 发货单明细
     */
    public RmInvoiceDetaiil selectRmInvoiceDetaiilById(String wlxxid);

    /**
     * 查询发货单明细列表
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 发货单明细集合
     */
    public List<RmInvoiceDetaiil> selectRmInvoiceDetaiilList(RmInvoiceDetaiil rmInvoiceDetaiil);

    /**
     * 新增发货单明细
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 结果
     */
    public int insertRmInvoiceDetaiil(RmInvoiceDetaiil rmInvoiceDetaiil);

    /**
     * 修改发货单明细
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 结果
     */
    public int updateRmInvoiceDetaiil(RmInvoiceDetaiil rmInvoiceDetaiil);

    /**
     * 批量删除发货单明细
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRmInvoiceDetaiilByIds(String ids);

    /**
     * 删除发货单明细信息
     * 
     * @param wlxxid 发货单明细ID
     * @return 结果
     */
    public int deleteRmInvoiceDetaiilById(String wlxxid);
}
