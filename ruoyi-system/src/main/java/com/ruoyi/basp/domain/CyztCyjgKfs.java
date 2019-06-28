package com.ruoyi.basp.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.domain.BaseEntity;
import java.util.Date;

/**
 * ????-????-????表 cyzt_cyjg_kfs
 * 
 * @author ruoyi
 * @date 2019-05-31
 */
public class CyztCyjgKfs extends BaseEntity
{
	private static final long serialVersionUID = 1L;
	
	/** ?? */
	private String idSeq;
	/** $column.columnComment */
	private String cylx;
	/** ????????????CYZT-SFYX?1=???0=?? */
	private String sfyx;
	/** ???? */
	private Date czsj;
	/** ??? */
	private String czr;
	/** ????? */
	private String czrzh;
	/** ???id */
	private String czrid;
	/** ???? */
	private String jgmc;
	/** ???? */
	private String jgdm;
	/** ?????(?????) */
	private String yyjgh;
	/** ????(??????? */
	private String jydz;
	/** ???? */
	private String jyfw;
	/** ?????? */
	private Date gszcr;
	/** ???? */
	private String zczj;
	/** ???? */
	private String zcdz;
	/** ???? */
	private String jggm;
	/** ???? */
	private String jggk;
	/** ????CYZT-ZZDJ?CYZT-ZZDJWY?????CYZT-ZZDJCH???? */
	private String zzdj;
	/** ????? */
	private String zzzbh;
	/** ????? */
	private Date zzfzr;
	/** ???????? */
	private Date pzcyrq;
	/** $column.columnComment */
	private String cclx;
	/** ?? */
	private String cz;
	/** ???? */
	private String dzyx;
	/** ???? */
	private String lxdh;
	/** ???? */
	private String yzbm;
	/** ?????? */
	private String frdb;
	/** ?????? */
	private String frdbgj;
	/** ????????CYZT-ZJMC */
	private String frdbzjmc;
	/** ???????? */
	private String frdbzjhm;
	/** ???? */
	private String bz;
	/** ???????? */
	private Date zzyxksrq;
	/** ???????? */
	private Date zzyxjsrq;
	/** ???????CYZT-XZQY? */
	private String zqm;
	/** ?????? */
	private String zzpzbm;
	/** ???? */
	private String zgbm;
	/** ???? */
	private String gsyj;
	/** ????????? */
	private String ywfw;
	/** ?????? CYZT-SFBG?1=??????0=???? */
	private String sfbg;
	/** ???????????? */
	private Date bgsj;
	/** ??????????? */
	private String bgr;
	/** ???????? */
	private Date zziyxksrq;
	/** ???????? */
	private Date zziyxjsrq;
	/** ??? */
	private String fzr;
	/** ????? */
	private String fzrlxdh;
	/** ???? */
	private String jyqy;
	/** ???????? */
	private String fddbrlxdh;
	/** ?????0?????1??????2???? */
	private String shzt;
	/** ???? */
	private Date tjsj;
	/** ????? */
	private String tjr;
	/** ???id */
	private String tjrid;
	/** ????? */
	private String shr;
	/** ???id */
	private String shrid;
	/** ???? */
	private Date shsj;
	/** ???? */
	private String shyj;
	/** ?????0???,1??? */
	private String zzcz;
	/** ???? */
	private Date zxrq;
	/** ???? */
	private String zxyy;
	/** ?????? */
	private String swdjzh;
	/** ?????? */
	private String zzjgdm;
	/** ???? */
	private String khyh;
	/** ???? */
	private String khzh;
	/** ??? */
	private String hzh;
	/** ????? */
	private Date rxhsj;
	/** ???? */
	private String xhrz;
	/** ???????? */
	private Integer qyzczgzs;

	public void setIdSeq(String idSeq) 
	{
		this.idSeq = idSeq;
	}

	public String getIdSeq() 
	{
		return idSeq;
	}
	public void setCylx(String cylx) 
	{
		this.cylx = cylx;
	}

	public String getCylx() 
	{
		return cylx;
	}
	public void setSfyx(String sfyx) 
	{
		this.sfyx = sfyx;
	}

	public String getSfyx() 
	{
		return sfyx;
	}
	public void setCzsj(Date czsj) 
	{
		this.czsj = czsj;
	}

