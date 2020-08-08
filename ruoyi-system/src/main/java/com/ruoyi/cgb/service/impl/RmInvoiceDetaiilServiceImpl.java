package com.ruoyi.cgb.service.impl;

import com.ruoyi.cgb.domain.RmInvoiceDetaiil;
import com.ruoyi.cgb.mapper.RmInvoiceDetaiilMapper;
import com.ruoyi.cgb.service.IRmInvoiceDetaiilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 发货单明细Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
@Service
public class RmInvoiceDetaiilServiceImpl implements IRmInvoiceDetaiilService
{
    @Autowired
    private RmInvoiceDetaiilMapper rmInvoiceDetaiilMapper;

    /**
     * 查询发货单明细
     * 
     * @param wlxxid 发货单明细ID
     * @return 发货单明细
     */
    @Override
    public RmInvoiceDetaiil selectRmInvoiceDetaiilById(String wlxxid)
    {
        return rmInvoiceDetaiilMapper.selectRmInvoiceDetaiilById(wlxxid);
    }

    /**
     * 查询发货单明细列表
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 发货单明细
     */
    @Override
    public List<RmInvoiceDetaiil> selectRmInvoiceDetaiilList(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        return rmInvoiceDetaiilMapper.selectRmInvoiceDetaiilList(rmInvoiceDetaiil);
    }

    /**
     * 新增发货单明细
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 结果
     */
    @Override
    public int insertRmInvoiceDetaiil(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        return rmInvoiceDetaiilMapper.insertRmInvoiceDetaiil(rmInvoiceDetaiil);
    }

    /**
     * 修改发货单明细
     * 
     * @param rmInvoiceDetaiil 发货单明细
     * @return 结果
     */
    @Override
    public int updateRmInvoiceDetaiil(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        return rmInvoiceDetaiilMapper.updateRmInvoiceDetaiil(rmInvoiceDetaiil);
    }

    /**
     * 删除发货单明细对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteRmInvoiceDetaiilByIds(String ids)
    {
        return rmInvoiceDetaiilMapper.deleteRmInvoiceDetaiilByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除发货单明细信息
     * 
     * @param wlxxid 发货单明细ID
     * @return 结果
     */
    @Override
    public int deleteRmInvoiceDetaiilById(String wlxxid)
    {
        return rmInvoiceDetaiilMapper.deleteRmInvoiceDetaiilById(wlxxid);
    }
}
