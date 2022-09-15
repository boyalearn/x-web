package com.xweb.auth.server.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xweb.auth.server.bean.SystemLogPageRequest;
import com.xweb.auth.server.bean.SystemLoggerInfo;
import com.xweb.auth.server.entity.Client;
import com.xweb.auth.server.entity.SystemLogger;
import com.xweb.auth.server.entity.User;
import com.xweb.auth.server.mapper.SystemLoggerMapper;
import com.xweb.auth.server.service.IClientService;
import com.xweb.auth.server.service.ISystemLoggerService;
import com.xweb.auth.server.service.IUserService;
import com.xweb.common.exception.BusinessException;
import com.xweb.common.standard.PageEntity;
import com.xweb.common.utils.PageUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author zhx
 * @since 2022-09-14
 */
@Service
public class SystemLoggerServiceImpl extends ServiceImpl<SystemLoggerMapper, SystemLogger> implements ISystemLoggerService {

    @Autowired
    private IUserService userService;

    @Autowired
    private IClientService clientService;

    @Override
    public PageEntity selectSystemLogs(SystemLogPageRequest request) {
        PageUtil.startPageDefault(request);
        SystemLogger systemLogger = new SystemLogger();
        QueryWrapper queryWrapper = new QueryWrapper(systemLogger);
        if (Optional.ofNullable(request.getStartTime()).isPresent() && Optional.ofNullable(request.getEndedTime()).isPresent()) {
            queryWrapper.between("create_time", request.getStartTime(), request.getEndedTime());
        }
        if (Optional.ofNullable(request.getSearch()).isPresent()) {
            queryWrapper.like("description", request.getSearch());
        }
        PageEntity pageEntity = PageUtil.buildResult(list(queryWrapper));
        List<SystemLogger> list = pageEntity.getList();

        Set<Integer> userIds = list.stream().map(SystemLogger::getUserId).collect(Collectors.toSet());
        Map<Integer, User> userMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(userIds)) {
            List<User> users = userService.listByIds(userIds);
            userMap = users.stream().collect(Collectors.toMap(User::getId, Function.identity()));
        }
        Set<Integer> clientIds = list.stream().map(SystemLogger::getClientId).collect(Collectors.toSet());
        Map<Integer, Client> clientMap = new HashMap<>();
        if (!CollectionUtils.isEmpty(clientIds)) {
            List<Client> clients = clientService.listByIds(clientIds);
            clientMap = clients.stream().collect(Collectors.toMap(Client::getId, Function.identity()));

        }
        List<SystemLoggerInfo> systemLoggerInfos = new ArrayList<>();
        final Map<Integer, User> finalUserMap = userMap;
        final Map<Integer, Client> finalClientMap = clientMap;
        list.forEach(r -> {
            SystemLoggerInfo systemLoggerInfo = new SystemLoggerInfo();
            BeanUtils.copyProperties(r, systemLoggerInfo);
            systemLoggerInfo.setUserName(finalUserMap.get(r.getUserId()).getName());
            systemLoggerInfo.setClientName(finalClientMap.get(r.getClientId()).getName());
            systemLoggerInfos.add(systemLoggerInfo);
        });

        pageEntity.setList(systemLoggerInfos);

        return pageEntity;
    }

    @Override
    public void saveLogger(Object logsBean) throws BusinessException {
        SystemLogger systemLogger = new SystemLogger();
        BeanUtils.copyProperties(logsBean, systemLogger);
        save(systemLogger);
    }
}