	public Date getCzsj() 
	{
		return czsj;
	}
	public void setCzr(String czr) 
	{
		this.czr = czr;
	}

	public String getCzr() 
	{
		return czr;
	}
	public void setCzrzh(String czrzh) 
	{
		this.czrzh = czrzh;
	}

	public String getCzrzh() 
	{
		return czrzh;
	}
	public void setCzrid(String czrid) 
	{
		this.czrid = czrid;
	}

	public String getCzrid() 
	{
		return czrid;
	}
	public void setJgmc(String jgmc) 
	{
		this.jgmc = jgmc;
	}

	public String getJgmc() 
	{
		return jgmc;
	}
	public void setJgdm(String jgdm) 
	{
		this.jgdm = jgdm;
	}

	public String getJgdm() 
	{
		return jgdm;
	}
	public void setYyjgh(String yyjgh) 
	{
		this.yyjgh = yyjgh;
	}

	public String getYyjgh() 
	{
		return yyjgh;
	}
	public void setJydz(String jydz) 
	{
		this.jydz = jydz;
	}

	public String getJydz() 
	{
		return jydz;
	}
	public void setJyfw(String jyfw) 
	{
		this.jyfw = jyfw;
	}

	public String getJyfw() 
	{
		return jyfw;
	}
	public void setGszcr(Date gszcr) 
	{
		this.gszcr = gszcr;
	}

	public Date getGszcr() 
	{
		return gszcr;
	}
	public void setZczj(String zczj) 
	{
		this.zczj = zczj;
	}

	public String getZczj() 
	{
		return zczj;
	}
	public void setZcdz(String zcdz) 
	{
		this.zcdz = zcdz;
	}

	public String getZcdz() 
	{
		return zcdz;
	}
	public void setJggm(String jggm) 
	{
		this.jggm = jggm;
	}

	public String getJggm() 
	{
		return jggm;
	}
	public void setJggk(String jggk) 
	{
		this.jggk = jggk;
	}

	public String getJggk() 
	{
		return jggk;
	}
	public void setZzdj(String zzdj) 
	{
		this.zzdj = zzdj;
	}

	public String getZzdj() 
	{
		return zzdj;
	}
	public void setZzzbh(String zzzbh) 
	{
		this.zzzbh = zzzbh;
	}

	public String getZzzbh() 
	{
		return zzzbh;
	}
	public void setZzfzr(Date zzfzr) 
	{
		this.zzfzr = zzfzr;
	}

	public Date getZzfzr() 
	{
		return zzfzr;
	}
	public void setPzcyrq(Date pzcyrq) 
	{
		this.pzcyrq = pzcyrq;
	}

	public Date getPzcyrq() 
	{
		return pzcyrq;
	}
	public void setCclx(String cclx) 
	{
		this.cclx = cclx;
	}

	public String getCclx() 
	{
		return cclx;
	}
	public void setCz(String cz) 
	{
		this.cz = cz;
	}

	public String getCz() 
	{
		return cz;
	}
	public void setDzyx(String dzyx) 
	{
		this.dzyx = dzyx;
	}

	public String getDzyx() 
	{
		return dzyx;
	}
	public void setLxdh(String lxdh) 
	{
		this.lxdh = lxdh;
	}

	public String getLxdh() 
	{
		return lxdh;
	}
	public void setYzbm(String yzbm) 
	{
		this.yzbm = yzbm;
	}

	public String getYzbm() 
	{
		return yzbm;
	}
	public void setFrdb(String frdb) 
	{
		this.frdb = frdb;
	}

	public String getFrdb() 
	{
		return frdb;
	}
	public void setFrdbgj(String frdbgj) 
	{
		this.frdbgj = frdbgj;
	}

	public String getFrdbgj() 
	{
		return frdbgj;
	}
	public void setFrdbzjmc(String frdbzjmc) 
	{
		this.frdbzjmc = frdbzjmc;
	}

	public String getFrdbzjmc() 
	{
		return frdbzjmc;
	}
	public void setFrdbzjhm(String frdbzjhm) 
	{
		this.frdbzjhm = frdbzjhm;
	}

	public String getFrdbzjhm() 
	{
		return frdbzjhm;
	}
	public void setBz(String bz) 
	{
		this.bz = bz;
	}

