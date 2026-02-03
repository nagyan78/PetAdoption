package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Renyuan;


@Mapper
public interface RenyuanMapper
{
	 public int insert(Renyuan renyuan);
	 
	 public int delete(int id);
	 
	 public int update(Renyuan renyuan);
	 
	 public List select(String xingming,String dianhua);
	 
	 public List findByUsername(String username);
	 
	 public Renyuan findByid(int id);
}
