package com.ruoyi.cgb.service;

import com.ruoyi.cgb.domain.RmPoDetail;

import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author ruoyi
 * @date 2020-07-28
 */
public interface IRmPoDetailService {
    /**
     * 查询【请填写功能名称】
     *
     * @param poNum 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public RmPoDetail selectRmPoDetailById(String poNum);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param RmPoDetail 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RmPoDetail> selectRmPoDetailList(RmPoDetail RmPoDetail);

}
