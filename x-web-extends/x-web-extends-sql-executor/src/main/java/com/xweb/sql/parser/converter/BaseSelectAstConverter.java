package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.parser.converter.util.NodeUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseSelectAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        BaseSelect baseSelect = (BaseSelect) item;
        SimpleSelect select = new SimpleSelect();
        final List<Item> selectItems = baseSelect.getSelectItems();
        select.setItemNodes(new ArrayList<>());
        for (Item selectItem : selectItems) {
            select.getItemNodes().add(NodeUtil.convert(selectItem));
        }
        List<Table> tableItems = baseSelect.getTableItems();
        select.setTableNodes(new ArrayList<>());
        for (Table tableItem : tableItems) {
            select.getTableNodes().add((TableNode) NodeUtil.convert(tableItem));
        }

        BooleanExpression whereExpression = baseSelect.getWhereExpression();
        select.setWhereNode((BooleanNode) NodeUtil.convert(whereExpression));
        return select;
    }


}
