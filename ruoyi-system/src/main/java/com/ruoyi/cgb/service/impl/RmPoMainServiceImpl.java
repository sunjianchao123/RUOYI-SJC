package com.ruoyi.cgb.service.impl;
import com.ruoyi.cgb.domain.RmPoMain;
import com.ruoyi.cgb.mapper.RmPoMainMapper;
import com.ruoyi.cgb.service.IRmPoMainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author ruoyi
 * @date 2020-07-28
 */
@Service
public class RmPoMainServiceImpl implements IRmPoMainService {

    @Autowired
    private RmPoMainMapper RmPoMainMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param poNum 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public RmPoMain selectRmPoMainById(String poNum) {
        return RmPoMainMapper.selectRmPoMainById(poNum);
    }


    /**
     * 查询【请填写功能名称】列表
     *
     * @param RmPoMain 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RmPoMain> selectRmPoMainList(RmPoMain RmPoMain) {
        return RmPoMainMapper.selectRmPoMainList(RmPoMain);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param rmPoMain 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateRmPoMain(RmPoMain rmPoMain)
    {
        return RmPoMainMapper.updateRmPoMain(rmPoMain);
    }
}
