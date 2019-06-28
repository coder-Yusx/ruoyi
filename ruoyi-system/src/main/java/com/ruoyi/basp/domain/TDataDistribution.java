package com.ruoyi.basp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 数据分配表 OWNFGJ.t_data_distribution
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class TDataDistribution extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 扩展字段 */
	private String id;
	/** 用户ID */
	private String rid;
	/** 表名  */
	private String tablename;
	/** 数据ID */
	private String dataid;
	/** 状态  */
	private String state;
	/** 扩展字段 */
	private String ext1;
	/** 扩展字段 */
	private String ext2;
	/** 扩展字段 */
	private String ext3;
	/** 操作人 */
	private String operator;
	//操作时间
	private String osdate;

	public String getOsdate() {
		return osdate;
	}

	public void setOsdate(String osdate) {
		this.osdate = osdate;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setRid(String rid) 
	{
		this.rid = rid;
	}

	public String getRid() 
	{
		return rid;
	}
	public void setTablename(String tablename) 
	{
		this.tablename = tablename;
	}

	public String getTablename() 
	{
		return tablename;
	}
	public void setDataid(String dataid) 
	{
		this.dataid = dataid;
	}

	public String getDataid() 
	{
		return dataid;
	}
	public void setState(String state) 
	{
		this.state = state;
	}

	public String getState() 
	{
		return state;
	}
	public void setExt1(String ext1) 
	{
		this.ext1 = ext1;
	}

	public String getExt1() 
	{
		return ext1;
	}
	public void setExt2(String ext2) 
	{
		this.ext2 = ext2;
	}

	public String getExt2() 
	{
		return ext2;
	}
	public void setExt3(String ext3) 
	{
		this.ext3 = ext3;
	}

	public String getExt3() 
	{
		return ext3;
	}

	@Override
	public String toString() {
		return "TDataDistribution{" +
				"id='" + id + '\'' +
				", rid='" + rid + '\'' +
				", tablename='" + tablename + '\'' +
				", dataid='" + dataid + '\'' +
				", state='" + state + '\'' +
				", ext1='" + ext1 + '\'' +
				", ext2='" + ext2 + '\'' +
				", ext3='" + ext3 + '\'' +
				", operator='" + operator + '\'' +
				'}';
	}
}
