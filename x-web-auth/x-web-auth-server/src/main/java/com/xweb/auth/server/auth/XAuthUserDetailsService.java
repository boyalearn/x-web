package com.xweb.auth.server.auth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xweb.auth.server.entity.LoginUser;
import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.service.IUserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/27 4:10
 ******************************/
public class XAuthUserDetailsService implements UserDetailsService {

    private IUserService userService;

    public XAuthUserDetailsService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = new User();
        user.setAccount(username);
        User dbUser = userService.getOne(new QueryWrapper<>(user));
        XAuthUserDetails xAuthUserDetails = new XAuthUserDetails(dbUser.getAccount(), dbUser.getPassword());
        return xAuthUserDetails;
    }
}
