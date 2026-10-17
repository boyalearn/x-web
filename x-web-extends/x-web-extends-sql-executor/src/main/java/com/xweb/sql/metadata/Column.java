package com.xweb.sql.metadata;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Column {
    private Table table;
    private String columnName;
}
