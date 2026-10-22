package com.xweb.sql.planner.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.common.OrderNode;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderOperator implements SqlOperator {

    private SqlOperator operator;

    private List<OrderNode> orderItems;

    @Override
    public void open() {
        this.operator.open();
    }

    @Override
    public Page next() {
        return null;
    }

    @Override
    public void close() {

    }
}
