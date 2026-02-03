package com.xiangmu.mappers;


import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Jieshao;

@Mapper
public interface JieshaoMapper
{
	 
	 public int update(Jieshao jieshao);
	 
	 public Jieshao findByid(int id);
}
