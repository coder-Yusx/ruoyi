package com.ruoyi.basp.service.impl;

import com.ruoyi.basp.domain.GgfcHb;
import com.ruoyi.basp.mapper.GgfcHbMapper;
import com.ruoyi.basp.mapper.TDataDistributionMapper;
import com.ruoyi.basp.service.IGgfcHbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 公共户 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
@Service
public class GgfcHbServiceImpl implements IGgfcHbService
{
	@Autowired
	private GgfcHbMapper ggfcHbMapper;
	@Autowired
	private TDataDistributionMapper tDataDistributionMapper;
	/**
     * 查询公共户信息
     * 
     * @param id 公共户ID
     * @return 公共户信息
     */
    @Override
	public GgfcHb selectGgfcHbById(String id)
	{
	    return ggfcHbMapper.selectGgfcHbById(id);
	}
	
	/**
     * 查询公共户列表
     * 
     * @param ggfcHb 公共户信息
     * @return 公共户集合
     */
	@Override
	public List<GgfcHb> selectGgfcHbList(GgfcHb ggfcHb)
	{
	    return ggfcHbMapper.selectGgfcHbList(ggfcHb);
	}
	
    /**
     * 新增公共户
     * 
     * @param ggfcHb 公共户信息
     * @return 结果
     */
	@Override
	public int insertGgfcHb(GgfcHb ggfcHb)
	{
	    return ggfcHbMapper.insertGgfcHb(ggfcHb);
	}
	
	/**
     * 修改公共户
     * 
     * @param ggfcHb 公共户信息
     * @return 结果
     */
	@Override
	public int updateGgfcHb(GgfcHb ggfcHb)
	{
	    return ggfcHbMapper.updateGgfcHb(ggfcHb);
	}

	/**
     * 删除公共户对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteGgfcHbByIds(String ids)
	{
		return ggfcHbMapper.deleteGgfcHbByIds(ids);
	}

    /**
	 * 查询分配列表
	 *
	 * @param ggfcHb 需要ggfcHb
	 * @return 结果
	 */
	@Override
	public List<GgfcHb> selectGgfcHbListUser(GgfcHb ggfcHb) {
		//获取分配的Dataid
		/*TDataDistribution tDataDistribution = tDataDistributionMapper.selectTDataDistributionListUser(ggfcHb.getDataid());
		if(Common.notEmpty(tDataDistribution)){//查询分配信息
			ggfcHb.setDataid(tDataDistribution.getDataid());
		}else{
			ggfcHb.setDataid("''");
		}*/
		return ggfcHbMapper.selectGgfcHbListUser(ggfcHb);
	}

	@Override
	public int examineGgfcHb(GgfcHb ggfcHb) {
		return ggfcHbMapper.examineGgfcHb(ggfcHb);
	}

	/**
	 * 查询公共户列表
	 *
	 * @param ggfcHb 公共户信息
	 * @return 公共户集合
	 */
	@Override
	public List<GgfcHb> selectGgfcHbListown(GgfcHb ggfcHb)
	{
		return ggfcHbMapper.selectGgfcHbListown(ggfcHb);
	}

}
