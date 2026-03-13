package com.earth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.earth.entity.Meta;
import com.earth.mapper.MetaMapper;
import com.earth.service.IMetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
@Service
public class MetaServiceImpl extends ServiceImpl<MetaMapper, Meta> implements IMetaService {

    @Autowired
    private MetaMapper metaMapper;

    @Override
    public List<Meta> listMetaByCodes(String[] codes) {
        QueryWrapper<Meta> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().in(Meta::getCode, codes);
        return list(queryWrapper);
    }

    @Override
    public List<Object> selectHasFunctionNvl() {
        return metaMapper.selectHasFunctionNvl();
    }


}
