package com.ruoyi.baseclean.service.impl;

import com.ruoyi.baseclean.domain.DataResult;
import com.ruoyi.baseclean.domain.TDataBinding;
import com.ruoyi.baseclean.domain.TDataResult;
import com.ruoyi.baseclean.mapper.TDataBindingMapper;
import com.ruoyi.baseclean.service.ITDataBindingService;
import com.ruoyi.common.core.text.Convert;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 列-规则绑定 服务层实现
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
@Service
public class TDataBindingServiceImpl implements ITDataBindingService 
{
	@Autowired
	private TDataBindingMapper tDataBindingMapper;

	/**
     * 查询列-规则绑定信息
     * 
     * @param bindId 列-规则绑定ID
     * @return 列-规则绑定信息
     */
    @Override
	public TDataBinding selectTDataBindingById(Integer bindId)
	{
	    return tDataBindingMapper.selectTDataBindingById(bindId);
	}
	
	/**
     * 查询列-规则绑定列表
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 列-规则绑定集合
     */
	@Override
	public List<TDataBinding> selectTDataBindingList(TDataBinding tDataBinding)
	{
	    return tDataBindingMapper.selectTDataBindingList(tDataBinding);
	}
	
    /**
     * 新增列-规则绑定
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 结果
     */
	@Override
	public int insertTDataBinding(TDataBinding tDataBinding)
	{
	    return tDataBindingMapper.insertTDataBinding(tDataBinding);
	}
	
	/**
     * 修改列-规则绑定
     * 
     * @param tDataBinding 列-规则绑定信息
     * @return 结果
     */
	@Override
	public int updateTDataBinding(TDataBinding tDataBinding)
	{
	    return tDataBindingMapper.updateTDataBinding(tDataBinding);
	}

	/**
     * 删除列-规则绑定对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTDataBindingByIds(String ids)
	{
		return tDataBindingMapper.deleteTDataBindingByIds(Convert.toStrArray(ids));
	}

	@Override
	public String[] selectPrimaryKey(String tableName) {
		return tDataBindingMapper.selectPrimaryKey(tableName);
	}

	@Override
	public List<TDataResult> selectQueryRuleResult(String sql) {
		return tDataBindingMapper.selectQueryRuleResult(sql);
	}

}
