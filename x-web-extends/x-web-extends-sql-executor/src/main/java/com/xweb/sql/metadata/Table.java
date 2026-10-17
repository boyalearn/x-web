package com.xweb.sql.metadata;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Table {

    private String tableName;

    private String alias;
}
