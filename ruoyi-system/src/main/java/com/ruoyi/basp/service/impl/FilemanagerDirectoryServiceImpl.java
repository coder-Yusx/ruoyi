package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.FilemanagerDirectoryMapper;
import com.ruoyi.basp.domain.FilemanagerDirectory;
import com.ruoyi.basp.service.IFilemanagerDirectoryService;
import com.ruoyi.common.core.text.Convert;

/**
 * 附件文件夹 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class FilemanagerDirectoryServiceImpl implements IFilemanagerDirectoryService 
{
	@Autowired
	private FilemanagerDirectoryMapper filemanagerDirectoryMapper;

	/**
     * 查询附件文件夹信息
     * 
     * @param id 附件文件夹ID
     * @return 附件文件夹信息
     */
    @Override
	public FilemanagerDirectory selectFilemanagerDirectoryById(String id)
	{
	    return filemanagerDirectoryMapper.selectFilemanagerDirectoryById(id);
	}
	
	/**
     * 查询附件文件夹列表
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 附件文件夹集合
     */
	@Override
	public List<FilemanagerDirectory> selectFilemanagerDirectoryList(FilemanagerDirectory filemanagerDirectory)
	{
	    return filemanagerDirectoryMapper.selectFilemanagerDirectoryList(filemanagerDirectory);
	}
	
    /**
     * 新增附件文件夹
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 结果
     */
	@Override
	public int insertFilemanagerDirectory(FilemanagerDirectory filemanagerDirectory)
	{
	    return filemanagerDirectoryMapper.insertFilemanagerDirectory(filemanagerDirectory);
	}
	
	/**
     * 修改附件文件夹
     * 
     * @param filemanagerDirectory 附件文件夹信息
     * @return 结果
     */
	@Override
	public int updateFilemanagerDirectory(FilemanagerDirectory filemanagerDirectory)
	{
	    return filemanagerDirectoryMapper.updateFilemanagerDirectory(filemanagerDirectory);
	}

	/**
     * 删除附件文件夹对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteFilemanagerDirectoryByIds(String ids)
	{
		return filemanagerDirectoryMapper.deleteFilemanagerDirectoryByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<FilemanagerDirectory> selectFilemanagerDirectoryByHbId(String id) {
		return filemanagerDirectoryMapper.selectFilemanagerDirectoryByHbId(id);
	}

}
