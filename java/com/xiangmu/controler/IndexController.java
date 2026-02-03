package com.xiangmu.controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        // 重定向到管理员登录页面
        return "redirect:/admin/dist/index.html";
    }

    @RequestMapping("/home")
    public String home() {
        // 返回主页
        return "redirect:/admin/dist/index.html";
    }
}