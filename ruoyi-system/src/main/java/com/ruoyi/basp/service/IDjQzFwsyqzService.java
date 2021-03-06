package com.ruoyi.basp.service;

import com.ruoyi.basp.domain.DjQzFwsyqz;
import java.util.List;

/**
 * ???? 服务层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface IDjQzFwsyqzService 
{
	/**
     * 查询????信息
     * 
     * @param id ????ID
     * @return ????信息
     */
	public DjQzFwsyqz selectDjQzFwsyqzById(String id);
	
	/**
     * 查询????列表
     * 
     * @param djQzFwsyqz ????信息
     * @return ????集合
     */
	public List<DjQzFwsyqz> selectDjQzFwsyqzList(DjQzFwsyqz djQzFwsyqz);
	
	/**
     * 新增????
     * 
     * @param djQzFwsyqz ????信息
     * @return 结果
     */
	public int insertDjQzFwsyqz(DjQzFwsyqz djQzFwsyqz);
	
	/**
     * 修改????
     * 
     * @param djQzFwsyqz ????信息
     * @return 结果
     */
	public int updateDjQzFwsyqz(DjQzFwsyqz djQzFwsyqz);
		
	/**
     * 删除????信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDjQzFwsyqzByIds(String ids);
	
}
