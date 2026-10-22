package com.xweb.sql.planner.operator;

import com.xweb.sql.data.Page;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UnionOperator extends AbstractOperator {

    private SqlOperator sqlOperator;

    private SqlOperator unionOperator;

    private boolean all;

    @Override
    public void open() {
        this.sqlOperator.open();
        this.unionOperator.open();
    }

    @Override
    public Page next() {
        return null;
    }

    @Override
    public void close() {

    }
}
