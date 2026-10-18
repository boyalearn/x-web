package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.Item;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class GroupOperator implements SqlOperator{

    private SqlOperator operator;

    private List<Item> selectItem;

    private List<Item> groupItems;


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
