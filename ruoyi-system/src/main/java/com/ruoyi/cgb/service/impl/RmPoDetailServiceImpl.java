package com.ruoyi.cgb.service.impl;
import com.ruoyi.cgb.domain.RmPoDetail;
import com.ruoyi.cgb.mapper.RmPoDetailMapper;
import com.ruoyi.cgb.service.IRmPoDetailService;
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
public class RmPoDetailServiceImpl implements IRmPoDetailService {

    @Autowired
    private RmPoDetailMapper RmPoDetailMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param poNum 【请填写功能名称】ID
     * @return 【请填写功能名称】
     */
    @Override
    public RmPoDetail selectRmPoDetailById(String poNum) {
        return RmPoDetailMapper.selectRmPoDetailById(poNum);
    }


    /**
     * 查询【请填写功能名称】列表
     *
     * @param RmPoDetail 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<RmPoDetail> selectRmPoDetailList(RmPoDetail RmPoDetail) {
        return RmPoDetailMapper.selectRmPoDetailList(RmPoDetail);
    }


}
