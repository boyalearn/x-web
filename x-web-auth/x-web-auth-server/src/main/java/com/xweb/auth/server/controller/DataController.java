package com.xweb.auth.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/29 23:32
 ******************************/
@Controller
public class DataController {

    @GetMapping("/statistics.html")
    public String statistics(){


        return "statistics";
    }
}
