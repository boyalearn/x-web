package com.xweb.auth.server.controller;


import com.xweb.auth.server.auth.XAuthRole;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.service.IClientService;
import com.xweb.common.auth.Auth;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
import com.xweb.common.valid.Update;
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
    public RespResult<String> addClient(@Validated(Insert.class) @RequestBody Client client) throws BusinessException {
        clientService.addClient(client);
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
    public RespResult<Client> findClient(@PathVariable("id") String id) throws BusinessException {
        Client client = clientService.getById(id);
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
    public RespResult<String> deleteClient(@PathVariable("id") String id) {
        clientService.removeById(id);
        return RespResult.builder().data("").message("删除成功").build();
    }

    /**
     * @param client 应用ID
     * @return
     */
    @ApiOperation("修改应用")
    @PutMapping("/{id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> updateClient(@Validated(Update.class) @RequestBody Client client) {
        clientService.updateById(client);
        return RespResult.builder().data("").message("修改成功").build();
    }

    /**
     * @param clientId 应用ID
     * @param userId   用户ID
     * @return
     */
    @ApiOperation("修改应用")
    @PutMapping("/{client_id}/users/{user_id}")
    @Auth(roles = {XAuthRole.SUPPER_ADMIN})
    public RespResult<String> updateClient(@PathVariable("client_id") String clientId,
                                           @PathVariable("user_id") String userId, @RequestBody String[] roleIds) {
        clientService.updateClientUserRole(clientId, userId, roleIds);
        return RespResult.builder().data("").message("修改成功").build();
    }
}

