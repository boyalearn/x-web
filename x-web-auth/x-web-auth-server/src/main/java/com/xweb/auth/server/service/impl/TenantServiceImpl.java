package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.entity.Tenant;
import com.xweb.auth.server.mapper.TenantMapper;
import com.xweb.auth.server.service.ITenantService;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.standard.PageRequest;
import com.xweb.common.utils.PageUtil;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-08-27
 */
@Service
public class TenantServiceImpl extends ServiceImpl<TenantMapper, Tenant> implements ITenantService {

    @Override
    public PageEntity<Tenant> selectTenants(PageRequest request) {
        PageUtil.startPage(request);
        return PageUtil.buildResult(list());
    }
}