	public String getBz() 
	{
		return bz;
	}
	public void setZzyxksrq(Date zzyxksrq) 
	{
		this.zzyxksrq = zzyxksrq;
	}

	public Date getZzyxksrq() 
	{
		return zzyxksrq;
	}
	public void setZzyxjsrq(Date zzyxjsrq) 
	{
		this.zzyxjsrq = zzyxjsrq;
	}

	public Date getZzyxjsrq() 
	{
		return zzyxjsrq;
	}
	public void setZqm(String zqm) 
	{
		this.zqm = zqm;
	}

	public String getZqm() 
	{
		return zqm;
	}
	public void setZzpzbm(String zzpzbm) 
	{
		this.zzpzbm = zzpzbm;
	}

	public String getZzpzbm() 
	{
		return zzpzbm;
	}
	public void setZgbm(String zgbm) 
	{
		this.zgbm = zgbm;
	}

	public String getZgbm() 
	{
		return zgbm;
	}
	public void setGsyj(String gsyj) 
	{
		this.gsyj = gsyj;
	}

	public String getGsyj() 
	{
		return gsyj;
	}
	public void setYwfw(String ywfw) 
	{
		this.ywfw = ywfw;
	}

	public String getYwfw() 
	{
		return ywfw;
	}
	public void setSfbg(String sfbg) 
	{
		this.sfbg = sfbg;
	}

	public String getSfbg() 
	{
		return sfbg;
	}
	public void setBgsj(Date bgsj) 
	{
		this.bgsj = bgsj;
	}

	public Date getBgsj() 
	{
		return bgsj;
	}
	public void setBgr(String bgr) 
	{
		this.bgr = bgr;
	}

	public String getBgr() 
	{
		return bgr;
	}
	public void setZziyxksrq(Date zziyxksrq) 
	{
		this.zziyxksrq = zziyxksrq;
	}

	public Date getZziyxksrq() 
	{
		return zziyxksrq;
	}
	public void setZziyxjsrq(Date zziyxjsrq) 
	{
		this.zziyxjsrq = zziyxjsrq;
	}

	public Date getZziyxjsrq() 
	{
		return zziyxjsrq;
	}
	public void setFzr(String fzr) 
	{
		this.fzr = fzr;
	}

	public String getFzr() 
	{
		return fzr;
	}
	public void setFzrlxdh(String fzrlxdh) 
	{
		this.fzrlxdh = fzrlxdh;
	}

	public String getFzrlxdh() 
	{
		return fzrlxdh;
	}
	public void setJyqy(String jyqy) 
	{
		this.jyqy = jyqy;
	}

	public String getJyqy() 
	{
		return jyqy;
	}
	public void setFddbrlxdh(String fddbrlxdh) 
	{
		this.fddbrlxdh = fddbrlxdh;
	}

	public String getFddbrlxdh() 
	{
		return fddbrlxdh;
	}
	public void setShzt(String shzt) 
	{
		this.shzt = shzt;
	}

	public String getShzt() 
	{
		return shzt;
	}
	public void setTjsj(Date tjsj) 
	{
		this.tjsj = tjsj;
	}

	public Date getTjsj() 
	{
		return tjsj;
	}
	public void setTjr(String tjr) 
	{
		this.tjr = tjr;
	}

	public String getTjr() 
	{
		return tjr;
	}
	public void setTjrid(String tjrid) 
	{
		this.tjrid = tjrid;
	}

	public String getTjrid() 
	{
		return tjrid;
	}
	public void setShr(String shr) 
	{
		this.shr = shr;
	}

	public String getShr() 
	{
		return shr;
	}
	public void setShrid(String shrid) 
	{
		this.shrid = shrid;
	}

	public String getShrid() 
	{
		return shrid;
	}
	public void setShsj(Date shsj) 
	{
		this.shsj = shsj;
	}

	public Date getShsj() 
	{
		return shsj;
	}
	public void setShyj(String shyj) 
	{
		this.shyj = shyj;
	}

	public String getShyj() 
	{
		return shyj;
	}
	public void setZzcz(String zzcz) 
	{
		this.zzcz = zzcz;
	}

	public String getZzcz() 
	{
		return zzcz;
	}
	public void setZxrq(Date zxrq) 
	{
		this.zxrq = zxrq;
	}

