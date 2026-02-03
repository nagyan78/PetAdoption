package com.xiangmu.controler;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.DongwuMapper;
import com.xiangmu.mappers.LingyangMapper;
import com.xiangmu.mappers.UserMapper;
import com.xiangmu.pojo.Dongwu;
import com.xiangmu.pojo.Lingyang;
import com.xiangmu.pojo.User;
import com.xiangmu.util.JsonResult;

@RestController
public class LingyangControler extends BaseController
{

	@Autowired
	private LingyangMapper lingyangMapper;
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/lingyangAdd")
	public JsonResult<Void> lingyangAdd(@RequestBody Lingyang lingyang) 
	{
		User user=userMapper.findByUid(lingyang.getUser_id());
		lingyang.setXingming(user.getXingming());
		lingyang.setDizhi(user.getDizhi());
		lingyang.setDianhua(user.getDianhua());
		lingyangMapper.insert(lingyang);
		
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/lingyangMana")
	public JsonResult<List> lingyangMana() 
	{
		List<Lingyang> lingyangList=lingyangMapper.select("","");
		for(Lingyang lingyang : lingyangList)
		{
		}
		return new JsonResult<>(66,lingyangList);
		
    }
	
	@RequestMapping("/lingyangDel")
	public JsonResult<Void> lingyangDel(int id) 
	{
		lingyangMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/lingyangUpdate")
	public JsonResult<Void> update(@RequestBody Lingyang lingyang) 
	{
		lingyangMapper.update(lingyang);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/lingyangRes")
	public JsonResult<List> lingyangRes(String xingming) 
	{
		
		List<Lingyang> lingyangList=lingyangMapper.select(xingming.trim(),"");
		for(Lingyang lingyang : lingyangList)
		{
		}
		return new JsonResult<>(66,lingyangList);
		
    }
	
	
	
	@RequestMapping("/lingyangMine")
	public JsonResult<List> lingyangMine(HttpSession session)  
	{
		User user=(User)session.getAttribute("user");
		if(user==null)
		{
			return new JsonResult<>(100);
		}
		
		List<Lingyang> lingyangList=lingyangMapper.selectByUser(user.getUid());
		for(Lingyang lingyang : lingyangList)
		{
		}
		return new JsonResult<>(66,lingyangList);
		
    }
	
	
}
