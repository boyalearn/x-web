package com.xweb.sql.operator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UnionOperator extends AbstractOperator{

    private SqlOperator sqlOperator;

    private SqlOperator unionOperator;

    private boolean all;

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
