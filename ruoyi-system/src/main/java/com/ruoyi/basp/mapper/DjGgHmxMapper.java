package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.DjGgHmx;
import java.util.List;	

/**
 * 户明细_簿载 数据层
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
public interface DjGgHmxMapper 
{
	/**
     * 查询户明细_簿载信息
     * 
     * @param id 户明细_簿载ID
     * @return 户明细_簿载信息
     */
	public DjGgHmx selectDjGgHmxById(String id);
	
	/**
     * 查询户明细_簿载列表
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 户明细_簿载集合
     */
	public List<DjGgHmx> selectDjGgHmxList(DjGgHmx djGgHmx);
	
	/**
     * 新增户明细_簿载
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 结果
     */
	public int insertDjGgHmx(DjGgHmx djGgHmx);
	
	/**
     * 修改户明细_簿载
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 结果
     */
	public int updateDjGgHmx(DjGgHmx djGgHmx);
	
	/**
     * 删除户明细_簿载
     * 
     * @param id 户明细_簿载ID
     * @return 结果
     */
	public int deleteDjGgHmxById(String id);
	
	/**
     * 批量删除户明细_簿载
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDjGgHmxByIds(String[] ids);

	public List<DjGgHmx> selectDjGgHmxByHbId(String id);
}