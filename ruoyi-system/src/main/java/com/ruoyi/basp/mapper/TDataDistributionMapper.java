package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.TDataDistribution;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 数据分配 数据层
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public interface TDataDistributionMapper 
{
	/**
     * 查询数据分配信息
     * 
     * @param id 数据分配ID
     * @return 数据分配信息
     */
	public TDataDistribution selectTDataDistributionById(String id);


	/**
	 * 根据系统登录用户查询信息
	 *
	 * @param tDataDistribution
	 * @return 数据分配信息
	 */
	public TDataDistribution selectTDataDistributionListUser(TDataDistribution tDataDistribution);
	
	/**
     * 查询数据分配列表
     * 
     * @param tDataDistribution 数据分配信息
     * @return 数据分配集合
     */
	public List<TDataDistribution> selectTDataDistributionList(TDataDistribution tDataDistribution);
	
	/**
     * 新增数据分配
     * 
     * @param tDataDistribution 数据分配信息
     * @return 结果
     */
	public int insertTDataDistribution(TDataDistribution tDataDistribution);
	
	/**
     * 修改数据分配
     * 
     * @param tDataDistribution 数据分配信息
     * @return 结果
     */
	public int updateTDataDistribution(TDataDistribution tDataDistribution);
	
	/**
     * 删除数据分配
     * 
     * @param id 数据分配ID
     * @return 结果
     */
	public int deleteTDataDistributionById(String id);
	
	/**
     * 批量删除数据分配
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataDistributionByIds(String[] ids);
	
}