package com.xiangmu.controler;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.DongwuMapper;
import com.xiangmu.mappers.HuifangMapper;
import com.xiangmu.mappers.UserMapper;
import com.xiangmu.pojo.Dongwu;
import com.xiangmu.pojo.Huifang;
import com.xiangmu.pojo.User;
import com.xiangmu.util.JsonResult;

@RestController
public class HuifangControler extends BaseController
{

	@Autowired
	private HuifangMapper huifangMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/huifangAdd")
	public JsonResult<Void> huifangAdd(@RequestBody Huifang huifang) 
	{
		User user=userMapper.findByUid(huifang.getUser_id());
		huifang.setXingming(user.getXingming());
		huifang.setDizhi(user.getDizhi());
		huifang.setDianhua(user.getDianhua());
		huifangMapper.insert(huifang);
		
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/huifangMana")
	public JsonResult<List> huifangMana() 
	{
		List<Huifang> huifangList=huifangMapper.select("","");
		for(Huifang huifang : huifangList)
		{
		}
		return new JsonResult<>(66,huifangList);
		
    }
	
	@RequestMapping("/huifangDel")
	public JsonResult<Void> huifangDel(int id) 
	{
		huifangMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/huifangUpdate")
	public JsonResult<Void> update(@RequestBody Huifang huifang) 
	{
		huifangMapper.update(huifang);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/huifangRes")
	public JsonResult<List> huifangRes(String xingming) 
	{
		
		List<Huifang> huifangList=huifangMapper.select(xingming.trim(),"");
		for(Huifang huifang : huifangList)
		{
		}
		return new JsonResult<>(66,huifangList);
		
    }
	
	
	
	@RequestMapping("/huifangMine")
	public JsonResult<List> huifangMine(HttpSession session)  
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<>(100);
		}
		
		List<Huifang> huifangList=huifangMapper.selectByUser(user.getUid());
		for(Huifang huifang : huifangList)
		{
		}
		return new JsonResult<>(66,huifangList);
		
    }
	
	
}
