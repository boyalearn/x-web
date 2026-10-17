package com.xweb.sql.metadata;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Table {

    private String databaseName;

    private String name;

    private String alias;


    public Table(String name,String alias){
        this.name = name;
        this.alias = alias;
    }
}
