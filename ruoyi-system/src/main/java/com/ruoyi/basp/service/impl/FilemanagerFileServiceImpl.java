package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.FilemanagerFileMapper;
import com.ruoyi.basp.domain.FilemanagerFile;
import com.ruoyi.basp.service.IFilemanagerFileService;
import com.ruoyi.common.core.text.Convert;

/**
 * 附件文件 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class FilemanagerFileServiceImpl implements IFilemanagerFileService 
{
	@Autowired
	private FilemanagerFileMapper filemanagerFileMapper;

	/**
     * 查询附件文件信息
     * 
     * @param id 附件文件ID
     * @return 附件文件信息
     */
    @Override
	public FilemanagerFile selectFilemanagerFileById(String id)
	{
	    return filemanagerFileMapper.selectFilemanagerFileById(id);
	}
	
	/**
     * 查询附件文件列表
     * 
     * @param filemanagerFile 附件文件信息
     * @return 附件文件集合
     */
	@Override
	public List<FilemanagerFile> selectFilemanagerFileList(FilemanagerFile filemanagerFile)
	{
	    return filemanagerFileMapper.selectFilemanagerFileList(filemanagerFile);
	}
	
    /**
     * 新增附件文件
     * 
     * @param filemanagerFile 附件文件信息
     * @return 结果
     */
	@Override
	public int insertFilemanagerFile(FilemanagerFile filemanagerFile)
	{
	    return filemanagerFileMapper.insertFilemanagerFile(filemanagerFile);
	}
	
	/**
     * 修改附件文件
     * 
     * @param filemanagerFile 附件文件信息
     * @return 结果
     */
	@Override
	public int updateFilemanagerFile(FilemanagerFile filemanagerFile)
	{
	    return filemanagerFileMapper.updateFilemanagerFile(filemanagerFile);
	}

	/**
     * 删除附件文件对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteFilemanagerFileByIds(String ids)
	{
		return filemanagerFileMapper.deleteFilemanagerFileByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<FilemanagerFile> selectFilemanagerFileByHbId(String id) {
		return filemanagerFileMapper.selectFilemanagerFileByHbId(id);
	}

}
