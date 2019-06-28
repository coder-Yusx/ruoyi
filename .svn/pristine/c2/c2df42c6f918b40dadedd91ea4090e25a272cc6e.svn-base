package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.DjGgHmxMapper;
import com.ruoyi.basp.domain.DjGgHmx;
import com.ruoyi.basp.service.IDjGgHmxService;
import com.ruoyi.common.core.text.Convert;

/**
 * 户明细_簿载 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
@Service
public class DjGgHmxServiceImpl implements IDjGgHmxService 
{
	@Autowired
	private DjGgHmxMapper djGgHmxMapper;

	/**
     * 查询户明细_簿载信息
     * 
     * @param id 户明细_簿载ID
     * @return 户明细_簿载信息
     */
    @Override
	public DjGgHmx selectDjGgHmxById(String id)
	{
	    return djGgHmxMapper.selectDjGgHmxById(id);
	}
	
	/**
     * 查询户明细_簿载列表
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 户明细_簿载集合
     */
	@Override
	public List<DjGgHmx> selectDjGgHmxList(DjGgHmx djGgHmx)
	{
	    return djGgHmxMapper.selectDjGgHmxList(djGgHmx);
	}
	
    /**
     * 新增户明细_簿载
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 结果
     */
	@Override
	public int insertDjGgHmx(DjGgHmx djGgHmx)
	{
	    return djGgHmxMapper.insertDjGgHmx(djGgHmx);
	}
	
	/**
     * 修改户明细_簿载
     * 
     * @param djGgHmx 户明细_簿载信息
     * @return 结果
     */
	@Override
	public int updateDjGgHmx(DjGgHmx djGgHmx)
	{
	    return djGgHmxMapper.updateDjGgHmx(djGgHmx);
	}

	/**
     * 删除户明细_簿载对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteDjGgHmxByIds(String ids)
	{
		return djGgHmxMapper.deleteDjGgHmxByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<DjGgHmx> selectDjGgHmxByHbId(String id) {
		return djGgHmxMapper.selectDjGgHmxByHbId(id);
	}

}
