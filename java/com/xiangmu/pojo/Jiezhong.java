package com.xiangmu.pojo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Jiezhong
{
	private Integer id;
	private Integer dongwu_id;
	private String yimiao;
	private String riqi;
	
	private String beizhu;
	
	private Dongwu dongwu;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getDongwu_id() {
		return dongwu_id;
	}

	public void setDongwu_id(Integer dongwu_id) {
		this.dongwu_id = dongwu_id;
	}

	public String getYimiao() {
		return yimiao;
	}

	public void setYimiao(String yimiao) {
		this.yimiao = yimiao;
	}

	public String getRiqi() {
		return riqi;
	}

	public void setRiqi(String riqi) {
		this.riqi = riqi;
	}

	public String getBeizhu() {
		return beizhu;
	}

	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}

	public Dongwu getDongwu() {
		return dongwu;
	}

	public void setDongwu(Dongwu dongwu) {
		this.dongwu = dongwu;
	}
	
}