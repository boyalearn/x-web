package com.xweb.auth.server.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/2 10:35
 ******************************/
@Getter
@Setter
public class TenantClientTree {

    private String label;

    private String value;

    private List<TenantClientTree> children;
}
