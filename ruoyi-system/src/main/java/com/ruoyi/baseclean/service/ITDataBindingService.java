package com.ruoyi.baseclean.service;

import com.ruoyi.baseclean.domain.DataResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.baseclean.domain.TDataResult;

import java.util.List;
import java.util.Map;

/**
 * 列-规则绑定 服务层
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
public interface ITDataBindingService 
{
	/**
     * 查询列-规则绑定信息
     * 
     * @param bindId 列-规则绑定ID
     * @return 列-规则绑定信息
     */
	public TDataBinding selectTDataBindingById(Integer bindId);
	
	/**
     * 查询列-规则绑定列表
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 列-规则绑定集合
     */
	public List<TDataBinding> selectTDataBindingList(TDataBinding tDataBinding);
	
	/**
     * 新增列-规则绑定
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 结果
     */
	public int insertTDataBinding(TDataBinding tDataBinding);
	
	/**
     * 修改列-规则绑定
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 结果
     */
	public int updateTDataBinding(TDataBinding tDataBinding);
		
	/**
     * 删除列-规则绑定信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataBindingByIds(String ids);

	public String[] selectPrimaryKey(String tableName);

	public List<TDataResult> selectQueryRuleResult(String sql);
}
