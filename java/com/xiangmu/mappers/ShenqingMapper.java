package com.xiangmu.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.xiangmu.pojo.Shenqing;

@Mapper
public interface ShenqingMapper
{
	 public int insert(Shenqing shenqing);
	 
	 public int delete(int id);
	 
	 public int update(Shenqing shenqing);
	 
	 
	 public List select(String xingming,String dianhua);
	 
	 public Shenqing findByid(int id);
	 
	 public List findByUser(int user_id);
}
