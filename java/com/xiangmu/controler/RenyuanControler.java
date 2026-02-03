package com.xiangmu.controler;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.RenyuanMapper;
import com.xiangmu.pojo.Renyuan;
import com.xiangmu.util.JsonResult;
import com.xiangmu.zexception.MimaCuowuException;
import com.xiangmu.zexception.ZhanghaoCuowuException;
import com.xiangmu.zexception.ZhanghaoZhanyongException;

@RestController
public class RenyuanControler extends BaseController
{

	@Autowired
	private RenyuanMapper renyuanMapper;
	
	
	@RequestMapping("/renyuanAdd")
	public JsonResult<Void> renyuanAdd(@RequestBody Renyuan renyuan) 
	{
		String username=renyuan.getUsername().trim();
		List renyuanList=renyuanMapper.findByUsername(username.trim());
		System.out.println(renyuanList.size()+"&&&&");
		if(renyuanList.size() >0)//用户名被占用
		{
			throw new ZhanghaoZhanyongException();//44
		}
		
		renyuanMapper.insert(renyuan);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/renyuanMana")
	public JsonResult<List> renyuanMana() 
	{
		List renyuanList=renyuanMapper.select("","");
		return new JsonResult<>(66,renyuanList);
		
    }
	
	@RequestMapping("/renyuanDel")
	public JsonResult<Void> renyuanDel(int id) 
	{
		renyuanMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/renyuanUpdate")
	public JsonResult<Void> update(@RequestBody Renyuan renyuan) 
	{
		renyuanMapper.update(renyuan);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/renyuanRes")
	public JsonResult<List> renyuanRes(String xingming,String dianhua) 
	{
		List renyuanList=renyuanMapper.select(xingming.trim(),dianhua.trim());
		return new JsonResult<>(66,renyuanList);
		
    }
	
	@RequestMapping("/renyuanLogin")
	public JsonResult<Renyuan> renyuanLogin(String username,String password,HttpSession session) 
	{
		List list=renyuanMapper.findByUsername(username.trim());
		if(list.size()==0)
		{
			throw new ZhanghaoCuowuException();
		}
		
		Renyuan renyuan=(Renyuan)list.get(0);
		
		if(password.equals(renyuan.getPassword())==false)
		{
			throw new MimaCuowuException();
		}
        
        session.setAttribute("renyuan", renyuan);
        
        return new JsonResult<Renyuan>(66,renyuan);
		
    }
	
	@RequestMapping("/renyuanEditMe")
	public JsonResult<Renyuan> renyuanEditMe(@RequestBody Renyuan renyuan) 
	{
		renyuanMapper.update(renyuan);
		return new JsonResult<>(66,renyuanMapper.findByid(renyuan.getId()));
    }
	
	
	
	@RequestMapping("/renyuanLogout")
	public JsonResult<Void> renyuanLogout(HttpSession  session) 
	{
		session.setAttribute("renyuan", null);
		return new JsonResult<>(66);
    }
	
}
