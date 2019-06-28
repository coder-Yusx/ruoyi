package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.FilemanagerDirectory;
import java.util.List;	

/**
 * 附件文件夹 数据层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface FilemanagerDirectoryMapper 
{
	/**
     * 查询附件文件夹信息
     * 
     * @param id 附件文件夹ID
     * @return 附件文件夹信息
     */
	public FilemanagerDirectory selectFilemanagerDirectoryById(String id);
	
	/**
     * 查询附件文件夹列表
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 附件文件夹集合
     */
	public List<FilemanagerDirectory> selectFilemanagerDirectoryList(FilemanagerDirectory filemanagerDirectory);
	
	/**
     * 新增附件文件夹
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 结果
     */
	public int insertFilemanagerDirectory(FilemanagerDirectory filemanagerDirectory);
	
	/**
     * 修改附件文件夹
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 结果
     */
	public int updateFilemanagerDirectory(FilemanagerDirectory filemanagerDirectory);
	
	/**
     * 删除附件文件夹
     * 
     * @param id 附件文件夹ID
     * @return 结果
     */
	public int deleteFilemanagerDirectoryById(String id);
	
	/**
     * 批量删除附件文件夹
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteFilemanagerDirectoryByIds(String[] ids);

	public List<FilemanagerDirectory> selectFilemanagerDirectoryByHbId(String id);
}