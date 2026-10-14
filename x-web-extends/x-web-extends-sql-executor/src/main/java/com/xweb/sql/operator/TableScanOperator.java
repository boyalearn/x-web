package com.xweb.sql.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class TableScanOperator implements SqlOperator{

    private String tableName;

    @Override
    public void open() {

    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void close() {

    }
}
