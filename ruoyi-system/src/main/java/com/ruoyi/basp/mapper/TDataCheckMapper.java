package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.TDataCheck;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * 数据校验修改记录 数据层
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
public interface TDataCheckMapper 
{
	/**
     * 查询数据校验修改记录信息
     * 
     * @param id 数据校验修改记录ID
     * @return 数据校验修改记录信息
     */
	public TDataCheck selectTDataCheckById(String id);
	
	/**
     * 查询数据校验修改记录列表
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 数据校验修改记录集合
     */
	public List<TDataCheck> selectTDataCheckList(TDataCheck tDataCheck);
	
	/**
     * 新增数据校验修改记录
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 结果
     */
	public int insertTDataCheck(TDataCheck tDataCheck);
	
	/**
     * 修改数据校验修改记录
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 结果
     */
	public int updateTDataCheck(TDataCheck tDataCheck);
	
	/**
     * 删除数据校验修改记录
     * 
     * @param id 数据校验修改记录ID
     * @return 结果
     */
	public int deleteTDataCheckById(String id);
	
	/**
     * 批量删除数据校验修改记录
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataCheckByIds(String[] ids);

	public int recoveryById(Map<String,String> maps);

	public int updateById(TDataCheck tDataCheck);

	public List<TDataCheck> selectTDataCheckByTableId(String TableId);

	public int updatesql(@Param("ext3") String ext3);
}