package com.ruoyi.basp.service;

import com.ruoyi.basp.domain.XmglXmXmjbxxb;
import java.util.List;

/**
 * ??????? 服务层
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public interface IXmglXmXmjbxxbService 
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
     * 删除???????信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteXmglXmXmjbxxbByIds(String ids);

	public List<XmglXmXmjbxxb> selectXmglXmXmjbxxbByHbId(String id);
}
