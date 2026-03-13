package com.earth.service;

import com.earth.entity.Meta;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
public interface IMetaService extends IService<Meta> {
    List<Meta> listMetaByCodes(String[] codes);
}
