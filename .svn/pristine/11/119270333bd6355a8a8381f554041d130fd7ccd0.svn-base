package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.CyztCyjgKfsMapper;
import com.ruoyi.basp.domain.CyztCyjgKfs;
import com.ruoyi.basp.service.ICyztCyjgKfsService;
import com.ruoyi.common.core.text.Convert;

/**
 * ????-????-???? 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class CyztCyjgKfsServiceImpl implements ICyztCyjgKfsService 
{
	@Autowired
	private CyztCyjgKfsMapper cyztCyjgKfsMapper;

	/**
     * 查询????-????-????信息
     * 
     * @param idSeq ????-????-????ID
     * @return ????-????-????信息
     */
    @Override
	public CyztCyjgKfs selectCyztCyjgKfsById(String idSeq)
	{
	    return cyztCyjgKfsMapper.selectCyztCyjgKfsById(idSeq);
	}
	
	/**
     * 查询????-????-????列表
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return ????-????-????集合
     */
	@Override
	public List<CyztCyjgKfs> selectCyztCyjgKfsList(CyztCyjgKfs cyztCyjgKfs)
	{
	    return cyztCyjgKfsMapper.selectCyztCyjgKfsList(cyztCyjgKfs);
	}
	
    /**
     * 新增????-????-????
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return 结果
     */
	@Override
	public int insertCyztCyjgKfs(CyztCyjgKfs cyztCyjgKfs)
	{
	    return cyztCyjgKfsMapper.insertCyztCyjgKfs(cyztCyjgKfs);
	}
	
	/**
     * 修改????-????-????
     * 
     * @param cyztCyjgKfs ????-????-????信息
     * @return 结果
     */
	@Override
	public int updateCyztCyjgKfs(CyztCyjgKfs cyztCyjgKfs)
	{
	    return cyztCyjgKfsMapper.updateCyztCyjgKfs(cyztCyjgKfs);
	}

	/**
     * 删除????-????-????对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteCyztCyjgKfsByIds(String ids)
	{
		return cyztCyjgKfsMapper.deleteCyztCyjgKfsByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<CyztCyjgKfs> selectCyztCyjgKfsByHbId(String id) {
		return cyztCyjgKfsMapper.selectCyztCyjgKfsByHbId(id);
	}

}
