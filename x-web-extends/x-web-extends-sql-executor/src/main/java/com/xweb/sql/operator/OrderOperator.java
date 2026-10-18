package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.item.OrderItem;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class OrderOperator implements SqlOperator{

    private SqlOperator operator;

    private List<OrderItem> orderItems;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        return null;
    }

    @Override
    public void close() {

    }
}
