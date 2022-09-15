package com.xweb.logger.service;

import com.xweb.common.exception.BusinessException;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/14 15:06
 ******************************/
public interface ILoggerService {

    void saveLogger(Object logsBean) throws BusinessException;
}
