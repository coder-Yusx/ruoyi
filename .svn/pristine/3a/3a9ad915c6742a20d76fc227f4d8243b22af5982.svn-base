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
import com.ruoyi.basp.domain.FilemanagerFile;
import com.ruoyi.basp.service.IFilemanagerFileService;
import com.ruoyi.common.core.controller.BaseController;
import com.ruoyi.common.core.page.TableDataInfo;
import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;

/**
 * 附件文件 信息操作处理
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Controller
@RequestMapping("/basp/filemanagerFile")
public class FilemanagerFileController extends BaseController
{
    private String prefix = "basp/filemanagerFile";
	
	@Autowired
	private IFilemanagerFileService filemanagerFileService;
	
	@RequiresPermissions("basp:filemanagerFile:view")
	@GetMapping()
	public String filemanagerFile()
	{
	    return prefix + "/filemanagerFile";
	}
	
	/**
	 * 查询附件文件列表
	 */
	@RequiresPermissions("basp:filemanagerFile:list")
	@PostMapping("/list")
	@ResponseBody
	public TableDataInfo list(FilemanagerFile filemanagerFile)
	{
		startPage();
        List<FilemanagerFile> list = filemanagerFileService.selectFilemanagerFileList(filemanagerFile);
		return getDataTable(list);
	}
	
	
	/**
	 * 导出附件文件列表
	 */
	@RequiresPermissions("basp:filemanagerFile:export")
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(FilemanagerFile filemanagerFile)
    {
    	List<FilemanagerFile> list = filemanagerFileService.selectFilemanagerFileList(filemanagerFile);
        ExcelUtil<FilemanagerFile> util = new ExcelUtil<FilemanagerFile>(FilemanagerFile.class);
        return util.exportExcel(list, "filemanagerFile");
    }
	
	/**
	 * 新增附件文件
	 */
	@GetMapping("/add")
	public String add()
	{
	    return prefix + "/add";
	}
	
	/**
	 * 新增保存附件文件
	 */
	@RequiresPermissions("basp:filemanagerFile:add")
	@Log(title = "附件文件", businessType = BusinessType.INSERT)
	@PostMapping("/add")
	@ResponseBody
	public AjaxResult addSave(FilemanagerFile filemanagerFile)
	{		
		return toAjax(filemanagerFileService.insertFilemanagerFile(filemanagerFile));
	}

	/**
	 * 修改附件文件
	 */
	@GetMapping("/edit/{id}")
	public String edit(@PathVariable("id") String id, ModelMap mmap)
	{
		FilemanagerFile filemanagerFile = filemanagerFileService.selectFilemanagerFileById(id);
		if(filemanagerFile == null){
			mmap.put("filemanagerFile", new FilemanagerFile());
		}else{
			mmap.put("filemanagerFile", filemanagerFile);
		}
	    return prefix + "/edit";
	}
	
	/**
	 * 修改保存附件文件
	 */
	@RequiresPermissions("basp:filemanagerFile:edit")
	@Log(title = "附件文件", businessType = BusinessType.UPDATE)
	@PostMapping("/edit")
	@ResponseBody
	public AjaxResult editSave(FilemanagerFile filemanagerFile)
	{		
		return toAjax(filemanagerFileService.updateFilemanagerFile(filemanagerFile));
	}
	
	/**
	 * 删除附件文件
	 */
	@RequiresPermissions("basp:filemanagerFile:remove")
	@Log(title = "附件文件", businessType = BusinessType.DELETE)
	@PostMapping( "/remove")
	@ResponseBody
	public AjaxResult remove(String ids)
	{		
		return toAjax(filemanagerFileService.deleteFilemanagerFileByIds(ids));
	}
	
}
