package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.DjDyqZbMapper;
import com.ruoyi.basp.domain.DjDyqZb;
import com.ruoyi.basp.service.IDjDyqZbService;
import com.ruoyi.common.core.text.Convert;

/**
 * ?????_??? 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class DjDyqZbServiceImpl implements IDjDyqZbService 
{
	@Autowired
	private DjDyqZbMapper djDyqZbMapper;

	/**
     * 查询?????_???信息
     * 
     * @param id ?????_???ID
     * @return ?????_???信息
     */
    @Override
	public DjDyqZb selectDjDyqZbById(String id)
	{
	    return djDyqZbMapper.selectDjDyqZbById(id);
	}
	
	/**
     * 查询?????_???列表
     * 
     * @param djDyqZb ?????_???信息
     * @return ?????_???集合
     */
	@Override
	public List<DjDyqZb> selectDjDyqZbList(DjDyqZb djDyqZb)
	{
	    return djDyqZbMapper.selectDjDyqZbList(djDyqZb);
	}
	
    /**
     * 新增?????_???
     * 
     * @param djDyqZb ?????_???信息
     * @return 结果
     */
	@Override
	public int insertDjDyqZb(DjDyqZb djDyqZb)
	{
	    return djDyqZbMapper.insertDjDyqZb(djDyqZb);
	}
	
	/**
     * 修改?????_???
     * 
     * @param djDyqZb ?????_???信息
     * @return 结果
     */
	@Override
	public int updateDjDyqZb(DjDyqZb djDyqZb)
	{
	    return djDyqZbMapper.updateDjDyqZb(djDyqZb);
	}

	/**
     * 删除?????_???对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDjDyqZbByIds(String ids)
	{
		return djDyqZbMapper.deleteDjDyqZbByIds(Convert.toStrArray(ids));
	}
	
}
