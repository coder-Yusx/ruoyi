package com.ruoyi.basp.mapper;

import com.ruoyi.basp.domain.XmglXmXmjbxxb;
import java.util.List;	

/**
 * ??????? 数据层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface XmglXmXmjbxxbMapper 
{
	/**
     * 查询???????信息
     * 
     * @param xmjbxxid ???????ID
     * @return ???????信息
     */
	public XmglXmXmjbxxb selectXmglXmXmjbxxbById(String xmjbxxid);
	
	/**
     * 查询???????列表
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return ???????集合
     */
	public List<XmglXmXmjbxxb> selectXmglXmXmjbxxbList(XmglXmXmjbxxb xmglXmXmjbxxb);
	
	/**
     * 新增???????
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return 结果
     */
	public int insertXmglXmXmjbxxb(XmglXmXmjbxxb xmglXmXmjbxxb);
	
	/**
     * 修改???????
     * 
     * @param xmglXmXmjbxxb ???????信息
     * @return 结果
     */
	public int updateXmglXmXmjbxxb(XmglXmXmjbxxb xmglXmXmjbxxb);
	
	/**
     * 删除???????
     * 
     * @param xmjbxxid ???????ID
     * @return 结果
     */
	public int deleteXmglXmXmjbxxbById(String xmjbxxid);
	
	/**
     * 批量删除???????
     * 
     * @param xmjbxxids 需要删除的数据ID
     * @return 结果
     */
	public int deleteXmglXmXmjbxxbByIds(String[] xmjbxxids);

	public List<XmglXmXmjbxxb> selectXmglXmXmjbxxbByHbId(String id);
}