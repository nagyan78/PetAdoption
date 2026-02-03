package com.xiangmu.controler;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.xiangmu.mappers.JieshaoMapper;
import com.xiangmu.pojo.Jieshao;
import com.xiangmu.util.JsonResult;

@RestController
public class JieshaoControler extends BaseController
{

	@Autowired
	private JieshaoMapper jieshaoMapper;
	
	
	
	@RequestMapping("/jieshaoMana")
	public JsonResult<Jieshao> jieshaoDetailQian(int id) 
	{
		Jieshao jieshao=jieshaoMapper.findByid(1);
		return new JsonResult<>(66,jieshao);
		
    }
	
	
	@RequestMapping("/jieshaoUpdate")
	public JsonResult<Void> update(@RequestBody Jieshao jieshao) 
	{
		jieshaoMapper.update(jieshao);
		return new JsonResult<>(66);
    }
	
	
}
