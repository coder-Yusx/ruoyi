package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.CyztCyjgKfs;
import java.util.List;	

/**
 * ????-????-???? 数据层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface CyztCyjgKfsMapper 
{
	/**
     * 查询????-????-????信息
     * 
     * @param idSeq ????-????-????ID
     * @return ????-????-????信息
     */
	public CyztCyjgKfs selectCyztCyjgKfsById(String idSeq);
	
	/**
     * 查询????-????-????列表
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return ????-????-????集合
     */
	public List<CyztCyjgKfs> selectCyztCyjgKfsList(CyztCyjgKfs cyztCyjgKfs);
	
	/**
     * 新增????-????-????
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return 结果
     */
	public int insertCyztCyjgKfs(CyztCyjgKfs cyztCyjgKfs);
	
	/**
     * 修改????-????-????
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return 结果
     */
	public int updateCyztCyjgKfs(CyztCyjgKfs cyztCyjgKfs);
	
	/**
     * 删除????-????-????
     * 
     * @param idSeq ????-????-????ID
     * @return 结果
     */
	public int deleteCyztCyjgKfsById(String idSeq);
	
	/**
     * 批量删除????-????-????
     * 
     * @param idSeqs 需要删除的数据ID
     * @return 结果
     */
	public int deleteCyztCyjgKfsByIds(String[] idSeqs);

	/**
	 * 查询????-????-????信息
	 *
	 * @param idSeq ????-????-????ID
	 * @return ????-????-????信息
	 */
	public List<CyztCyjgKfs> selectCyztCyjgKfsByHbId(String idSeq);
	
}