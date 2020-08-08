package com.ruoyi.web.controller.zcdgl;

import com.ruoyi.cgb.domain.RmTruckMain;
import com.ruoyi.cgb.service.IRmTruckMainService;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;

import java.util.List;

/**
 * 装车单主Controller
 * 
 * @author ruoyi
 * @date 2020-08-07
 */
@Controller
@RequestMapping("/zcdgl/main")
public class RmTruckMainController extends BaseController
{
    private String prefix = "zcdgl";

    @Autowired
    private IRmTruckMainService rmTruckMainService;

    @RequiresPermissions("zcdgl:main:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/main";
    }

    /**
     * 查询装车单主列表
     */
    @RequiresPermissions("zcdgl:main:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RmTruckMain rmTruckMain)
    {
        startPage();
        List<RmTruckMain> list = rmTruckMainService.selectRmTruckMainList(rmTruckMain);
        return getDataTable(list);
    }

    /**
     * 导出装车单主列表
     */
    @RequiresPermissions("zcdgl:main:export")
    @Log(title = "装车单主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RmTruckMain rmTruckMain)
    {
        List<RmTruckMain> list = rmTruckMainService.selectRmTruckMainList(rmTruckMain);
        ExcelUtil<RmTruckMain> util = new ExcelUtil<RmTruckMain>(RmTruckMain.class);
        return util.exportExcel(list, "main");
    }


    /**
     * 修改装车单主
     */
    @GetMapping("/edit/{truckNum}")
    public String edit(@PathVariable("truckNum") String truckNum, ModelMap mmap)
    {
        RmTruckMain rmTruckMain = rmTruckMainService.selectRmTruckMainById(truckNum);
        mmap.put("rmTruckMain", rmTruckMain);
        return prefix + "/edit";
    }

    /**
     * 修改保存装车单主
     */
    @RequiresPermissions("zcdgl:main:edit")
    @Log(title = "装车单主", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RmTruckMain rmTruckMain)
    {
        return toAjax(rmTruckMainService.updateRmTruckMain(rmTruckMain));
    }
}
