package com.qf.sprningboot;

import com.qf.sprningboot.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {
    @Bean(name = "haha")
    public User getUser() {
        return new User(1, "张三");
    }

}
