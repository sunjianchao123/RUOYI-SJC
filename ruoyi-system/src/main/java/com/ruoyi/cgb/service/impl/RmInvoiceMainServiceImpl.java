package com.ruoyi.cgb.service.impl;

import com.ruoyi.cgb.domain.RmInvoiceMain;
import com.ruoyi.cgb.mapper.RmInvoiceMainMapper;
import com.ruoyi.cgb.service.IRmInvoiceMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.core.text.Convert;

import java.util.List;

/**
 * 发货单主Service业务层处理
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
@Service
public class RmInvoiceMainServiceImpl implements IRmInvoiceMainService
{
    @Autowired
    private RmInvoiceMainMapper rmInvoiceMainMapper;

    /**
     * 查询发货单主
     * 
     * @param invoiceNum 发货单主ID
     * @return 发货单主
     */
    @Override
    public RmInvoiceMain selectRmInvoiceMainById(String invoiceNum)
    {
        return rmInvoiceMainMapper.selectRmInvoiceMainById(invoiceNum);
    }

    /**
     * 查询发货单主列表
     * 
     * @param rmInvoiceMain 发货单主
     * @return 发货单主
     */
    @Override
    public List<RmInvoiceMain> selectRmInvoiceMainList(RmInvoiceMain rmInvoiceMain)
    {
        return rmInvoiceMainMapper.selectRmInvoiceMainList(rmInvoiceMain);
    }

    /**
     * 修改发货单主
     *
     * @param rmInvoiceMain 发货单主
     * @return 结果
     */
    @Override
    public int updateRmInvoiceMain(RmInvoiceMain rmInvoiceMain)
    {
        return rmInvoiceMainMapper.updateRmInvoiceMain(rmInvoiceMain);
    }

}
