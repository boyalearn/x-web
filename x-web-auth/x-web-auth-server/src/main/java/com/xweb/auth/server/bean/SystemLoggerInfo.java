package com.xweb.auth.server.bean;

import com.xweb.auth.server.entity.SystemLogger;
import com.xweb.logger.entity.LoggerBean;
import lombok.Getter;
import lombok.Setter;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/14 11:06
 ******************************/
@Getter
@Setter
public class SystemLoggerInfo extends SystemLogger {

    private String userName;

    private String clientName;
}
