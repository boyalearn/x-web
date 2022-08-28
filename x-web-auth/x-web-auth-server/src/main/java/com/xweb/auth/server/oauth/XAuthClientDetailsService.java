package com.xweb.auth.server.oauth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.service.IClientService;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.stereotype.Component;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 0:56
 ******************************/
@Component
public class XAuthClientDetailsService implements ClientDetailsService {

    private IClientService clientService;

    public final static ThreadLocal<Client> CLIENT = new ThreadLocal<>();

    public XAuthClientDetailsService(IClientService clientService) {
        this.clientService = clientService;
    }

    @Override
    public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
        Client client = new Client();
        client.setClientId(clientId);
        Client appClient = clientService.getOne(new QueryWrapper<>(client));
        XAuthClientDetails clientDetails = new XAuthClientDetails();
        clientDetails.setClientId(appClient.getClientId());
        clientDetails.setClientSecret(appClient.getClientSecret());
        clientDetails.setScope(appClient.getScopeSet());
        clientDetails.setRedirectUris(appClient.getRedirectUriSet());
        clientDetails.setAuthorizedGrantTypes(appClient.getAuthorizedGrantTypeSet());
        CLIENT.set(appClient);
        return clientDetails;
    }
}
