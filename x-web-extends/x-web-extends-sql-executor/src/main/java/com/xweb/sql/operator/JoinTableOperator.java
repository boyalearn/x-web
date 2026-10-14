package com.xweb.sql.operator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class JoinTableOperator extends AbstractOperator{

    private String table;

    private String joinTable;

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
