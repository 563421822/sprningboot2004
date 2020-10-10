package com.qf.sprningboot.entity;

import lombok.Data;

import java.io.Serializable;

@Data
public class TAir implements Serializable {

    private long id;
    private long districtId;
    private java.sql.Date monitorTime;
    private long pm10;
    private long pm25;
    private String monitoringStation;
    private String lastModifyTime;
}
