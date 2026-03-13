package com.earth.mapper;

import com.earth.entity.Meta;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
public interface MetaMapper extends BaseMapper<Meta> {


    List<Object> selectHasFunctionNvl();
}
