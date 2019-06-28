package com.ruoyi.baseclean.mapper;

import com.ruoyi.baseclean.domain.TDataRule;

import java.util.List;

/**
 * 校验规则 数据层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface TDataRuleMapper 
{
	/**
     * 查询校验规则信息
     * 
     * @param ruleId 校验规则ID
     * @return 校验规则信息
     */
	public TDataRule selectTDataRuleById(Integer ruleId);
	
	/**
     * 查询校验规则列表
     * 
     * @param tDataRule 校验规则信息
     * @return 校验规则集合
     */
	public List<TDataRule> selectTDataRuleList(TDataRule tDataRule);
	
	/**
     * 新增校验规则
     * 
     * @param tDataRule 校验规则信息
     * @return 结果
     */
	public int insertTDataRule(TDataRule tDataRule);
	
	/**
     * 修改校验规则
     * 
     * @param tDataRule 校验规则信息
     * @return 结果
     */
	public int updateTDataRule(TDataRule tDataRule);
	
	/**
     * 删除校验规则
     * 
     * @param ruleId 校验规则ID
     * @return 结果
     */
	public int deleteTDataRuleById(Integer ruleId);
	
	/**
     * 批量删除校验规则
     * 
     * @param ruleIds 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataRuleByIds(String[] ruleIds);

}