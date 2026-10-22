package com.xweb.sql.parser.converter;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.common.BooleanNode;
import com.xweb.sql.meta.common.OrderNode;
import com.xweb.sql.meta.common.TableNode;
import com.xweb.sql.meta.select.SimpleSelect;
import com.xweb.sql.parser.converter.util.NodeUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

        List<OrderItem> orderItems = baseSelect.getOrderItems();
        if (Optional.ofNullable(orderItems).isPresent()) {
            select.setOrderNodes(new ArrayList<>());
            for (OrderItem orderItem : orderItems) {
                select.getOrderNodes().add((OrderNode) NodeUtil.convert(orderItem));
            }
        }

        return select;
    }


}
