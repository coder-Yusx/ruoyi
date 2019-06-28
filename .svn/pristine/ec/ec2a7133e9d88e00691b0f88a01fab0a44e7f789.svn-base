package com.ruoyi.web.controller.basp;

import java.util.*;

import com.ruoyi.basp.domain.TDataDistribution;
import com.ruoyi.common.json.JSONContrast;
import com.ruoyi.framework.util.LogUtils;
import com.ruoyi.framework.util.ShiroUtils;
import com.ruoyi.system.domain.SysPerson;
import net.sf.json.JSONObject;
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
import com.ruoyi.basp.domain.TDataCheck;
import com.ruoyi.basp.service.ITDataCheckService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

import javax.servlet.http.HttpServletRequest;

/**
 * 数据校验修改记录 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
@Controller
@RequestMapping("/basp/tDataCheck")
public class TDataCheckController extends BaseController
{
    private String prefix = "basp/tDataCheck";
	
	@Autowired
	private ITDataCheckService tDataCheckService;
	
	@RequiresPermissions("basp:tDataCheck:view")
	@GetMapping()
	public String tDataCheck()
	{
	    return prefix + "/tDataCheck";
	}
	
	/**
	 * 查询数据校验修改记录列表
	 */
	@RequiresPermissions("basp:tDataCheck:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(TDataCheck tDataCheck)
	{
		startPage();
		//根据用户账号查询对应记录表信息
		SysPerson user = ShiroUtils.getSysUser();
		if (user.getRoles().get(0).getRoleId()==1) {//判断是否有管理员权限
			tDataCheck.setOsuser("");
		}else{
			tDataCheck.setOsuser(user.getLoginName());
		}
        List<TDataCheck> list = tDataCheckService.selectTDataCheckList(tDataCheck);

		return getDataTable(list);
	}
	
	
	/**
	 * 导出数据校验修改记录列表
	 */
	@RequiresPermissions("basp:tDataCheck:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(TDataCheck tDataCheck)
    {
    	List<TDataCheck> list = tDataCheckService.selectTDataCheckList(tDataCheck);
        ExcelUtil<TDataCheck> util = new ExcelUtil<TDataCheck>(TDataCheck.class);
        return util.exportExcel(list, "tDataCheck");
    }
	
	/**
	 * 新增数据校验修改记录
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存数据校验修改记录
	 */
	@RequiresPermissions("basp:tDataCheck:add")
	@Log(title = "数据校验修改记录", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(TDataCheck tDataCheck)
	{		
		return toAjax(tDataCheckService.insertTDataCheck(tDataCheck));
	}

	/**
	 * 修改数据校验修改记录
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		TDataCheck tDataCheck = tDataCheckService.selectTDataCheckById(id);
		mmap.put("tDataCheck", tDataCheck);
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存数据校验修改记录
	 */
	@RequiresPermissions("basp:tDataCheck:edit")
	@Log(title = "数据校验修改记录", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(TDataCheck tDataCheck)
	{		
		return toAjax(tDataCheckService.updateTDataCheck(tDataCheck));
	}
	
	/**
	 * 删除数据校验修改记录
	 */
	@RequiresPermissions("basp:tDataCheck:remove")
	@Log(title = "数据校验修改记录", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(tDataCheckService.deleteTDataCheckByIds(ids));
	}
	
	/**
	 * 查询档次的校验修改记录
	 */
	@GetMapping("/recovery/{id}")
	public String toColClean(@PathVariable("id") String id, ModelMap mmap)
	{
		TDataCheck tDataCheck = tDataCheckService.selectTDataCheckById(id);
		mmap.put("tDataCheck", tDataCheck);
		return prefix + "/recovery";

		/*
		TDataCheck tDataCheck2 = new TDataCheck();
		JSONObject oldJsonObject = JSONObject.fromObject(tDataCheck.getOldval());
		JSONObject newJsonObject = JSONObject.fromObject(tDataCheck.getNewval());
		tDataCheck2.setOldval(new JSONContrast().JSONContrast1(oldJsonObject,newJsonObject).toString());
		tDataCheck2.setNewval(new JSONContrast().JSONContrast2(oldJsonObject,newJsonObject).toString());
		mmap.put("tDataCheck2", tDataCheck2);
		*/
	}

	@Log(title = "还原上一次的数据校验修改记录", businessType = BusinessType.UPDATE)
	@PostMapping("/recoveryById")
	@ResponseBody
	public AjaxResult recoveryById(TDataCheck tDataCheck)
	{
		Map maps = new HashMap<String,String>();
		maps.put("checkOsuser",tDataCheck.getCheckOsuser());
		maps.put("checkTable",tDataCheck.getCheckTable());
		maps.put("checkIdname",tDataCheck.getCheckIdname());
		maps.put("checkId",tDataCheck.getCheckId());

		String updateSql = "";
		JSONObject json = JSONObject.fromObject(tDataCheck.getOldval());
		Iterator keys = json.keys();
		while (keys.hasNext()){
			String key = String.valueOf(keys.next());
			String value = json.optString(key);
			if(keys.hasNext()){
				updateSql += key+ "= '" +value+"',";
			}else{
				updateSql += key+ "= '" +value+"'";
			}
		}
		maps.put("updateSql",updateSql);

		//插入校验修改记录
		tDataCheckService.insertTDataCheck(new LogUtils().getAllOfRecovryTDataCheck(tDataCheck));

		//拼接sql并执行
		return toAjax(tDataCheckService.recoveryById(maps));
	}
}
