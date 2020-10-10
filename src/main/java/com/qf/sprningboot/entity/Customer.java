package com.qf.sprningboot.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Data
public class Customer implements Serializable {
    private static final long serialVersionUID = 1586034423739L;
    //    主键
    private Integer id;
    //    公司名
    private String username;
    //    密码
    private String password;
    //    昵称
    private String nickname;
    //    金钱
    private BigDecimal money;
    //    地址
    private String address;
    //    状态
    private Integer state;
}
