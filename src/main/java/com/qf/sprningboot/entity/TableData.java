package com.qf.sprningboot.entity;

import lombok.Data;

import java.util.List;

@Data
public class TableData {
    private Integer code;
    private String msg;
    private Long count;
    private List<Customer> data;
}
