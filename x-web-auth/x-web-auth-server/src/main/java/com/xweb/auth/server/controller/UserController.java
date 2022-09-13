package com.xweb.auth.server.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.service.IUserService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.utils.JsonUtil;
import com.xweb.common.valid.Insert;
import com.xweb.logger.annotation.Option;
import com.xweb.logger.annotation.XWebLogger;
import com.xweb.logger.utils.XWebLoggerHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 用户管理
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "用户管理")
@RestController
@RequestMapping("/users")
public class
UserController {

    private final IUserService userService;

    public UserController(IUserService userService) {
        this.userService = userService;
    }

    /**
     * 用户注册
     *
     * @param user
     * @return
     */
    @ApiOperation(value = "用户注册")
    @PostMapping("/register")
    public RespResult<String> register(@Validated(Insert.class) @RequestBody User user) {
        userService.register(user);
        return RespResult.builder().data("").message("注册成功").build();
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    @ApiOperation(value = "添加用户")
    @PostMapping("")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "用户管理", option = Option.INSERT)
    public RespResult<String> addUser(@Validated(Insert.class) @RequestBody User user) throws BusinessException {
        userService.register(user);
        try {
            XWebLoggerHelper.setDescription("添加了用户，详情为：" + JsonUtil.toJSON(user));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "Json 解析异常");
        }

        return RespResult.builder().data("").message("添加用户成功").build();
    }

    @ApiOperation(value = "查询用户列表")
    @GetMapping("")
    @XWebLogger(model = "用户管理", option = Option.SELECT, description = "查询了用户列表")
    public RespPageResult<User> selectUsers(@FormBody PageRequest request) {

        return RespPageResult.builder().data(userService.selectUsers(request)).message("查询成功").build();
    }

    /**
     * @param id ID
     * @return
     */
    @ApiOperation("删除用户")
    @DeleteMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "用户管理", option = Option.DELETE)
    public RespResult<String> deleteUser(@PathVariable("id") String id) throws BusinessException {
        User user = userService.getById(id);
        userService.removeById(id);
        try {
            XWebLoggerHelper.setDescription("删除了用户，用户ID:" + id + ";详情为：" + JsonUtil.toJSON(user));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "JSON 解析异常");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param user User
     * @return
     */
    @ApiOperation("修改用户")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "用户管理", option = Option.UPDATE)
    public RespResult<String> updateUser(@RequestBody User user) throws BusinessException {
        User before = userService.getById(user.getId());
        userService.updateById(user);
        User after = userService.getById(user.getId());

        try {
            XWebLoggerHelper.setDescription("修改了角色，修改前：" + JsonUtil.toJSON(before) + ";修改后" + JsonUtil.toJSON(after));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json 异常");
        }
        return RespResult.builder().data("").message("更新成功").build();
    }
}

