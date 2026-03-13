package com.earth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.earth.entity.User;
import com.earth.mapper.UserMapper;
import com.earth.service.IUserService;
import com.xweb.common.exception.BusinessException;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

    @Override
    public User login(User user) throws BusinessException {
        QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.lambda().eq(User::getAccount, user.getAccount());
        List<User> users = list(queryWrapper);
        if (CollectionUtils.isEmpty(users)) {
            throw new BusinessException(BusinessException.AUTH_EXCEPTION, "登录失败，请重试");
        }
        if(user.getPassword().equals(users.get(0).getPassword())){
            User result= new User();
            result.setMetaId(users.get(0).getMetaId());
            result.setId(users.get(0).getId());
            return result;
        }
        throw new BusinessException(BusinessException.AUTH_EXCEPTION, "登录失败，请重试");
    }
}
