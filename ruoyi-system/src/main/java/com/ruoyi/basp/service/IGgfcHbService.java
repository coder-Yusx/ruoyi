package com.ruoyi.basp.service;

import com.ruoyi.basp.domain.GgfcHb;

import java.util.List;

/**
 * 公共户 服务层
 * 
 * @author ruoyi
 * @date 2019-05-29
 */
public interface IGgfcHbService 
{
	/**
     * 查询公共户信息
     * 
     * @param id 公共户ID
     * @return 公共户信息
     */
	public GgfcHb selectGgfcHbById(String id);
	
	/**
     * 查询公共户列表
     *
     * @param ggfcHb 公共户信息
     * @return 公共户集合
     */
	public List<GgfcHb> selectGgfcHbList(GgfcHb ggfcHb);
	
	/**
     * 新增公共户
     * 
     * @param ggfcHb 公共户信息
     * @return 结果
     */
	public int insertGgfcHb(GgfcHb ggfcHb);
	
	/**
     * 修改公共户
     * 
     * @param ggfcHb 公共户信息
     * @return 结果
     */
	public int updateGgfcHb(GgfcHb ggfcHb);
		
	/**
     * 删除公共户信息
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	public int deleteGgfcHbByIds(String ids);

	/**
	 * 查询分配后的公共户列表
	 *
	 * @param ggfcHb 公共户信息
	 * @return 公共户集合
	 */
	public List<GgfcHb> selectGgfcHbListUser(GgfcHb ggfcHb);

	/**
	 * 修改公共户
	 *
	 * @param ggfcHb 公共户信息
	 * @return 结果
	 */
	public int examineGgfcHb(GgfcHb ggfcHb);

	/**
	 * 查询通用公共户列表
	 *
	 * @param ggfcHb 公共户信息
	 * @return 公共户集合
	 */
	public List<GgfcHb> selectGgfcHbListown(GgfcHb ggfcHb);
}
