package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Shenqing
{
	private Integer id;
	private Integer user_id;
	private Integer dongwu_id;
	private String xingming;
	
	private String dizhi;
	private String dianhua;
	private String ziwo;
	private String shenqingshi;
	
	private String huifu;
	
	private Dongwu dongwu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUser_id() {
		return user_id;
	}

	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}

	public Integer getDongwu_id() {
		return dongwu_id;
	}

	public void setDongwu_id(Integer dongwu_id) {
		this.dongwu_id = dongwu_id;
	}

	public String getXingming() {
		return xingming;
	}

	public void setXingming(String xingming) {
		this.xingming = xingming;
	}

	public String getDizhi() {
		return dizhi;
	}

	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}

	public String getDianhua() {
		return dianhua;
	}

	public void setDianhua(String dianhua) {
		this.dianhua = dianhua;
	}

	public String getZiwo() {
		return ziwo;
	}

	public void setZiwo(String ziwo) {
		this.ziwo = ziwo;
	}

	public String getShenqingshi() {
		return shenqingshi;
	}

	public void setShenqingshi(String shenqingshi) {
		this.shenqingshi = shenqingshi;
	}

	public String getHuifu() {
		return huifu;
	}

	public void setHuifu(String huifu) {
		this.huifu = huifu;
	}

	public Dongwu getDongwu() {
		return dongwu;
	}

	public void setDongwu(Dongwu dongwu) {
		this.dongwu = dongwu;
	}
	
}