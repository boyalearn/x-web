package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.table.SimpleTableNode;

public class SimpleTableConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        SimpleTable simpleTable = (SimpleTable) item;
        SimpleTableNode simpleTableNode = new SimpleTableNode(simpleTable.getTableName());
        simpleTableNode.setAlias(simpleTable.getAlias());
        return simpleTableNode;
    }
}
