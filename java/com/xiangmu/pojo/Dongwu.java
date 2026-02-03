package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Dongwu
{
	private Integer id;
	private Integer leibieId;
	private String mingcheng;
	private String jieshao;
	
	private String fujian;
	private String beizhu;
	private String fabushi;
	private String del;
	
	private Leibie leibie;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getJieshao() {
		return jieshao;
	}
	
	public String getDel() {
		return del;
	}
	public void setDel(String del) {
		this.del = del;
	}
	public void setJieshao(String jieshao) {
		this.jieshao = jieshao;
	}
	public String getFujian() {
		return fujian;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	
	
	public String getFabushi() {
		return fabushi;
	}
	public void setFabushi(String fabushi) {
		this.fabushi = fabushi;
	}
	
	public Integer getLeibieId() {
		return leibieId;
	}
	public void setLeibieId(Integer leibieId) {
		this.leibieId = leibieId;
	}
	public Leibie getLeibie() {
		return leibie;
	}
	public void setLeibie(Leibie leibie) {
		this.leibie = leibie;
	}
	
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
}