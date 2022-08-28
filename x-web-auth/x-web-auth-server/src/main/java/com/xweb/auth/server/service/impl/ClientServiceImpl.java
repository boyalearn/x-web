package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.mapper.ClientMapper;
import com.xweb.auth.server.request.ClientRequest;
import com.xweb.auth.server.service.IClientService;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.utils.PageUtil;
import org.springframework.stereotype.Service;

import java.util.Set;
import java.util.UUID;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements IClientService {


    private static final String ALL_GRANT_TYPE = "authorization_code,password,implicit,client_credentials";

    @Override
    public void addClient(Client client) throws BusinessException {
        validationAndSettingsClient(client);
        save(client);
    }

    @Override
    public PageEntity<Client> selectClients(ClientRequest clientRequest) {
        PageUtil.startPage(clientRequest);
        return PageUtil.buildResult(list());
    }

    private void validationAndSettingsClient(Client client) throws BusinessException {
        Set<String> authorizedGrantTypeSet = client.getAuthorizedGrantTypeSet();
        if (authorizedGrantTypeSet.isEmpty()) {
            client.setAuthorizedGrantTypes(ALL_GRANT_TYPE);
        } else {
            for (String grantType : authorizedGrantTypeSet) {
                if (ALL_GRANT_TYPE.indexOf(grantType) < 0) {
                    throw new BusinessException(BusinessException.PARAMETER_EXCEPTION, grantType + " is illegal");
                }
            }
        }
        Set<String> scopeSet = client.getScopeSet();
        if (scopeSet.isEmpty()) {
            client.setScope("all");
        }
        Set<String> redirectUriSet = client.getRedirectUriSet();
        if (redirectUriSet.isEmpty()) {
            throw new BusinessException(BusinessException.PARAMETER_EXCEPTION, "redirect must bu not null");
        }
        client.setClientId(UUID.randomUUID().toString());
        client.setClientSecret(UUID.randomUUID().toString());
    }
}
