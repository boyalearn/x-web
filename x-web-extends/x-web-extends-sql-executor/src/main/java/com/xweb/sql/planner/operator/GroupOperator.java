package com.xweb.sql.planner.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.Node;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GroupOperator implements SqlOperator {

    private SqlOperator operator;

    private List<Node> selectItem;

    private List<Node> groupItems;


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
