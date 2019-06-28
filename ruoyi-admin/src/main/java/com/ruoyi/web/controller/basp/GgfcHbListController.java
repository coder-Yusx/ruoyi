package com.ruoyi.web.controller.basp;

import com.ruoyi.basp.domain.GgfcHb;
import com.ruoyi.basp.service.IGgfcHbService;
import com.ruoyi.basp.service.ITDataDistributionService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.Common;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.utils.poi.ExcelUtil;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 公共户 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
@Controller
@RequestMapping("/basp/ggfcHbList")
public class GgfcHbListController extends BaseController {
	private String prefix = "basp/ggfcHbList";

	@Autowired
	private IGgfcHbService ggfcHbService;


	@Autowired
	private ITDataDistributionService tDataDistributionService;

	@RequiresPermissions("basp:ggfcHbList:view")
	@GetMapping()
	public String ggfcHb() {
		return prefix + "/ggfcHbList";
	}

	/**
	 * 查询公共户列表
	 */
	@RequiresPermissions("basp:ggfcHb:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(GgfcHb ggfcHb)
	{
		List<GgfcHb> list = null;
		if(Common.notEmpty(ggfcHb.getExt10())){
				if (ggfcHb.getExt10().equals("4")) {
					ggfcHb.setExt10(null);
				}
			startPage();
			list= ggfcHbService.selectGgfcHbListown(ggfcHb);
		}else{
			ggfcHb.setExt10("");
			startPage();
			list = ggfcHbService.selectGgfcHbListown(ggfcHb);
		}

		return getDataTable(list);
	}


	/**
	 * 导出公共户列表
	 */
	@RequiresPermissions("basp:ggfcHbList:export")
	@PostMapping("/export")
	@ResponseBody
	public AjaxResult export(GgfcHb ggfcHb) {
		List<GgfcHb> list = ggfcHbService.selectGgfcHbList(ggfcHb);
		ExcelUtil<GgfcHb> util = new ExcelUtil<GgfcHb>(GgfcHb.class);
		return util.exportExcel(list, "ggfcHb");
	}
}
