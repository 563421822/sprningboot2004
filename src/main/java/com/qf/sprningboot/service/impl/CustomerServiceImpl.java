package com.qf.sprningboot.service.impl;

import com.qf.sprningboot.entity.Customer;
import com.qf.sprningboot.mapper.CustomerMapper;
import com.qf.sprningboot.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    CustomerMapper mapper;


    @Override
    public List<Customer> showAll() {
        return mapper.showAll();
    }
}
