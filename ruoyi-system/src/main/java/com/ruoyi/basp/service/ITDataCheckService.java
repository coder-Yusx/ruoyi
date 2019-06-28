package com.ruoyi.basp.service;

import com.ruoyi.basp.domain.TDataCheck;

import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * 数据校验修改记录 服务层
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
public interface ITDataCheckService 
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
     * 删除数据校验修改记录信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteTDataCheckByIds(String ids);

	public <T> String updateSqlAndParamList(T params,String idName,String id, String table);

	public int recoveryById(Map<String,String> maps);

	public int updateById(TDataCheck tDataCheck);

	public List<TDataCheck> selectTDataCheckByTableId(String TableId);

	public int updatesql(String ext3);
}
