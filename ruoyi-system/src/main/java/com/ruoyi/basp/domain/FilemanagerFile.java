package com.ruoyi.basp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 附件文件表 filemanager_file
 * 
 * @author ruoyi
 * @date 2019-05-30
 */
public class FilemanagerFile extends DjGgQlrmx
{
	private static final long serialVersionUID = 1L;
	
	/** 文件id主键 */
	private String id;
	/** 所在目录 */
	private String dirid;
	/** 显示名 */
	private String showname;
	/** 扩展名 */
	private String extendname;
	/** 上传用户 */
	private String userid;
	/** 备注 */
	private String memoa;
	/** 上传时间 */
	private Date uploaddate;
	/** 业务主键 */
	private String xtajbh;
	/** ftp服务 */
	private String ftpserver;
	/** FTP路径 */
	private String ftppath;
	/** 排序号 */
	private Integer seq;

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setDirid(String dirid) 
	{
		this.dirid = dirid;
	}

	public String getDirid() 
	{
		return dirid;
	}
	public void setShowname(String showname) 
	{
		this.showname = showname;
	}

	public String getShowname() 
	{
		return showname;
	}
	public void setExtendname(String extendname) 
	{
		this.extendname = extendname;
	}

	public String getExtendname() 
	{
		return extendname;
	}
	public void setUserid(String userid) 
	{
		this.userid = userid;
	}

	public String getUserid() 
	{
		return userid;
	}
	public void setMemoa(String memoa) 
	{
		this.memoa = memoa;
	}

	public String getMemoa() 
	{
		return memoa;
	}
	public void setUploaddate(Date uploaddate) 
	{
		this.uploaddate = uploaddate;
	}

	public Date getUploaddate() 
	{
		return uploaddate;
	}
	public void setXtajbh(String xtajbh) 
	{
		this.xtajbh = xtajbh;
	}

	public String getXtajbh() 
	{
		return xtajbh;
	}
	public void setFtpserver(String ftpserver) 
	{
		this.ftpserver = ftpserver;
	}

	public String getFtpserver() 
	{
		return ftpserver;
	}
	public void setFtppath(String ftppath) 
	{
		this.ftppath = ftppath;
	}

	public String getFtppath() 
	{
		return ftppath;
	}
	public void setSeq(Integer seq) 
	{
		this.seq = seq;
	}

	public Integer getSeq() 
	{
		return seq;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("dirid", getDirid())
            .append("showname", getShowname())
            .append("extendname", getExtendname())
            .append("userid", getUserid())
            .append("memoa", getMemoa())
            .append("uploaddate", getUploaddate())
            .append("xtajbh", getXtajbh())
            .append("ftpserver", getFtpserver())
            .append("ftppath", getFtppath())
            .append("seq", getSeq())
            .toString();
    }
}
