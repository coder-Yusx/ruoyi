package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.FilemanagerFile;
import java.util.List;	

/**
 * 附件文件 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface FilemanagerFileMapper 
{
	/**
     * 查询附件文件信息
     * 
     * @param id 附件文件ID
     * @return 附件文件信息
     */
	public FilemanagerFile selectFilemanagerFileById(String id);
	
	/**
     * 查询附件文件列表
     * 
     * @param filemanagerFile 附件文件信息
     * @return 附件文件集合
     */
	public List<FilemanagerFile> selectFilemanagerFileList(FilemanagerFile filemanagerFile);
	
	/**
     * 新增附件文件
     * 
     * @param filemanagerFile 附件文件信息
     * @return 结果
     */
	public int insertFilemanagerFile(FilemanagerFile filemanagerFile);
	
	/**
     * 修改附件文件
     * 
     * @param filemanagerFile 附件文件信息
     * @return 结果
     */
	public int updateFilemanagerFile(FilemanagerFile filemanagerFile);
	
	/**
     * 删除附件文件
     * 
     * @param id 附件文件ID
     * @return 结果
     */
	public int deleteFilemanagerFileById(String id);
	
	/**
     * 批量删除附件文件
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFilemanagerFileByIds(String[] ids);

	public List<FilemanagerFile> selectFilemanagerFileByHbId(String id);
}