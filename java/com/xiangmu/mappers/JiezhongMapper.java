package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Jiezhong;

@Mapper
public interface JiezhongMapper
{
	 public int insert(Jiezhong jiezhong);
	 
	 public int delete(int id);
	 
	 public int update(Jiezhong jiezhong);
	 
	 public List selectByDongwu(int dongwu_id);
	 
	 public Jiezhong findByid(int id);
	 
}
