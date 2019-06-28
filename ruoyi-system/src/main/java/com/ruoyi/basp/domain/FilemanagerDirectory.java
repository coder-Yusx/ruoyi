package com.ruoyi.basp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 附件文件夹表 filemanager_directory
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public class FilemanagerDirectory extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** 目录id */
	private String id;
	/** 父目录id,根目录为0 */
	private String parentid;
	/** 业务主键 */
	private String xtajbh;
	/** 目录名 */
	private String dirname;
	/** 目录描述 */
	private String dirdesc;
	/** 目录层级:0,根目录；1,一级目录；2,二级目录.... */
	private Integer dirlevel;
	/** 目录类型 */
	private String dirtype;
	/** 上传用户id */
	private String userid;
	/** 排序号 */
	private Integer seq;
	/** 附件份数 */
	private Integer filenum;
	/** 所需材料份数 */
	private Integer reqnum;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setParentid(String parentid) 
	{
		this.parentid = parentid;
	}

	public String getParentid() 
	{
		return parentid;
	}
	public void setXtajbh(String xtajbh) 
	{
		this.xtajbh = xtajbh;
	}

	public String getXtajbh() 
	{
		return xtajbh;
	}
	public void setDirname(String dirname) 
	{
		this.dirname = dirname;
	}

	public String getDirname() 
	{
		return dirname;
	}
	public void setDirdesc(String dirdesc) 
	{
		this.dirdesc = dirdesc;
	}

	public String getDirdesc() 
	{
		return dirdesc;
	}
	public void setDirlevel(Integer dirlevel) 
	{
		this.dirlevel = dirlevel;
	}

	public Integer getDirlevel() 
	{
		return dirlevel;
	}
	public void setDirtype(String dirtype) 
	{
		this.dirtype = dirtype;
	}

	public String getDirtype() 
	{
		return dirtype;
	}
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}

	public String getUserid() 
	{
		return userid;
	}
	public void setSeq(Integer seq) 
	{
		this.seq = seq;
	}

	public Integer getSeq() 
	{
		return seq;
	}
	public void setFilenum(Integer filenum) 
	{
		this.filenum = filenum;
	}

	public Integer getFilenum() 
	{
		return filenum;
	}
	public void setReqnum(Integer reqnum) 
	{
		this.reqnum = reqnum;
	}

	public Integer getReqnum() 
	{
		return reqnum;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("parentid", getParentid())
            .append("xtajbh", getXtajbh())
            .append("dirname", getDirname())
            .append("dirdesc", getDirdesc())
            .append("dirlevel", getDirlevel())
            .append("dirtype", getDirtype())
            .append("userid", getUserid())
            .append("seq", getSeq())
            .append("filenum", getFilenum())
            .append("reqnum", getReqnum())
            .toString();
    }
}
