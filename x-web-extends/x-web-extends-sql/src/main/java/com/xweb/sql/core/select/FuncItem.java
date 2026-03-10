package com.xweb.sql.core.select;

import lombok.Data;

import java.util.List;

@Data
public class FuncItem {

    private String funcName;

    private List<Object> params;
}
