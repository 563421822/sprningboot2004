package com.qf.sprningboot.mapper;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.sprningboot.entity.TAir;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AirMapperTest {
    @Autowired
    private AirMapper airMapper;

    @Test
    public void findAll() {
        List<TAir> list = airMapper.findAll();
        list.forEach(tAir -> {
            System.out.println("tAir = " + tAir);
        });
        list.forEach(System.out::println);
        list.stream().forEach((e) -> System.out.println("e = " + e));
    }

    @Test
    public void findByPage() {
//        执行分页
        PageHelper.startPage(1, 3);
//        执行查询
        List<TAir> all = airMapper.findAll();
//        封装成PageInfo对象
        PageInfo<TAir> pageInfo = new PageInfo<>(all);
        pageInfo.getList().forEach(System.out::println);
    }


}