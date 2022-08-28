package com.xweb.auth.server.service;

import com.xweb.auth.server.entity.Client;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.standard.PageEntity;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
public interface IClientService extends IService<Client> {

    void addClient(Client client) throws BusinessException;

    PageEntity<Client> selectClients(ClientRequest clientRequest);
}

