package com.xweb.excel.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CellInfo {

    private String name;

    private int order;

    private int cellWidth;

    private String fieldName;
}
