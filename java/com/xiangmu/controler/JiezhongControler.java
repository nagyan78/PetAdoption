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
import com.xiangmu.mappers.JiezhongMapper;
import com.xiangmu.pojo.Dongwu;
import com.xiangmu.pojo.Jiezhong;
import com.xiangmu.pojo.User;
import com.xiangmu.util.JsonResult;

@RestController
public class JiezhongControler extends BaseController
{
	@Autowired
	private JiezhongMapper jiezhongMapper;
	
	@Autowired
	private DongwuMapper dongwuMapper;
	
	@RequestMapping("/jiezhongAdd")
	public JsonResult<Void> jiezhongAdd(@RequestBody Jiezhong jiezhong,HttpSession session) 
	{
		
		jiezhongMapper.insert(jiezhong);
        return new JsonResult<>(66);
		
    }
	
	
	@RequestMapping("/jiezhongMana")
	public JsonResult<List> jiezhongMana(int dongwu_id) 
	{
		List<Jiezhong> jiezhongList=jiezhongMapper.selectByDongwu(dongwu_id);
		for(Jiezhong jiezhong : jiezhongList)
		{
			jiezhong.setDongwu(dongwuMapper.findByid(jiezhong.getDongwu_id()));
		}
		return new JsonResult<>(66,jiezhongList);
		
    }
	
	
	@RequestMapping("/jiezhongDel")
	public JsonResult<Void> jiezhongDel(int id) 
	{
		jiezhongMapper.delete(id);
		return new JsonResult<>(66);
    }
	
	
	@RequestMapping("/jiezhongUpdate")
	public JsonResult<Void> jiezhongUpdate(@RequestBody Jiezhong jiezhong) 
	{
		jiezhongMapper.update(jiezhong);
		return new JsonResult<>(66);
    }
	
}
