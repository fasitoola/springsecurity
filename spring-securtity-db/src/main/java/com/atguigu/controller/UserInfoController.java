package com.atguigu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

/**
 * @Description: 用户信息
 * @Author: linyu
 * @Date: 2026/6/15 20:33
 */
@RestController
public class UserInfoController {

    @GetMapping("userInfo")
    public Principal userInfo(Principal principal){
        return principal;
    }
}
