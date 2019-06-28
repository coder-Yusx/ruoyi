package com.ruoyi.basp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * 公共楼表 ggfc_lb
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public class GgfcLb extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ?ID */
	private String id;
	/** ????ID */
	private String idXmxq;
	/** ???    ???????????????????? */
	private String lmc;
	/** ????????LDZ?    ????????? */
	private String fwzl;
	/** ??? */
	private String jlx;
	/** ??? */
	private String mph;
	/** ?? */
	private String dh;
	/** ?? */
	private String zh;
	/** ??? */
	private String zcs;
	/** ?????[FWJG]     ????? */
	private String jzjg;
	/** ?????[GHYT]     ????    ????? */
	private String jzyt;
	/** ??? */
	private String tfh;
	/** [CX]     ?? */
	private String cx;
	/** [ZL]     ?? */
	private String zl;
	/** ???? */
	private String jcnd;
	/** ????([JSZT]    ????) */
	private String jzzt;
	/** ???? */
	private String dscs;
	/** ???? */
	private String dxcs;
	/** ???? */
	private String sgbh;
	/** ???? */
	private Date jgrq;
	/** ???? */
	private Date jlsj;
	/** ????[ZQM] ???? ??GB/T2260??????????????????6?????? */
	private String zqm;
	/** ???? */
	private String chlx;
	/** ????    ???1=BMF??;2=?????3=???? */
	private String sjly;
	/** ???????0=????1=??? */
	private String chbgzt;
	/** ?? */
	private String bz;
	/** 1???0?? */
	private String sfyx;
	/** ??? */
	private String ext1;
	/** $column.columnComment */
	private String ext2;
	/** $column.columnComment */
	private String ext3;
	/** $column.columnComment */
	private String ext4;
	/** $column.columnComment */
	private String ext5;
	/** ?????? */
	private String bdcdyh;
	/** ?????? */
	private String tdsyqzh;
	/** ???? */
	private String tdyt;
	/** ???? */
	private String tdlx;
	/** ????????? */
	private String tdsyqqdfs;
	/** ?????????? */
	private Date tdsynxq;
	/** ?????????? */
	private Date tdsynxz;
	/** ?????? */
	private String tdspxx;
	/** ?????? */
	private String ghspxx;
	/** ?????? */
	private String jgspxx;

	/** 表所在用户名*/
	private String ownusername;
	/** 表名*/
	private String tablename;

	public String getOwnusername() { return "basp"; }

	public void setOwnusername(String ownusername) { this.ownusername = ownusername; }

	public void setTablename(String tablename) { this.tablename = tablename; }

	public String getTablename() { return "ggfc_lb"; }

	public void setId(String id) 
	{
		this.id = id;
	}

	public String getId() 
	{
		return id;
	}
	public void setIdXmxq(String idXmxq) 
	{
		this.idXmxq = idXmxq;
	}

	public String getIdXmxq() 
	{
		return idXmxq;
	}
	public void setLmc(String lmc) 
	{
		this.lmc = lmc;
	}

	public String getLmc() 
	{
		return lmc;
	}
	public void setFwzl(String fwzl) 
	{
		this.fwzl = fwzl;
	}

	public String getFwzl() 
	{
		return fwzl;
	}
	public void setJlx(String jlx) 
	{
		this.jlx = jlx;
	}

	public String getJlx() 
	{
		return jlx;
	}
	public void setMph(String mph) 
	{
		this.mph = mph;
	}

	public String getMph() 
	{
		return mph;
	}
	public void setDh(String dh) 
	{
		this.dh = dh;
	}

	public String getDh() 
	{
		return dh;
	}
	public void setZh(String zh) 
	{
		this.zh = zh;
	}

	public String getZh() 
	{
		return zh;
	}
	public void setZcs(String zcs) 
	{
		this.zcs = zcs;
	}

	public String getZcs() 
	{
		return zcs;
	}
	public void setJzjg(String jzjg) 
	{
		this.jzjg = jzjg;
	}

	public String getJzjg() 
	{
		return jzjg;
	}
	public void setJzyt(String jzyt) 
	{
		this.jzyt = jzyt;
	}

	public String getJzyt() 
	{
		return jzyt;
	}
	public void setTfh(String tfh) 
	{
		this.tfh = tfh;
	}

	public String getTfh() 
	{
		return tfh;
	}
	public void setCx(String cx) 
	{
		this.cx = cx;
	}

	public String getCx() 
	{
		return cx;
	}
	public void setZl(String zl) 
	{
		this.zl = zl;
	}

	public String getZl() 
	{
		return zl;
	}
	public void setJcnd(String jcnd) 
	{
		this.jcnd = jcnd;
	}

	public String getJcnd() 
	{
		return jcnd;
	}
	public void setJzzt(String jzzt) 
	{
		this.jzzt = jzzt;
	}

	public String getJzzt() 
	{
		return jzzt;
	}
	public void setDscs(String dscs) 
	{
		this.dscs = dscs;
	}

	public String getDscs() 
	{
		return dscs;
	}
	public void setDxcs(String dxcs) 
	{
		this.dxcs = dxcs;
	}

	public String getDxcs() 
	{
		return dxcs;
	}
	public void setSgbh(String sgbh) 
	{
		this.sgbh = sgbh;
	}

	public String getSgbh() 
	{
		return sgbh;
	}
	public void setJgrq(Date jgrq) 
	{
		this.jgrq = jgrq;
	}

	public Date getJgrq() 
	{
		return jgrq;
	}
	public void setJlsj(Date jlsj) 
	{
		this.jlsj = jlsj;
	}

	public Date getJlsj() 
	{
		return jlsj;
	}
	public void setZqm(String zqm) 
	{
		this.zqm = zqm;
	}

	public String getZqm() 
	{
		return zqm;
	}
	public void setChlx(String chlx) 
	{
		this.chlx = chlx;
	}

	public String getChlx() 
	{
		return chlx;
	}
	public void setSjly(String sjly) 
	{
		this.sjly = sjly;
	}

	public String getSjly() 
	{
		return sjly;
	}
	public void setChbgzt(String chbgzt) 
	{
		this.chbgzt = chbgzt;
	}

	public String getChbgzt() 
	{
		return chbgzt;
	}
	public void setBz(String bz) 
	{
		this.bz = bz;
	}

	public String getBz() 
	{
		return bz;
	}
	public void setSfyx(String sfyx) 
	{
		this.sfyx = sfyx;
	}

	public String getSfyx() 
	{
		return sfyx;
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
	public void setExt4(String ext4) 
	{
		this.ext4 = ext4;
	}

	public String getExt4() 
	{
		return ext4;
	}
	public void setExt5(String ext5) 
	{
		this.ext5 = ext5;
	}

	public String getExt5() 
	{
		return ext5;
	}
	public void setBdcdyh(String bdcdyh) 
	{
		this.bdcdyh = bdcdyh;
	}

	public String getBdcdyh() 
	{
		return bdcdyh;
	}
	public void setTdsyqzh(String tdsyqzh) 
	{
		this.tdsyqzh = tdsyqzh;
	}

	public String getTdsyqzh() 
	{
		return tdsyqzh;
	}
	public void setTdyt(String tdyt) 
	{
		this.tdyt = tdyt;
	}

	public String getTdyt() 
	{
		return tdyt;
	}
	public void setTdlx(String tdlx) 
	{
		this.tdlx = tdlx;
	}

	public String getTdlx() 
	{
		return tdlx;
	}
	public void setTdsyqqdfs(String tdsyqqdfs) 
	{
		this.tdsyqqdfs = tdsyqqdfs;
	}

	public String getTdsyqqdfs() 
	{
		return tdsyqqdfs;
	}
	public void setTdsynxq(Date tdsynxq) 
	{
		this.tdsynxq = tdsynxq;
	}

	public Date getTdsynxq() 
	{
		return tdsynxq;
	}
	public void setTdsynxz(Date tdsynxz) 
	{
		this.tdsynxz = tdsynxz;
	}

	public Date getTdsynxz() 
	{
		return tdsynxz;
	}
	public void setTdspxx(String tdspxx) 
	{
		this.tdspxx = tdspxx;
	}

	public String getTdspxx() 
	{
		return tdspxx;
	}
	public void setGhspxx(String ghspxx) 
	{
		this.ghspxx = ghspxx;
	}

	public String getGhspxx() 
	{
		return ghspxx;
	}
	public void setJgspxx(String jgspxx) 
	{
		this.jgspxx = jgspxx;
	}

	public String getJgspxx() 
	{
		return jgspxx;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("idXmxq", getIdXmxq())
            .append("lmc", getLmc())
            .append("fwzl", getFwzl())
            .append("jlx", getJlx())
            .append("mph", getMph())
            .append("dh", getDh())
            .append("zh", getZh())
            .append("zcs", getZcs())
            .append("jzjg", getJzjg())
            .append("jzyt", getJzyt())
            .append("tfh", getTfh())
            .append("cx", getCx())
            .append("zl", getZl())
            .append("jcnd", getJcnd())
            .append("jzzt", getJzzt())
            .append("dscs", getDscs())
            .append("dxcs", getDxcs())
            .append("sgbh", getSgbh())
            .append("jgrq", getJgrq())
            .append("jlsj", getJlsj())
            .append("zqm", getZqm())
            .append("chlx", getChlx())
            .append("sjly", getSjly())
            .append("chbgzt", getChbgzt())
            .append("bz", getBz())
            .append("sfyx", getSfyx())
            .append("ext1", getExt1())
            .append("ext2", getExt2())
            .append("ext3", getExt3())
            .append("ext4", getExt4())
            .append("ext5", getExt5())
            .append("bdcdyh", getBdcdyh())
            .append("tdsyqzh", getTdsyqzh())
            .append("tdyt", getTdyt())
            .append("tdlx", getTdlx())
            .append("tdsyqqdfs", getTdsyqqdfs())
            .append("tdsynxq", getTdsynxq())
            .append("tdsynxz", getTdsynxz())
            .append("tdspxx", getTdspxx())
            .append("ghspxx", getGhspxx())
            .append("jgspxx", getJgspxx())
            .toString();
    }
}
