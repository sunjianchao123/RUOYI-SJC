package com.ruoyi.web.controller.fhtzd;

import com.ruoyi.cgb.domain.RmInvoiceDetaiil;
import com.ruoyi.cgb.service.IRmInvoiceDetaiilService;
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
 * 发货单明细Controller
 * 
 * @author ruoyi
 * @date 2020-08-03
 */
@Controller
@RequestMapping("/fhtzd/edit")
public class RmInvoiceDetaiilController extends BaseController
{
    private String prefix = "fhtzd/edit";

    @Autowired
    private IRmInvoiceDetaiilService rmInvoiceDetaiilService;

    @RequiresPermissions("fhtzd:fhtzd:view")
    @GetMapping()
    public String detaiil()
    {
        return prefix + "/fhtzd";
    }

    /**
     * 查询发货单明细列表
     */
    @RequiresPermissions("fhtzd:detaiil:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        startPage();
        List<RmInvoiceDetaiil> list = rmInvoiceDetaiilService.selectRmInvoiceDetaiilList(rmInvoiceDetaiil);
        return getDataTable(list);
    }

    /**
     * 导出发货单明细列表
     */
    @RequiresPermissions("fhtzd:detaiil:export")
    @Log(title = "发货单明细", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        List<RmInvoiceDetaiil> list = rmInvoiceDetaiilService.selectRmInvoiceDetaiilList(rmInvoiceDetaiil);
        ExcelUtil<RmInvoiceDetaiil> util = new ExcelUtil<RmInvoiceDetaiil>(RmInvoiceDetaiil.class);
        return util.exportExcel(list, "detaiil");
    }

    /**
     * 新增发货单明细
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存发货单明细
     */
    @RequiresPermissions("fhtzd:detaiil:add")
    @Log(title = "发货单明细", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        return toAjax(rmInvoiceDetaiilService.insertRmInvoiceDetaiil(rmInvoiceDetaiil));
    }

    /**
     * 修改发货单明细
     */
    @GetMapping("/edit/{wlxxid}")
    public String edit(@PathVariable("wlxxid") String wlxxid, ModelMap mmap)
    {
        RmInvoiceDetaiil rmInvoiceDetaiil = rmInvoiceDetaiilService.selectRmInvoiceDetaiilById(wlxxid);
        mmap.put("rmInvoiceDetaiil", rmInvoiceDetaiil);
        return prefix + "/edit";
    }

    /**
     * 修改保存发货单明细
     */
    @RequiresPermissions("fhtzd:detaiil:edit")
    @Log(title = "发货单明细", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(RmInvoiceDetaiil rmInvoiceDetaiil)
    {
        return toAjax(rmInvoiceDetaiilService.updateRmInvoiceDetaiil(rmInvoiceDetaiil));
    }

    /**
     * 删除发货单明细
     */
    @RequiresPermissions("fhtzd:detaiil:remove")
    @Log(title = "发货单明细", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(rmInvoiceDetaiilService.deleteRmInvoiceDetaiilByIds(ids));
    }
}
