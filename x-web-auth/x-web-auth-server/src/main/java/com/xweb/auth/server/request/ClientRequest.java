package com.xweb.auth.server.request;

import com.xweb.common.web.standard.PageRequest;
import lombok.Getter;
import lombok.Setter;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/8/28 11:50
 ******************************/
@Getter
@Setter
public class ClientRequest extends PageRequest {

    private String tenantId;
}
