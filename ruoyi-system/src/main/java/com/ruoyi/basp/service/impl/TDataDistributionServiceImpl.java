package com.ruoyi.basp.service.impl;

import java.util.List;

import com.ruoyi.common.core.domain.Common;
import com.ruoyi.system.domain.SysPerson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.TDataDistributionMapper;
import com.ruoyi.basp.domain.TDataDistribution;
import com.ruoyi.basp.service.ITDataDistributionService;
import com.ruoyi.common.core.text.Convert;

import javax.security.auth.Subject;

/**
 * 数据分配 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
@Service
public class TDataDistributionServiceImpl implements ITDataDistributionService 
{
	@Autowired
	private TDataDistributionMapper tDataDistributionMapper;

	/**
     * 查询数据分配信息
     * 
     * @param id 数据分配ID
     * @return 数据分配信息
     */
    @Override
	public TDataDistribution selectTDataDistributionById(String id)
	{
	    return tDataDistributionMapper.selectTDataDistributionById(id);
	}
	
	/**
     * 查询数据分配列表
     * 
     * @param tDataDistribution 数据分配信息
     * @return 数据分配集合
     */
	@Override
	public List<TDataDistribution> selectTDataDistributionList(TDataDistribution tDataDistribution)
	{
	    return tDataDistributionMapper.selectTDataDistributionList(tDataDistribution);
	}
	
    /**
     * 新增数据分配
     * 
     * @param tDataDistribution 数据分配信息
     * @return 结果
     */
	@Override
	public int insertTDataDistribution(TDataDistribution tDataDistribution)
	{
		tDataDistribution.setId(Common.getUUID());
		tDataDistribution.setOsdate(Common.getTime());
		tDataDistribution.setState("0");
	    return tDataDistributionMapper.insertTDataDistribution(tDataDistribution);
	}
	
	/**
     * 修改数据分配
     * R
     * @param tDataDistribution 数据分配信息
     * @return 结果
     */
	@Override
	public int updateTDataDistribution(TDataDistribution tDataDistribution)
	{
	    return tDataDistributionMapper.updateTDataDistribution(tDataDistribution);
	}

	/**
     * 删除数据分配对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTDataDistributionByIds(String ids)
	{
		return tDataDistributionMapper.deleteTDataDistributionByIds(Convert.toStrArray(ids));
	}

	@Override
	public TDataDistribution selectTDataDistributionListUser(TDataDistribution tDataDistribution) {
		return tDataDistributionMapper.selectTDataDistributionListUser(tDataDistribution);
	}

}
