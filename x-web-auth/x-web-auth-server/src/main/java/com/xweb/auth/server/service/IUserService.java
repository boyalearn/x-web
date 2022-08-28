package com.xweb.auth.server.service;

import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.entity.LoginUser;
import com.xweb.auth.server.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface IUserService extends IService<User> {

    LoginUser createLoginUser(User user, Client client);

    void register(User user);

}
