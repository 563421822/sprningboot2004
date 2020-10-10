package com.qf.sprningboot.controller;

import com.qf.sprningboot.entity.Aliyun;
import com.qf.sprningboot.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class TestController {
    @Resource(name = "haha")
    private User user;
    @Autowired
//    按照数据类型注入
    private Aliyun aliyun;

    @RequestMapping("/aa")
    public User testUser() {
        return user;
    }


    @RequestMapping(value = "/show")
    public String show() {
        return "Hello, SpringBoot!!!";
    }

    @RequestMapping(value = "/aliyun")
    public Aliyun ali() {
        return aliyun;
    }

}
