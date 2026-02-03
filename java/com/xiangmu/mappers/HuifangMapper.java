package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Huifang;


@Mapper
public interface HuifangMapper
{
	 public int insert(Huifang huifang);
	 
	 public int delete(int id);
	 
	 public int update(Huifang huifang);
	 
	 public List select(String xingming,String dianhua);
	 
	 public List selectByUser(int user_id);
	 
	 public Huifang findByid(int id);
	 
	 
}