	public Date getZxrq() 
	{
		return zxrq;
	}
	public void setZxyy(String zxyy) 
	{
		this.zxyy = zxyy;
	}

	public String getZxyy() 
	{
		return zxyy;
	}
	public void setSwdjzh(String swdjzh) 
	{
		this.swdjzh = swdjzh;
	}

	public String getSwdjzh() 
	{
		return swdjzh;
	}
	public void setZzjgdm(String zzjgdm) 
	{
		this.zzjgdm = zzjgdm;
	}

	public String getZzjgdm() 
	{
		return zzjgdm;
	}
	public void setKhyh(String khyh) 
	{
		this.khyh = khyh;
	}

	public String getKhyh() 
	{
		return khyh;
	}
	public void setKhzh(String khzh) 
	{
		this.khzh = khzh;
	}

	public String getKhzh() 
	{
		return khzh;
	}
	public void setHzh(String hzh) 
	{
		this.hzh = hzh;
	}

	public String getHzh() 
	{
		return hzh;
	}
	public void setRxhsj(Date rxhsj) 
	{
		this.rxhsj = rxhsj;
	}

	public Date getRxhsj() 
	{
		return rxhsj;
	}
	public void setXhrz(String xhrz) 
	{
		this.xhrz = xhrz;
	}

	public String getXhrz() 
	{
		return xhrz;
	}
	public void setQyzczgzs(Integer qyzczgzs) 
	{
		this.qyzczgzs = qyzczgzs;
	}

	public Integer getQyzczgzs() 
	{
		return qyzczgzs;
	}

    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("idSeq", getIdSeq())
            .append("cylx", getCylx())
            .append("sfyx", getSfyx())
            .append("czsj", getCzsj())
            .append("czr", getCzr())
            .append("czrzh", getCzrzh())
            .append("czrid", getCzrid())
            .append("jgmc", getJgmc())
            .append("jgdm", getJgdm())
            .append("yyjgh", getYyjgh())
            .append("jydz", getJydz())
            .append("jyfw", getJyfw())
            .append("gszcr", getGszcr())
            .append("zczj", getZczj())
            .append("zcdz", getZcdz())
            .append("jggm", getJggm())
            .append("jggk", getJggk())
            .append("zzdj", getZzdj())
            .append("zzzbh", getZzzbh())
            .append("zzfzr", getZzfzr())
            .append("pzcyrq", getPzcyrq())
            .append("cclx", getCclx())
            .append("cz", getCz())
            .append("dzyx", getDzyx())
            .append("lxdh", getLxdh())
            .append("yzbm", getYzbm())
            .append("frdb", getFrdb())
            .append("frdbgj", getFrdbgj())
            .append("frdbzjmc", getFrdbzjmc())
            .append("frdbzjhm", getFrdbzjhm())
            .append("bz", getBz())
            .append("zzyxksrq", getZzyxksrq())
            .append("zzyxjsrq", getZzyxjsrq())
            .append("zqm", getZqm())
            .append("zzpzbm", getZzpzbm())
            .append("zgbm", getZgbm())
            .append("gsyj", getGsyj())
            .append("ywfw", getYwfw())
            .append("sfbg", getSfbg())
            .append("bgsj", getBgsj())
            .append("bgr", getBgr())
            .append("zziyxksrq", getZziyxksrq())
            .append("zziyxjsrq", getZziyxjsrq())
            .append("fzr", getFzr())
            .append("fzrlxdh", getFzrlxdh())
            .append("jyqy", getJyqy())
            .append("fddbrlxdh", getFddbrlxdh())
            .append("shzt", getShzt())
            .append("tjsj", getTjsj())
            .append("tjr", getTjr())
            .append("tjrid", getTjrid())
            .append("shr", getShr())
            .append("shrid", getShrid())
            .append("shsj", getShsj())
            .append("shyj", getShyj())
            .append("zzcz", getZzcz())
            .append("zxrq", getZxrq())
            .append("zxyy", getZxyy())
            .append("swdjzh", getSwdjzh())
            .append("zzjgdm", getZzjgdm())
            .append("khyh", getKhyh())
            .append("khzh", getKhzh())
            .append("hzh", getHzh())
            .append("rxhsj", getRxhsj())
            .append("xhrz", getXhrz())
            .append("qyzczgzs", getQyzczgzs())
            .toString();
    }
}
