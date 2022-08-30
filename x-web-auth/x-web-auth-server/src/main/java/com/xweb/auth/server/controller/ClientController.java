package com.xweb.auth.server.controller;


import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.service.IClientService;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.RespPageResult;
import com.xweb.common.standard.RespResult;
import com.xweb.common.valid.Insert;
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
    public RespResult<String> deleteClient(@PathVariable("id") String id) {
        clientService.removeById(id);
        return RespResult.builder().data("").message("删除成功").build();
    }
}

