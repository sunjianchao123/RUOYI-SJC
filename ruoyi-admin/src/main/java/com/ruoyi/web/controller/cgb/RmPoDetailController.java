package com.ruoyi.web.controller.cgb;

import java.util.List;

import com.ruoyi.cgb.domain.RmPoDetail;
import com.ruoyi.cgb.service.IRmPoDetailService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 *
 * @author ruoyi
 * @date 2020-07-28
 */
@Controller
@RequestMapping("/cgb/detail")
class RmPoDetailController extends BaseController
{
    private String prefix = "cgb";

    @Autowired
    private IRmPoDetailService rmPoDetailService;

    @RequiresPermissions("cgb:detail:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/detail";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("cgb:detail:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RmPoDetail rmPoDetail)
    {
        startPage();
        List<RmPoDetail> list = rmPoDetailService.selectRmPoDetailList(rmPoDetail);
        return getDataTable(list);
    }
    

}
