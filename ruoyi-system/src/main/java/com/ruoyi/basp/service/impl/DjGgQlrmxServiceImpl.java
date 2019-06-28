package com.ruoyi.basp.service.impl;

import java.util.List;

import com.ruoyi.common.utils.PageData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.DjGgQlrmxMapper;
import com.ruoyi.basp.domain.DjGgQlrmx;
import com.ruoyi.basp.service.IDjGgQlrmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 权利人明细_簿载层 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-27
 */
@Service
public class DjGgQlrmxServiceImpl implements IDjGgQlrmxService 
{
	@Autowired
	private DjGgQlrmxMapper djGgQlrmxMapper;

	/**
     * 查询权利人明细_簿载层信息
     * 
     * @param id 权利人明细_簿载层ID
     * @return 权利人明细_簿载层信息
     */
    @Override
	public DjGgQlrmx selectDjGgQlrmxById(String id)
	{
	    return djGgQlrmxMapper.selectDjGgQlrmxById(id);
	}
	
	/**
     * 查询权利人明细_簿载层列表
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 权利人明细_簿载层集合
     */
	@Override
	public List<DjGgQlrmx> selectDjGgQlrmxList(DjGgQlrmx djGgQlrmx)
	{
	    return djGgQlrmxMapper.selectDjGgQlrmxList(djGgQlrmx);
	}

	@Override
	public List<PageData> selectDjGgQlrmxListPageData(PageData pagedata) {
		return djGgQlrmxMapper.selectDjGgQlrmxListPageData(pagedata);
	}

	/**
     * 新增权利人明细_簿载层
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 结果
     */
	@Override
	public int insertDjGgQlrmx(DjGgQlrmx djGgQlrmx)
	{
	    return djGgQlrmxMapper.insertDjGgQlrmx(djGgQlrmx);
	}
	
	/**
     * 修改权利人明细_簿载层
     * 
     * @param djGgQlrmx 权利人明细_簿载层信息
     * @return 结果
     */
	@Override
	public int updateDjGgQlrmx(DjGgQlrmx djGgQlrmx)
	{
	    return djGgQlrmxMapper.updateDjGgQlrmx(djGgQlrmx);
	}

	/**
     * 删除权利人明细_簿载层对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDjGgQlrmxByIds(String ids)
	{
		return djGgQlrmxMapper.deleteDjGgQlrmxByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<DjGgQlrmx> selectDjGgQlrmxByHbId(String id) {
		return djGgQlrmxMapper.selectDjGgQlrmxByHbId(id);
	}

}
