package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description: 登录验证
 * @Author: linyu
 * @Date: 2026/6/11 23:01
 */
@Controller
public class UserController {

    @RequestMapping("/")
    @ResponseBody
    public String index() {
        return "Hello Spring Security";
    }

    @RequestMapping("/toLogin")
    public String toLogin(){
        return "login";
    }


}
