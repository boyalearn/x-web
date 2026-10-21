package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.table.SimpleTableNode;

public class TableColumnItemAstConverter implements AstConverter{
    @Override
    public Node convert(Item item) {
        TableColumnItem tableColumnItem = (TableColumnItem) item;
        return new ColumnNode(new SimpleTableNode("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());
    }
}
