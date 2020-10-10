package com.qf.sprningboot.entity;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;


@Data
@Component(value = "a1")
@ConfigurationProperties(prefix = "aliyun")
public class Aliyun {
    @Value(value = "王永亮")
    private String www;
    @Value(value = "haha")
    private String aa;
    @Value(value = "哈哈")
    private String fa;
}
