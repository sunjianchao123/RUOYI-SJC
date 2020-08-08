package com.ruoyi.web.controller.cgb;

import java.util.List;

import com.ruoyi.cgb.domain.RmPoMain;
import com.ruoyi.cgb.service.IRmPoMainService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2020-07-28
 */
@Controller
@RequestMapping("/cgb/main")
public class RmPoMainController extends BaseController
{
    private String prefix = "cgb";

    @Autowired
    private IRmPoMainService rmPoMainService;

    @RequiresPermissions("cgb:main:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/main";
    }

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("cgb:main:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RmPoMain rmPoMain)
    {
        startPage();
        List<RmPoMain> list = rmPoMainService.selectRmPoMainList(rmPoMain);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("cgb:main:export")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RmPoMain rmPoMain)
    {
        List<RmPoMain> list = rmPoMainService.selectRmPoMainList(rmPoMain);
        ExcelUtil<RmPoMain> util = new ExcelUtil<RmPoMain>(RmPoMain.class);
        return util.exportExcel(list, "main");
    }

    /**
     * 修改【请填写功能名称】
     */
    @GetMapping("/edit/{poNum}")
    public String edit(@PathVariable("poNum") String poNum, ModelMap mmap)
    {
        RmPoMain rmPoMain = rmPoMainService.selectRmPoMainById(poNum);
        mmap.put("rmPoMain", rmPoMain);
        return prefix + "/detail";
    }

    /**
     * 修改保存【请填写功能名称】
     */
    @RequiresPermissions("cgb:main:edit")
    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RmPoMain rmPoMain)
    {
        return toAjax(rmPoMainService.updateRmPoMain(rmPoMain));
    }

}
