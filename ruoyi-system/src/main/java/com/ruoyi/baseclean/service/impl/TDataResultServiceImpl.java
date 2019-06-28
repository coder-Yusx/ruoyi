package com.ruoyi.baseclean.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.baseclean.mapper.TDataResultMapper;
import com.ruoyi.baseclean.domain.TDataResult;
import com.ruoyi.baseclean.service.ITDataResultService;
import com.ruoyi.common.core.text.Convert;

/**
 * 校验结果 服务层实现
 * 
 * @author ruoyi
 * @date 2019-06-11
 */
@Service
public class TDataResultServiceImpl implements ITDataResultService

{
	@Autowired
	private TDataResultMapper tDataResultMapper;

	/**
     * 查询校验结果信息
     * 
     * @param resultId 校验结果ID
     * @return 校验结果信息
     */
    @Override
	public TDataResult selectTDataResultById(Integer resultId)
	{
	    return tDataResultMapper.selectTDataResultById(resultId);
	}
	
	/**
     * 查询校验结果列表
     * 
     * @param tDataResult 校验结果信息
     * @return 校验结果集合
     */
	@Override
	public List<TDataResult> selectTDataResultList(TDataResult tDataResult)
	{
	    return tDataResultMapper.selectTDataResultList(tDataResult);
	}
	
    /**
     * 新增校验结果
     * 
     * @param tDataResult 校验结果信息
     * @return 结果
     */
	@Override
	public int insertTDataResult(TDataResult tDataResult)
	{
	    return tDataResultMapper.insertTDataResult(tDataResult);
	}
	
	/**
     * 修改校验结果
     * 
     * @param tDataResult 校验结果信息
     * @return 结果
     */
	@Override
	public int updateTDataResult(TDataResult tDataResult)
	{
	    return tDataResultMapper.updateTDataResult(tDataResult);
	}

	/**
     * 删除校验结果对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTDataResultByIds(String ids)
	{
		return tDataResultMapper.deleteTDataResultByIds(Convert.toStrArray(ids));
	}

	@Override
	public int insertQueryRuleData(String sql) {
		return tDataResultMapper.insertQueryRuleData(sql);
	}

	public List<TDataResult> selectMaxResult(TDataResult tDataResult){
		return tDataResultMapper.selectMaxResult(tDataResult);
	}

	@Override
	public int reduceResult(String sql) {
		return tDataResultMapper.reduceResult(sql);
	}
}
