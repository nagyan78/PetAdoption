package com.xiangmu.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.DongwuMapper;
import com.xiangmu.mappers.LeibieMapper;
import com.xiangmu.pojo.Dongwu;
import com.xiangmu.util.JsonResult;

@RestController
public class DongwuControler extends BaseController
{

	@Autowired
	private DongwuMapper dongwuMapper;
	
	@Autowired
	private LeibieMapper leibieMapper;
	
	@RequestMapping("/dongwuAdd")
	public JsonResult<Void> dongwuAdd(@RequestBody Dongwu dongwu) 
	{
		dongwuMapper.insert(dongwu);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/dongwuMana")
	public JsonResult<List> dongwuMana() 
	{
		List<Dongwu> dongwuList=dongwuMapper.select("");
		for(Dongwu dongwu : dongwuList)
		{
			dongwu.setLeibie(leibieMapper.findByid(dongwu.getLeibieId()));
		}
		
		return new JsonResult<>(66,dongwuList);
		
    }
	
	@RequestMapping("/dongwuDel")
	public JsonResult<Void> dongwuDel(int id) 
	{
		dongwuMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/dongwuUpdate")
	public JsonResult<Void> update(@RequestBody Dongwu dongwu) 
	{
		dongwuMapper.update(dongwu);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/dongwuRes")
	public JsonResult<List> dongwuRes(String mingcheng) 
	{
		List<Dongwu> dongwuList=dongwuMapper.select(mingcheng.trim());
		for(Dongwu dongwu : dongwuList)
		{
			dongwu.setLeibie(leibieMapper.findByid(dongwu.getLeibieId()));
		}
		return new JsonResult<>(66,dongwuList);
		
    }
	
	@RequestMapping("/dongwuQian6")
	public JsonResult<List> dongwuQian6(String mingcheng) 
	{
		List dongwuList=dongwuMapper.select("");
		if(dongwuList.size()>6)
		{
			dongwuList=dongwuList.subList(0, 6);
		}
		return new JsonResult<>(66,dongwuList);
		
    }
	
	
	@RequestMapping("/dongwuDetailQian")
	public JsonResult<Dongwu> dongwuDetailQian(int id) 
	{
		Dongwu dongwu=dongwuMapper.findByid(id);
		return new JsonResult<>(66,dongwu);
		
    }
	
	@RequestMapping("/dongwuByLeibie")
	public JsonResult<List> dongwuByLeibie(int leibieId) 
	{
		List dongwuList=dongwuMapper.selectByLeibie(leibieId);
		return new JsonResult<>(66,dongwuList);
		
    }
	
	
	
}
