package com.ruoyi.basp.service;

import com.ruoyi.basp.domain.DjGgQlrmx;
import com.ruoyi.common.utils.PageData;

import java.util.List;

/**
 * 权利人明细_簿载层 服务层
 * 
 * @author ruoyi
 * @date 2019-05-27
 */
public interface IDjGgQlrmxService 
{
	/**
     * 查询权利人明细_簿载层信息
     * 
     * @param id 权利人明细_簿载层ID
     * @return 权利人明细_簿载层信息
     */
	public DjGgQlrmx selectDjGgQlrmxById(String id);
	
	/**
     * 查询权利人明细_簿载层列表
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 权利人明细_簿载层集合
     */
	public List<DjGgQlrmx> selectDjGgQlrmxList(DjGgQlrmx djGgQlrmx);

	public List<PageData> selectDjGgQlrmxListPageData(PageData pagedata);
	
	/**
     * 新增权利人明细_簿载层
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 结果
     */
	public int insertDjGgQlrmx(DjGgQlrmx djGgQlrmx);
	
	/**
     * 修改权利人明细_簿载层
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 结果
     */
	public int updateDjGgQlrmx(DjGgQlrmx djGgQlrmx);
		
	/**
     * 删除权利人明细_簿载层信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteDjGgQlrmxByIds(String ids);

	public List<DjGgQlrmx> selectDjGgQlrmxByHbId(String id);
}
