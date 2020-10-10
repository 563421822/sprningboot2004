package com.qf.sprningboot.mapper;

import com.qf.sprningboot.entity.TDistrict;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AnnotationMybatis {
    @Select(value = "SELECT * FROM t_district")
    List<TDistrict> finAll();

    @Select(value = "SELECT * FROM t_district WHERE id = #{id}")
    TDistrict findById(@Param("id") Integer id);
}
