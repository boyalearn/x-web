package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.item.SelectAllItem;
import com.xweb.sql.core.common.item.TableColumnItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.table.SimpleTable;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.StarColumnNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.meta.table.SimpleTableNode;
import com.xweb.sql.parser.converter.util.NodeUtil;

import java.util.ArrayList;
import java.util.List;

public class BaseSelectAstConverter implements AstConverter {
    @Override
    public Node convert(Item item) {
        BaseSelect baseSelect = (BaseSelect) item;
        SimpleSelect select = new SimpleSelect();
        final List<Item> selectItems = baseSelect.getSelectItems();
        select.setSelectItems(new ArrayList<>());
        for (Item selectItem : selectItems) {
            if (selectItem instanceof TableColumnItem) {
                TableColumnItem tableColumnItem = (TableColumnItem) selectItem;
                ColumnNode column = new ColumnNode(new SimpleTableNode("", tableColumnItem.getTableName()), tableColumnItem.getColumnName());
                select.getSelectItems().add(column);
            } else if (selectItem instanceof SelectAllItem) {
                StarColumnNode starColumn = new StarColumnNode();
                select.getSelectItems().add(starColumn);
            }
        }
        List<Table> tableItems = baseSelect.getTableItems();
        select.setTableItems(new ArrayList<>());
        for (Table tableItem : tableItems) {
            if (tableItem instanceof SimpleTable) {
                SimpleTable simpleTable = (SimpleTable) tableItem;
                SimpleTableNode tableItemTemp = new SimpleTableNode(simpleTable.getTableName());
                tableItemTemp.setAlias(simpleTable.getAlias());
                select.getTableItems().add(tableItemTemp);
            }
        }

        BooleanExpression whereExpression = baseSelect.getWhereExpression();
        select.setWhereExpression((BooleanNode) NodeUtil.convert(whereExpression));
        return (Node) select;
    }


}
