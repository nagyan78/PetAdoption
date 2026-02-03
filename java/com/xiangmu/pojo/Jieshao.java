package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Jieshao
{
	private Integer id;
	private String neirong;
	private String fujian;
	private String fujianYuan;
	
	private String beizhu;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNeirong() {
		return neirong;
	}
	public void setNeirong(String neirong) {
		this.neirong = neirong;
	}
	public String getFujian() {
		return fujian;
	}
	public void setFujian(String fujian) {
		this.fujian = fujian;
	}
	public String getFujianYuan() {
		return fujianYuan;
	}
	public void setFujianYuan(String fujianYuan) {
		this.fujianYuan = fujianYuan;
	}
	public String getBeizhu() {
		return beizhu;
	}
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	
}