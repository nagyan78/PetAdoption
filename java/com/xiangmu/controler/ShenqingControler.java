package com.xiangmu.controler;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.DongwuMapper;
import com.xiangmu.mappers.ShenqingMapper;
import com.xiangmu.pojo.Dongwu;
import com.xiangmu.pojo.User;
import com.xiangmu.pojo.Shenqing;
import com.xiangmu.util.JsonResult;

@RestController
public class ShenqingControler extends BaseController
{

	@Autowired
	private ShenqingMapper shenqingMapper;
	
	@Autowired
	private DongwuMapper dongwuMapper;
	
	@RequestMapping("/shenqingAdd")
	public JsonResult<Void> shenqingAdd(@RequestBody Shenqing shenqing,HttpSession session) 
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<>(100);
		}
		
		shenqingMapper.insert(shenqing);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/shenqingMine")
	public JsonResult<List> shenqingMine(HttpSession session) 
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<>(100);
		}
		
		
		List<Shenqing> shenqingList=shenqingMapper.findByUser(user.getUid());
		for(Shenqing shenqing : shenqingList)
		{
			shenqing.setDongwu(dongwuMapper.findByid(shenqing.getDongwu_id()));
		}
		
		return new JsonResult<>(66,shenqingList);
		
    }
	
	@RequestMapping("/shenqingDel")
	public JsonResult<Void> shenqingDel(int id) 
	{
		shenqingMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/shenqingMana")
	public JsonResult<List> shenqingMana() 
	{
		List<Shenqing> shenqingList=shenqingMapper.select("","");
		for(Shenqing shenqing : shenqingList)
		{
			shenqing.setDongwu(dongwuMapper.findByid(shenqing.getDongwu_id()));
		}
		return new JsonResult<>(66,shenqingList);
		
    }
	
	
	
	@RequestMapping("/shenqingHuifu")
	public JsonResult<Void> shenqingHuifu(@RequestBody Shenqing shenqing) 
	{
		shenqingMapper.update(shenqing);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/shenqingRes")
	public JsonResult<List> shenqingRes(String xingming,String dianhua) 
	{
		List<Shenqing> shenqingList=shenqingMapper.select(xingming.trim(),dianhua.trim());
		for(Shenqing shenqing : shenqingList)
		{
			shenqing.setDongwu(dongwuMapper.findByid(shenqing.getDongwu_id()));
		}
		return new JsonResult<>(66,shenqingList);
		
    }
	
	
}
