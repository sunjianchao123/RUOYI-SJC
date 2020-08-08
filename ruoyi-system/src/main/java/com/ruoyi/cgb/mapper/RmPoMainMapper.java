package com.ruoyi.cgb.mapper;

import com.ruoyi.cgb.domain.RmPoMain;
import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2020-07-28
 */
public interface RmPoMainMapper
{
    /**
     * 查询【请填写功能名称】
     *
     * @param poNum 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    public RmPoMain selectRmPoMainById(String poNum);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param RmPoMain 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<RmPoMain> selectRmPoMainList(RmPoMain RmPoMain);
    /**
     * 修改【请填写功能名称】
     *
     * @param rmPoMain 【请填写功能名称】
     * @return 结果
     */
    public int updateRmPoMain(RmPoMain rmPoMain);
}
