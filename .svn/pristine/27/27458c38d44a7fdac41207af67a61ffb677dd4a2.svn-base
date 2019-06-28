package com.ruoyi.basp.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.XmglXmXmjbxxbMapper;
import com.ruoyi.basp.domain.XmglXmXmjbxxb;
import com.ruoyi.basp.service.IXmglXmXmjbxxbService;
import com.ruoyi.common.core.text.Convert;

/**
 * ??????? 服务层实现
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
@Service
public class XmglXmXmjbxxbServiceImpl implements IXmglXmXmjbxxbService 
{
	@Autowired
	private XmglXmXmjbxxbMapper xmglXmXmjbxxbMapper;

	/**
     * 查询???????信息
     * 
     * @param xmjbxxid ???????ID
     * @return ???????信息
     */
    @Override
	public XmglXmXmjbxxb selectXmglXmXmjbxxbById(String xmjbxxid)
	{
	    return xmglXmXmjbxxbMapper.selectXmglXmXmjbxxbById(xmjbxxid);
	}
	
	/**
     * 查询???????列表
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return ???????集合
     */
	@Override
	public List<XmglXmXmjbxxb> selectXmglXmXmjbxxbList(XmglXmXmjbxxb xmglXmXmjbxxb)
	{
	    return xmglXmXmjbxxbMapper.selectXmglXmXmjbxxbList(xmglXmXmjbxxb);
	}
	
    /**
     * 新增???????
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return 结果
     */
	@Override
	public int insertXmglXmXmjbxxb(XmglXmXmjbxxb xmglXmXmjbxxb)
	{
	    return xmglXmXmjbxxbMapper.insertXmglXmXmjbxxb(xmglXmXmjbxxb);
	}
	
	/**
     * 修改???????
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return 结果
     */
	@Override
	public int updateXmglXmXmjbxxb(XmglXmXmjbxxb xmglXmXmjbxxb)
	{
	    return xmglXmXmjbxxbMapper.updateXmglXmXmjbxxb(xmglXmXmjbxxb);
	}

	/**
     * 删除???????对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteXmglXmXmjbxxbByIds(String ids)
	{
		return xmglXmXmjbxxbMapper.deleteXmglXmXmjbxxbByIds(Convert.toStrArray(ids));
	}

	@Override
	public List<XmglXmXmjbxxb> selectXmglXmXmjbxxbByHbId(String id) {
		return xmglXmXmjbxxbMapper.selectXmglXmXmjbxxbByHbId(id);
	}

}
