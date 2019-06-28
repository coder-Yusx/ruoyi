package com.ruoyi.baseclean.mapper;

import com.ruoyi.baseclean.domain.TDataResult;
import java.util.List;	

/**
 * 校验结果 数据层
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
public interface TDataResultMapper 
{
	/**
     * 查询校验结果信息
     * 
     * @param resultId 校验结果ID
     * @return 校验结果信息
     */
	public TDataResult selectTDataResultById(Integer resultId);
	
	/**
     * 查询校验结果列表
     * 
     * @param tDataResult 校验结果信息
     * @return 校验结果集合
     */
	public List<TDataResult> selectTDataResultList(TDataResult tDataResult);
	
	/**
     * 新增校验结果
     * 
     * @param tDataResult 校验结果信息
     * @return 结果
     */
	public int insertTDataResult(TDataResult tDataResult);
	
	/**
     * 修改校验结果
     * 
     * @param tDataResult 校验结果信息
     * @return 结果
     */
	public int updateTDataResult(TDataResult tDataResult);
	
	/**
     * 删除校验结果
     * 
     * @param resultId 校验结果ID
     * @return 结果
     */
	public int deleteTDataResultById(Integer resultId);
	
	/**
     * 批量删除校验结果
     * 
     * @param resultIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataResultByIds(String[] resultIds);

	public int insertQueryRuleData(String sql);

	public List<TDataResult> selectMaxResult(TDataResult tDataResult);

	public int reduceResult(String sql);
}