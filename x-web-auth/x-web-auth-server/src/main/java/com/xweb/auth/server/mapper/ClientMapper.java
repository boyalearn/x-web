package com.xweb.auth.server.mapper;

import com.xweb.auth.server.entity.Client;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface ClientMapper extends BaseMapper<Client> {

    List<Map> findAllClient(String a, String b);

}
