package com.ruoyi.baseclean.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 校验规则表 t_data_rule
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public class TDataRule extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 规则主键 */
	private Integer ruleId;
	/** 规则名称 */
	private String ruleName;
	/** 规则编码 */
	private String ruleCode;
	/** 规则描述 */
	private String ruleDescribtion;
	/** 规则类型 */
	private String ruleType;
	/** 规则状态 */
	private String ruleParams;
	/** $column.columnComment */
	private String ruleStatus;
	/** 扩展1 */
	private String ext1;
	/** 扩展2 */
	private String ext2;
	/** 扩展3 */
	private String ext3;
	/** 创建者 */
	private String createBy;
	/** 创建时间 */
	private Date createTime;
	/** 更新者 */
	private String updateBy;
	/** 更新时间 */
	private Date updateTime;

	public Integer getRuleId() {
		return ruleId;
	}

	public void setRuleId(Integer ruleId) {
		this.ruleId = ruleId;
	}

	public void setRuleName(String ruleName)
	{
		this.ruleName = ruleName;
	}

	public String getRuleName() 
	{
		return ruleName;
	}
	public void setRuleCode(String ruleCode) 
	{
		this.ruleCode = ruleCode;
	}

	public String getRuleCode() 
	{
		return ruleCode;
	}
	public void setRuleDescribtion(String ruleDescribtion) 
	{
		this.ruleDescribtion = ruleDescribtion;
	}

	public String getRuleDescribtion() 
	{
		return ruleDescribtion;
	}
	public void setRuleType(String ruleType) 
	{
		this.ruleType = ruleType;
	}

	public String getRuleType() 
	{
		return ruleType;
	}
	public void setRuleParams(String ruleParams) 
	{
		this.ruleParams = ruleParams;
	}

	public String getRuleParams() 
	{
		return ruleParams;
	}
	public void setRuleStatus(String ruleStatus) 
	{
		this.ruleStatus = ruleStatus;
	}

	public String getRuleStatus() 
	{
		return ruleStatus;
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
	public void setCreateBy(String createBy) 
	{
		this.createBy = createBy;
	}

	public String getCreateBy() 
	{
		return createBy;
	}
	public void setCreateTime(Date createTime) 
	{
		this.createTime = createTime;
	}

	public Date getCreateTime() 
	{
		return createTime;
	}
	public void setUpdateBy(String updateBy) 
	{
		this.updateBy = updateBy;
	}

	public String getUpdateBy() 
	{
		return updateBy;
	}
	public void setUpdateTime(Date updateTime) 
	{
		this.updateTime = updateTime;
	}

	public Date getUpdateTime() 
	{
		return updateTime;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("ruleId", getRuleId())
            .append("ruleName", getRuleName())
            .append("ruleCode", getRuleCode())
            .append("ruleDescribtion", getRuleDescribtion())
            .append("ruleType", getRuleType())
            .append("ruleParams", getRuleParams())
            .append("ruleStatus", getRuleStatus())
            .append("ext1", getExt1())
            .append("ext2", getExt2())
            .append("ext3", getExt3())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .toString();
    }
}
