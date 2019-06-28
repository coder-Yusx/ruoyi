package com.ruoyi.web.controller.basp;

import com.ruoyi.basp.domain.DjGgQlrmx;
import com.ruoyi.basp.domain.TDataCheck;
import com.ruoyi.basp.service.IDjGgQlrmxService;
import com.ruoyi.basp.service.ITDataCheckService;
import com.ruoyi.common.annotation.Log;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.enums.BusinessType;
import com.ruoyi.common.json.JSONContrast;
import com.ruoyi.common.utils.PageData;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.util.LogUtils;
import net.sf.json.JSONObject;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

/**
 * 权利人明细_簿载层 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-27
 */
@Controller
@RequestMapping("/basp/djGgQlrmx")
public class DjGgQlrmxController extends BaseController
{
    private String prefix = "basp/djGgQlrmx";
	
	@Autowired
	private IDjGgQlrmxService djGgQlrmxService;

	@Autowired
	private ITDataCheckService tDataCheckService;
	
	@RequiresPermissions("basp:djGgQlrmx:view")
	@GetMapping()
	public String djGgQlrmx()
	{
	    return prefix + "/djGgQlrmx";
	}
	
	/**
	 * 查询权利人明细_簿载层列表
	 */
	@RequiresPermissions("basp:djGgQlrmx:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(@RequestBody JSONObject json)
	{
		PageData pd = new PageData();
		pd = this.getPageData();
		if(json!=null){
			Iterator keys = json.keys();
			while (keys.hasNext()){
				String key = String.valueOf(keys.next());
				String value = json.optString(key);
				pd.put(key,value);
			}
		}
		//startPage();
        List<PageData> list = djGgQlrmxService.selectDjGgQlrmxListPageData(pd);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出权利人明细_簿载层列表
	 */
	@RequiresPermissions("basp:djGgQlrmx:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(DjGgQlrmx djGgQlrmx)
    {
    	List<DjGgQlrmx> list = djGgQlrmxService.selectDjGgQlrmxList(djGgQlrmx);
        ExcelUtil<DjGgQlrmx> util = new ExcelUtil<DjGgQlrmx>(DjGgQlrmx.class);
        return util.exportExcel(list, "djGgQlrmx");
    }
	
	/**
	 * 新增权利人明细_簿载层
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存权利人明细_簿载层
	 */
	@RequiresPermissions("basp:djGgQlrmx:add")
	@Log(title = "权利人明细_簿载层", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(DjGgQlrmx djGgQlrmx)
	{		
		return toAjax(djGgQlrmxService.insertDjGgQlrmx(djGgQlrmx));
	}

	/**
	 * 修改权利人明细_簿载层
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		DjGgQlrmx djGgQlrmx = djGgQlrmxService.selectDjGgQlrmxById(id);
		if(djGgQlrmx == null){
			mmap.put("djGgQlrmx", new DjGgQlrmx());
		}else{
			mmap.put("djGgQlrmx", djGgQlrmx);
		}

	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存权利人明细_簿载层
	 */
	@RequiresPermissions("basp:djGgQlrmx:edit")
	@Log(title = "权利人明细_簿载层", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(DjGgQlrmx djGgQlrmx)
	{
		return toAjax(djGgQlrmxService.updateDjGgQlrmx(djGgQlrmx));
	}

	@Log(title = "权利人明细_簿载层", businessType = BusinessType.UPDATE)
	@PostMapping("/editDataClean")
	@ResponseBody
	public AjaxResult editDataCleanSave(DjGgQlrmx djGgQlrmx) throws Exception {
		String tableID = djGgQlrmx.getTableId();
		djGgQlrmx.setTableId(null);
		JSONObject jsonOld = JSONObject.fromObject(djGgQlrmxService.selectDjGgQlrmxById(djGgQlrmx.getId()));
		JSONObject jsonNew = JSONObject.fromObject(djGgQlrmx);
		JSONContrast jsonc = new JSONContrast();
		TDataCheck tDataCheck =new LogUtils().getAll(jsonc.JSONContrast1(jsonOld,jsonNew).toString(),
				jsonc.JSONContrast2(jsonOld,jsonNew).toString(),
				djGgQlrmx.getOwnusername(),
				djGgQlrmx.getTablename(),
				djGgQlrmx.getId());
		//拼接SQL并存入记录表
		if (!tDataCheck.getNewval().equals("{}")) {//未修改条件为空 不存入SQL
			String sql = tDataCheckService.updateSqlAndParamList(tDataCheck.getNewval(),tDataCheck.getCheckIdname(),tDataCheck.getCheckId(),tDataCheck.getCheckOsuser()+'.'+tDataCheck.getCheckTable());
			tDataCheck.setExt3(sql);
		}
		tDataCheck.setTableId(tableID);
		//return toAjax(djGgQlrmxService.updateDjGgQlrmx(djGgQlrmx));
		return  toAjax(tDataCheckService.insertTDataCheck(tDataCheck));
	}
	
	/**
	 * 删除权利人明细_簿载层
	 */
	@RequiresPermissions("basp:djGgQlrmx:remove")
	@Log(title = "权利人明细_簿载层", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(djGgQlrmxService.deleteDjGgQlrmxByIds(ids));
	}
	
}
