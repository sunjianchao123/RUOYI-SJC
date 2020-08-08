package com.ruoyi.cgb.service.impl;

import com.ruoyi.cgb.domain.RmTruckMain;
import com.ruoyi.cgb.mapper.RmTruckMainMapper;
import com.ruoyi.cgb.service.IRmTruckMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 装车单主表Service业务层处理
 *
 * @author ruoyi
 * @date 2020-08-07
 */
@Service
public class RmTruckMainServiceImpl implements IRmTruckMainService
{
    @Autowired
    private RmTruckMainMapper rmTruckMainMapper;

    /**
     * 查询装车单主表
     *
     * @param truckNum 装车单主表ID
     * @return 装车单主表
     */
    @Override
    public RmTruckMain selectRmTruckMainById(String truckNum)
    {
        return rmTruckMainMapper.selectRmTruckMainById(truckNum);
    }

    /**
     * 查询装车单主表列表
     *
     * @param rmTruckMain 装车单主表
     * @return 装车单主表
     */
    @Override
    public List<RmTruckMain> selectRmTruckMainList(RmTruckMain rmTruckMain)
    {
        return rmTruckMainMapper.selectRmTruckMainList(rmTruckMain);
    }


    /**
     * 修改装车单主表
     *
     * @param rmTruckMain 装车单主表
     * @return 结果
     */
    @Override
    public int updateRmTruckMain(RmTruckMain rmTruckMain)
    {
        return rmTruckMainMapper.updateRmTruckMain(rmTruckMain);
    }

}
