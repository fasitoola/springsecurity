package com.atguigu.common;

import cn.hutool.captcha.generator.CodeGenerator;

import java.util.Random;

/**
 * @Description: 自定义验证码
 * @Author: linyu
 * @Date: 2026/6/14 22:02
 */
public class MyCodeGenerator implements CodeGenerator {

    @Override
    public String generate() {
        int code = 1000 + new Random().nextInt(9000); // 0 - 8999 => [1000 , 9999]
        return String.valueOf(code);
    }

    @Override
    public boolean verify(String code, String userInputCode) {
        return false;
    }
}

