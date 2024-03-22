package com.web.phoenix.mapper;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;
import java.util.Map;

/**
 * @author zouhuixing
 * @date 2024/3/22
 */
@Mapper
public interface CommonMapper {

    @Select("${sql}")
    List<Map> list(String sql);


    @Update("${sql}")
    int update(String sql);

    @Delete("${sql}")
    int delete(String sql);


}
