package com.ruoyi.web.controller.basp;

import java.util.List;
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
import com.ruoyi.basp.domain.DjGgHmx;
import com.ruoyi.basp.service.IDjGgHmxService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 户明细_簿载 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
@Controller
@RequestMapping("/basp/djGgHmx")
public class DjGgHmxController extends BaseController
{
    private String prefix = "basp/djGgHmx";
	
	@Autowired
	private IDjGgHmxService djGgHmxService;
	
	@RequiresPermissions("basp:djGgHmx:view")
	@GetMapping()
	public String djGgHmx()
	{
	    return prefix + "/djGgHmx";
	}
	
	/**
	 * 查询户明细_簿载列表
	 */
	@RequiresPermissions("basp:djGgHmx:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(DjGgHmx djGgHmx)
	{
		startPage();
        List<DjGgHmx> list = djGgHmxService.selectDjGgHmxList(djGgHmx);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出户明细_簿载列表
	 */
	@RequiresPermissions("basp:djGgHmx:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DjGgHmx djGgHmx)
    {
    	List<DjGgHmx> list = djGgHmxService.selectDjGgHmxList(djGgHmx);
        ExcelUtil<DjGgHmx> util = new ExcelUtil<DjGgHmx>(DjGgHmx.class);
        return util.exportExcel(list, "djGgHmx");
    }
	
	/**
	 * 新增户明细_簿载
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存户明细_簿载
	 */
	@RequiresPermissions("basp:djGgHmx:add")
	@Log(title = "户明细_簿载", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DjGgHmx djGgHmx)
	{		
		return toAjax(djGgHmxService.insertDjGgHmx(djGgHmx));
	}

	/**
	 * 修改户明细_簿载
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		DjGgHmx djGgHmx = djGgHmxService.selectDjGgHmxById(id);
		mmap.put("djGgHmx", djGgHmx);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存户明细_簿载
	 */
	@RequiresPermissions("basp:djGgHmx:edit")
	@Log(title = "户明细_簿载", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DjGgHmx djGgHmx)
	{		
		return toAjax(djGgHmxService.updateDjGgHmx(djGgHmx));
	}
	
	/**
	 * 删除户明细_簿载
	 */
	@RequiresPermissions("basp:djGgHmx:remove")
	@Log(title = "户明细_簿载", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(djGgHmxService.deleteDjGgHmxByIds(ids));
	}
	
}
