package com.qf.sprningboot.controller;

import com.alibaba.fastjson.JSON;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.sprningboot.entity.Customer;
import com.qf.sprningboot.entity.TableData;
import com.qf.sprningboot.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/customer")
public class CustomerController {
    @Autowired
    ICustomerService service;

    @RequestMapping(value = "/show")
    public String showAll() {
//        声明集合接收查出的集合
        List<Customer> list = service.showAll();
//        用PageInfo装下所查出的集合
        PageInfo<Customer> pageInfo = new PageInfo<>(list);
        PageHelper.startPage(1,5);
        TableData data = new TableData();
        data.setData(list);
        data.setCode(1);
        data.setCount(pageInfo.getTotal());
        String s = JSON.toJSONString(data);
        System.out.println(s);
        return s;
    }
}
