package com.xweb.ui.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/29 18:45
 ******************************/
@Controller
public class HomeController {

    @GetMapping
    public String home(){
        return "home";
    }
}
