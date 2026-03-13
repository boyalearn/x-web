package com.earth.service;

import com.earth.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.common.exception.BusinessException;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2024-08-21
 */
public interface IUserService extends IService<User> {
    User login(User user) throws BusinessException;
}
