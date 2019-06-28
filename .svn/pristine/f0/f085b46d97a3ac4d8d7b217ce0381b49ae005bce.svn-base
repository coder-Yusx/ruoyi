package com.ruoyi.basp.service.impl;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.basp.mapper.TDataCheckMapper;
import com.ruoyi.basp.domain.TDataCheck;
import com.ruoyi.basp.service.ITDataCheckService;
import com.ruoyi.common.core.text.Convert;

/**
 * 数据校验修改记录 服务层实现
 * 
 * @author ruoyi
 * @date 2019-06-04
 */
@Service
public class TDataCheckServiceImpl implements ITDataCheckService 
{
	@Autowired
	private TDataCheckMapper tDataCheckMapper;

	/**
     * 查询数据校验修改记录信息
     * 
     * @param id 数据校验修改记录ID
     * @return 数据校验修改记录信息
     */
    @Override
	public TDataCheck selectTDataCheckById(String id)
	{
	    return tDataCheckMapper.selectTDataCheckById(id);
	}
	
	/**
     * 查询数据校验修改记录列表
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 数据校验修改记录集合
     */
	@Override
	public List<TDataCheck> selectTDataCheckList(TDataCheck tDataCheck)
	{
	    return tDataCheckMapper.selectTDataCheckList(tDataCheck);
	}
	
    /**
     * 新增数据校验修改记录
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 结果
     */
	@Override
	public int insertTDataCheck(TDataCheck tDataCheck)
	{
	    return tDataCheckMapper.insertTDataCheck(tDataCheck);
	}
	
	/**
     * 修改数据校验修改记录
     * 
     * @param tDataCheck 数据校验修改记录信息
     * @return 结果
     */
	@Override
	public int updateTDataCheck(TDataCheck tDataCheck)
	{
	    return tDataCheckMapper.updateTDataCheck(tDataCheck);
	}

	/**
     * 删除数据校验修改记录对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
	@Override
	public int deleteTDataCheckByIds(String ids)
	{
		return tDataCheckMapper.deleteTDataCheckByIds(Convert.toStrArray(ids));
	}

	/**
	 * 动态生成SQ及SQL参数
	 * @param params 泛型对象
	 * @param table 数据表
	 * @return
	 */
	public <T> String updateSqlAndParamList(T params,String idName, String id,String table){
		String upSql="";//可执行SQL
		try {
			String ID ="";
			//组装SQL语句
			upSql="update "+table+" set ";
			JSONObject param =  JSONObject.fromObject(params);
			Iterator<String> it = param.keys();
			String value=null;
			while(it.hasNext()){
			for(int i = 0; i < param.size(); i++){
				String upStr="";
				String key= it.next();
				value = param.getString(key);
				if(i == param.size()-1){
					upStr=key+"='"+value+"'";
				}else{
					upStr=key+"='"+value+"',";
				}
				upSql += upStr;
			}
			}
			upSql+=" where "+idName+"='"+id+"'";
		} catch (Exception e) {
			//logger.info("组装UPDATE SQL失败！失败详情---"+e);
		}
		return upSql;
	}

	@Override
	public int recoveryById(Map<String,String> maps) { return tDataCheckMapper.recoveryById(maps); }

	@Override
	public int updateById(TDataCheck tDataCheck)
	{
		return tDataCheckMapper.updateById(tDataCheck);
	}

	@Override
	public List<TDataCheck> selectTDataCheckByTableId(String TableId) {
		return tDataCheckMapper.selectTDataCheckByTableId(TableId);
	}

	@Override
	public int updatesql(String ext3) {
		return tDataCheckMapper.updatesql(ext3);
	}

}
