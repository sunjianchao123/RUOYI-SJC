package com.ruoyi.cgb.mapper;


import com.ruoyi.cgb.domain.RmInvoiceDetaiil;

import java.util.List;

/**
 * 发货单明细Mapper接口
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
public interface RmInvoiceDetaiilMapper 
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
     * 删除发货单明细
     * 
     * @param wlxxid 发货单明细ID
     * @return 结果
     */
    public int deleteRmInvoiceDetaiilById(String wlxxid);

    /**
     * 批量删除发货单明细
     * 
     * @param wlxxids 需要删除的数据ID
     * @return 结果
     */
    public int deleteRmInvoiceDetaiilByIds(String[] wlxxids);
}
