package com.ruoyi.cgb.service;

import com.ruoyi.cgb.domain.RmTruckMain;

import java.util.List;

/**
 * 装车单主表Service接口
 * 
 * @author ruoyi
 * @date 2020-08-07
 */
public interface IRmTruckMainService 
{
    /**
     * 查询装车单主表
     * 
     * @param truckNum 装车单主表ID
     * @return 装车单主表
     */
    public RmTruckMain selectRmTruckMainById(String truckNum);

    /**
     * 查询装车单主表列表
     * 
     * @param rmTruckMain 装车单主表
     * @return 装车单主表集合
     */
    public List<RmTruckMain> selectRmTruckMainList(RmTruckMain rmTruckMain);


    /**
     * 修改装车单主表
     * 
     * @param rmTruckMain 装车单主表
     * @return 结果
     */
    public int updateRmTruckMain(RmTruckMain rmTruckMain);

}
