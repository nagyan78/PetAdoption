package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Dongwu;

@Mapper
public interface DongwuMapper
{
	 public int insert(Dongwu dongwu);
	 
	 public int delete(int id);
	 
	 public int update(Dongwu dongwu);
	 
	 public List select(String mingcheng);
	 
	 public List selectByLeibie(int leibieId);
	 
	 public Dongwu findByid(int id);
}
