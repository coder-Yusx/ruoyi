package com.ruoyi.web.controller.basp;

import java.util.List;

import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysPerson;
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
import com.ruoyi.basp.domain.TDataDistribution;
import com.ruoyi.basp.service.ITDataDistributionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 数据分配 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/basp/tDataDistribution")
public class TDataDistributionController extends BaseController
{
    private String prefix = "basp/tDataDistribution";
	
	@Autowired
	private ITDataDistributionService tDataDistributionService;
	
	@RequiresPermissions("basp:tDataDistribution:view")
	@GetMapping()
	public String tDataDistribution()
	{
	    return prefix + "/tDataDistribution";
	}
	
	/**
	 * 查询数据分配列表
	 */
	@RequiresPermissions("basp:tDataDistribution:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TDataDistribution tDataDistribution)
	{
		startPage();
		//根据用户账号查询对应记录表信息
		SysPerson user = ShiroUtils.getSysUser();
		if (user.getRoles().get(0).getRoleId()==1) {//判断是否有管理员权限
			tDataDistribution.setRid("");
		}else{
			tDataDistribution.setRid(user.getUserId().toString());
		}
        List<TDataDistribution> list = tDataDistributionService.selectTDataDistributionList(tDataDistribution);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出数据分配列表
	 */
	@RequiresPermissions("basp:tDataDistribution:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TDataDistribution tDataDistribution)
    {
    	List<TDataDistribution> list = tDataDistributionService.selectTDataDistributionList(tDataDistribution);
        ExcelUtil<TDataDistribution> util = new ExcelUtil<TDataDistribution>(TDataDistribution.class);
        return util.exportExcel(list, "tDataDistribution");
    }
	
	/**
	 * 新增数据分配
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/user";
	}
	
	/**
	 * 新增保存数据分配
	 */
	@RequiresPermissions("basp:tDataDistribution:add")
	@Log(title = "数据分配", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TDataDistribution tDataDistribution)
	{
		SysPerson user = ShiroUtils.getSysUser();
		tDataDistribution.setOperator(user.getUserName());
		return toAjax(tDataDistributionService.insertTDataDistribution(tDataDistribution));
	}

	/**
	 * 修改数据分配
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		TDataDistribution tDataDistribution = tDataDistributionService.selectTDataDistributionById(id);
		mmap.put("tDataDistribution", tDataDistribution);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存数据分配
	 */
	@RequiresPermissions("basp:tDataDistribution:edit")
	@Log(title = "数据分配", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TDataDistribution tDataDistribution)
	{		
		return toAjax(tDataDistributionService.updateTDataDistribution(tDataDistribution));
	}
	
	/**
	 * 删除数据分配
	 */
	@RequiresPermissions("basp:tDataDistribution:remove")
	@Log(title = "数据分配", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tDataDistributionService.deleteTDataDistributionByIds(ids));
	}
	
}
