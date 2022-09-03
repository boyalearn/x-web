package com.xweb.auth.server.request;

import com.xweb.common.standard.PageRequest;
import lombok.Getter;
import lombok.Setter;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/1 19:24
 ******************************/
@Getter
@Setter
public class ResourceRequest extends PageRequest {

    private Integer clientId;
}
