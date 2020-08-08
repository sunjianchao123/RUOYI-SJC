package com.ruoyi.web.controller.fhtzd;

import com.ruoyi.cgb.domain.RmInvoiceMain;
import com.ruoyi.cgb.service.IRmInvoiceMainService;
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
import java.util.List;

/**
 * 发货单主Controller
 *
 * @author ruoyi
 * @date 2020-08-03
 */
@Controller
@RequestMapping("/fhtzd/main")
public class RmInvoiceMainController extends BaseController
{
    private String prefix = "fhtzd";

    @Autowired
    private IRmInvoiceMainService rmInvoiceMainService;

    @RequiresPermissions("fhtzd:main:view")
    @GetMapping()
    public String main()
    {
        return prefix + "/main";
    }

    /**
     * 查询发货单主列表
     */
    @RequiresPermissions("fhtzd:main:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RmInvoiceMain rmInvoiceMain)
    {
        startPage();
        List<RmInvoiceMain> list = rmInvoiceMainService.selectRmInvoiceMainList(rmInvoiceMain);
        return getDataTable(list);
    }

    /**
     * 导出发货单主列表
     */
    @RequiresPermissions("fhtzd:main:export")
    @Log(title = "发货单主", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RmInvoiceMain rmInvoiceMain)
    {
        List<RmInvoiceMain> list = rmInvoiceMainService.selectRmInvoiceMainList(rmInvoiceMain);
        ExcelUtil<RmInvoiceMain> util = new ExcelUtil<RmInvoiceMain>(RmInvoiceMain.class);
        return util.exportExcel(list, "main");
    }

    /**
     * 修改发货单主
     */
    @GetMapping("/edit/{invoiceNum}")
    public String edit(@PathVariable("invoiceNum") String invoiceNum, ModelMap mmap)
    {
        RmInvoiceMain rmInvoiceMain = rmInvoiceMainService.selectRmInvoiceMainById(invoiceNum);
        mmap.put("rmInvoiceMain", rmInvoiceMain);
        return prefix + "/edit";
    }

    /**
     * 修改保存发货单主
     */
    @RequiresPermissions("fhtzd:main:edit")
    @Log(title = "发货单主", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RmInvoiceMain rmInvoiceMain)
    {
        return toAjax(rmInvoiceMainService.updateRmInvoiceMain(rmInvoiceMain));
    }

}
