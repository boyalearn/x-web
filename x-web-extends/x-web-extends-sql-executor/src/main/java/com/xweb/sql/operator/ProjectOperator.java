package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.meta.Item;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
public class ProjectOperator extends AbstractOperator{

    private List<Item> items;

    private SqlOperator operator;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page page = new Page();
        Page next = operator.next();
        while (!next.isEmpty()){
            page.addRows(next.getRows());
            next = operator.next();
        }
        return page;
    }

    @Override
    public void close() {

    }
}
