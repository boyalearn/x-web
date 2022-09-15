package com.xweb.auth.server.controller;


import com.xweb.auth.server.bean.SystemLogPageRequest;
import com.xweb.auth.server.service.ISystemLoggerService;
import com.xweb.common.resolver.FormBody;
import com.xweb.common.standard.RespPageResult;
import com.xweb.logger.entity.LoggerBean;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author zhx
 * @since 2022-09-14
 */
@Api(tags = "系统日志")
@RestController
@RequestMapping("/system-logs")
public class SystemLoggerController {


    @Autowired
    private ISystemLoggerService systemLoggerService;

    @GetMapping()
    @ApiOperation(value = "日志列表")
    public RespPageResult<LoggerBean> selectSystemLogs(@FormBody SystemLogPageRequest request) {
        return RespPageResult.builder().data(systemLoggerService.selectSystemLogs(request)).build();
    }

}

