package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.DjQzFwsyqzMapper;
import com.ruoyi.basp.domain.DjQzFwsyqz;
import com.ruoyi.basp.service.IDjQzFwsyqzService;
import com.ruoyi.common.core.text.Convert;

/**
 * ???? 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class DjQzFwsyqzServiceImpl implements IDjQzFwsyqzService 
{
	@Autowired
	private DjQzFwsyqzMapper djQzFwsyqzMapper;

	/**
     * 查询????信息
     * 
     * @param id ????ID
     * @return ????信息
     */
    @Override
	public DjQzFwsyqz selectDjQzFwsyqzById(String id)
	{
	    return djQzFwsyqzMapper.selectDjQzFwsyqzById(id);
	}
	
	/**
     * 查询????列表
     * 
     * @param djQzFwsyqz ????信息
     * @return ????集合
     */
	@Override
	public List<DjQzFwsyqz> selectDjQzFwsyqzList(DjQzFwsyqz djQzFwsyqz)
	{
	    return djQzFwsyqzMapper.selectDjQzFwsyqzList(djQzFwsyqz);
	}
	
    /**
     * 新增????
     * 
     * @param djQzFwsyqz ????信息
     * @return 结果
     */
	@Override
	public int insertDjQzFwsyqz(DjQzFwsyqz djQzFwsyqz)
	{
	    return djQzFwsyqzMapper.insertDjQzFwsyqz(djQzFwsyqz);
	}
	
	/**
     * 修改????
     * 
     * @param djQzFwsyqz ????信息
     * @return 结果
     */
	@Override
	public int updateDjQzFwsyqz(DjQzFwsyqz djQzFwsyqz)
	{
	    return djQzFwsyqzMapper.updateDjQzFwsyqz(djQzFwsyqz);
	}

	/**
     * 删除????对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDjQzFwsyqzByIds(String ids)
	{
		return djQzFwsyqzMapper.deleteDjQzFwsyqzByIds(Convert.toStrArray(ids));
	}
	
}
