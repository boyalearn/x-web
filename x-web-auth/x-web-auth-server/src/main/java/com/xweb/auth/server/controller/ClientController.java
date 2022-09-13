package com.xweb.auth.server.controller;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.service.IClientService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.utils.JsonUtil;
import com.xweb.common.valid.Insert;
import com.xweb.common.valid.Update;
import com.xweb.logger.annotation.Option;
import com.xweb.logger.annotation.XWebLogger;
import com.xweb.logger.utils.XWebLoggerHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

/**
 * 应用管理类
 *
 * @author zhx
 * @since 2022-08-27
 */
@Api(tags = "应用管理")
@RestController
@RequestMapping("clients")
public class ClientController {

    private final IClientService clientService;

    public ClientController(IClientService clientService) {
        this.clientService = clientService;
    }

    /**
     * 应用授权
     *
     * @param client
     * @return
     * @throws BusinessException
     */
    @ApiOperation(value = "应用授权接口")
    @PostMapping()
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "应用管理", option = Option.INSERT)
    public RespResult<String> addClient(@Validated(Insert.class) @RequestBody Client client) throws BusinessException {
        clientService.addClient(client);
        try {
            String clientInfo = JsonUtil.toJSON(client);
            XWebLoggerHelper.setDescription("新增应用，详情数据为：" + clientInfo);

        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "数据转json异常");
        }
        return RespResult.builder().data("").message("应用添加成功").build();
    }

    /**
     * 查看应用详情
     *
     * @param id
     * @return
     * @throws BusinessException
     */
    @ApiOperation(value = "查看应用详情")
    @GetMapping("/{id}")
    @XWebLogger(model = "应用管理", option = Option.SELECT, description = "查询了应用详情")
    public RespResult<Client> findClient(@PathVariable("id") String id) throws BusinessException {
        Client client = clientService.getById(id);
        XWebLoggerHelper.setDescription("查询了应用ID为" + id + "的详情数据");
        return RespResult.builder().data(client).message("查询成功").build();
    }

    /**
     * 查看应用列表
     *
     * @param clientRequest
     * @return
     * @throws BusinessException
     */
    @ApiOperation(value = "查看应用列表")
    @GetMapping()
    @XWebLogger(model = "应用管理", option = Option.SELECT, description = "查询了应用列表")
    public RespPageResult<Client> selectClients(@FormBody ClientRequest clientRequest) throws BusinessException {
        return RespPageResult.builder().data(clientService.selectClients(clientRequest)).message("查询成功").build();
    }

    /**
     * @param id 应用ID
     * @return
     */
    @ApiOperation("删除应用")
    @DeleteMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "应用管理", option = Option.DELETE)
    public RespResult<String> deleteClient(@PathVariable("id") String id) throws BusinessException {
        Client client = clientService.getById(id);
        clientService.removeById(id);
        try {
            XWebLoggerHelper.setDescription("删除了应用，应用详情为：" + JsonUtil.toJSON(client));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json转换失败");
        }
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param client 应用ID
     * @return
     */
    @ApiOperation("修改应用")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "应用管理", option = Option.UPDATE)
    public RespResult<String> updateClient(@Validated(Update.class) @RequestBody Client client) throws BusinessException {
        Client before = clientService.getById(client.getId());
        clientService.updateById(client);
        Client after = clientService.getById(client.getId());
        try {
            XWebLoggerHelper.setDescription("修改了应用，修改前：" + JsonUtil.toJSON(before) + ";修改后" + JsonUtil.toJSON(after));
        } catch (JsonProcessingException e) {
            throw new BusinessException(BusinessException.BUSINESS_EXCEPTION, "json 异常");
        }
        return RespResult.builder().data("").message("修改成功").build();
    }

    /**
     * @param clientId 应用ID
     * @param userId   用户ID
     * @return
     */
    @ApiOperation("应用用户授权")
    @PutMapping("/{client_id}/users/{user_id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    @XWebLogger(model = "应用管理", option = Option.UPDATE)
    public RespResult<String> updateClient(@PathVariable("client_id") String clientId,
                                           @PathVariable("user_id") String userId, @RequestBody String[] roleIds) {
        clientService.updateClientUserRole(clientId, userId, roleIds);
        XWebLoggerHelper.setDescription("修改了应用ID:" + clientId + "用户ID:" + userId + "的角色ID为：" + roleIds);

        return RespResult.builder().data("").message("修改成功").build();
    }
}

