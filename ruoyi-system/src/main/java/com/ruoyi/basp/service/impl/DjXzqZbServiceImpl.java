package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.DjXzqZbMapper;
import com.ruoyi.basp.domain.DjXzqZb;
import com.ruoyi.basp.service.IDjXzqZbService;
import com.ruoyi.common.core.text.Convert;

/**
 * ?????_??? 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class DjXzqZbServiceImpl implements IDjXzqZbService 
{
	@Autowired
	private DjXzqZbMapper djXzqZbMapper;

	/**
     * 查询?????_???信息
     * 
     * @param id ?????_???ID
     * @return ?????_???信息
     */
    @Override
	public DjXzqZb selectDjXzqZbById(String id)
	{
	    return djXzqZbMapper.selectDjXzqZbById(id);
	}
	
	/**
     * 查询?????_???列表
     * 
     * @param djXzqZb ?????_???信息
     * @return ?????_???集合
     */
	@Override
	public List<DjXzqZb> selectDjXzqZbList(DjXzqZb djXzqZb)
	{
	    return djXzqZbMapper.selectDjXzqZbList(djXzqZb);
	}
	
    /**
     * 新增?????_???
     * 
     * @param djXzqZb ?????_???信息
     * @return 结果
     */
	@Override
	public int insertDjXzqZb(DjXzqZb djXzqZb)
	{
	    return djXzqZbMapper.insertDjXzqZb(djXzqZb);
	}
	
	/**
     * 修改?????_???
     * 
     * @param djXzqZb ?????_???信息
     * @return 结果
     */
	@Override
	public int updateDjXzqZb(DjXzqZb djXzqZb)
	{
	    return djXzqZbMapper.updateDjXzqZb(djXzqZb);
	}

	/**
     * 删除?????_???对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDjXzqZbByIds(String ids)
	{
		return djXzqZbMapper.deleteDjXzqZbByIds(Convert.toStrArray(ids));
	}
	
}
