package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Lingyang;

@Mapper
public interface LingyangMapper
{
	 public int insert(Lingyang lingyang);
	 
	 public int delete(int id);
	 
	 public int update(Lingyang lingyang);
	 
	 public List select(String xingming,String dianhua);
	 
	 public List selectByUser(int user_id);
	 
	 public Lingyang findByid(int id);
	 
	 
}
