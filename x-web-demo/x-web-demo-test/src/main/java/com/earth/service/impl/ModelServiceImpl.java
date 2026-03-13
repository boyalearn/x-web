package com.earth.service.impl;

import com.earth.entity.Model;
import com.earth.mapper.ModelMapper;
import com.earth.service.IModelService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zhx
 * @since 2024-09-03
 */
@Service
public class ModelServiceImpl extends ServiceImpl<ModelMapper, Model> implements IModelService {

}
