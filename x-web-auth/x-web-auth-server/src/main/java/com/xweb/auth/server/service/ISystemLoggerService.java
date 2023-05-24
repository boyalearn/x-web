package com.xweb.auth.server.service;

import com.xweb.auth.server.bean.SystemLogPageRequest;
import com.xweb.auth.server.entity.SystemLogger;
import com.baomidou.mybatisplus.extension.service.IService;
import com.xweb.common.web.standard.PageEntity;
import com.xweb.logger.entity.LoggerBean;
import com.xweb.logger.service.ILoggerService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author zhx
 * @since 2022-09-14
 */
public interface ISystemLoggerService extends IService<SystemLogger>, ILoggerService {

    PageEntity<LoggerBean> selectSystemLogs(SystemLogPageRequest request);

}
