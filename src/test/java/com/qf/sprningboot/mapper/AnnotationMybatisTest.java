package com.qf.sprningboot.mapper;

import com.qf.sprningboot.entity.TDistrict;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AnnotationMybatisTest {
    @Autowired
    private AnnotationMybatis mapper;

    @Test
    public void finAll() {
        List<TDistrict> list = mapper.finAll();
        list.forEach(System.out::println);
    }

    @Test
    public void findById() {
        TDistrict district = mapper.findById(3);
        System.out.println("district = " + district);
    }
}