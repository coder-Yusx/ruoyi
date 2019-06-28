package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.GgfcLbMapper;
import com.ruoyi.basp.domain.GgfcLb;
import com.ruoyi.basp.service.IGgfcLbService;
import com.ruoyi.common.core.text.Convert;

/**
 * 公共楼 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class GgfcLbServiceImpl implements IGgfcLbService 
{
	@Autowired
	private GgfcLbMapper ggfcLbMapper;

	/**
     * 查询公共楼信息
     * 
     * @param id 公共楼ID
     * @return 公共楼信息
     */
    @Override
	public GgfcLb selectGgfcLbById(String id)
	{
	    return ggfcLbMapper.selectGgfcLbById(id);
	}
	
	/**
     * 查询公共楼列表
     * 
     * @param ggfcLb 公共楼信息
     * @return 公共楼集合
     */
	@Override
	public List<GgfcLb> selectGgfcLbList(GgfcLb ggfcLb)
	{
	    return ggfcLbMapper.selectGgfcLbList(ggfcLb);
	}
	
    /**
     * 新增公共楼
     * 
     * @param ggfcLb 公共楼信息
     * @return 结果
     */
	@Override
	public int insertGgfcLb(GgfcLb ggfcLb)
	{
	    return ggfcLbMapper.insertGgfcLb(ggfcLb);
	}
	
	/**
     * 修改公共楼
     * 
     * @param ggfcLb 公共楼信息
     * @return 结果
     */
	@Override
	public int updateGgfcLb(GgfcLb ggfcLb)
	{
	    return ggfcLbMapper.updateGgfcLb(ggfcLb);
	}

	/**
     * 删除公共楼对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteGgfcLbByIds(String ids)
	{
		return ggfcLbMapper.deleteGgfcLbByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<GgfcLb> selectGgfcLbByHbId(String id) {
		return ggfcLbMapper.selectGgfcLbByHbId(id);
	}

}
