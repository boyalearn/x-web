package com.xweb.auth.server.bean;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

/******************************
 * 用途说明:
 * 作者姓名: zouhuixing
 * 创建时间: 2022/9/2 17:24
 ******************************/
@Getter
@Setter
public class Transfer {

    private List<String> selected;

    private List<Option> options;
}
