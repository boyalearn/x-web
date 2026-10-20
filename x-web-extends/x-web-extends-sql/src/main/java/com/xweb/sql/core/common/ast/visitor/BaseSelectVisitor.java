package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.BaseSelect;

import java.util.List;
import java.util.Optional;

public class BaseSelectVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        BaseSelect select = (BaseSelect) item;
        StringBuffer sql = new StringBuffer();
        sql.append(select.getSelect());
        final List<Item> selectItems = select.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            Item selectItem = selectItems.get(i);
            if (0 == i) {
                sql.append(AstUtil.SPACE + AstUtil.toSql(selectItem));
            } else {
                sql.append(AstUtil.COMMA + AstUtil.toSql(selectItem));
            }
        }

        final List<Table> tableItems = select.getTableItems();
        if (!tableItems.isEmpty()) {
            sql.append(AstUtil.SPACE);
            sql.append(select.getFrom());
            for (int i = 0; i < tableItems.size(); i++) {
                Table tableItem = tableItems.get(i);
                if (i != 0) {
                    sql.append(AstUtil.COMMA);
                } else {
                    sql.append(AstUtil.SPACE);
                }
                sql.append(AstUtil.toSql(tableItem));
            }
        }


        final BooleanExpression whereExpression = select.getWhereExpression();
        if (null != whereExpression) {
            sql.append(AstUtil.SPACE + select.getWhere());
            sql.append(AstUtil.SPACE + AstUtil.toSql(whereExpression));
        }
        final List<Item> itemsGroup = select.getGroupItems();
        if (!itemsGroup.isEmpty()) {
            sql.append(AstUtil.SPACE);
            sql.append(select.getGroup());
            for (int i = 0; i < itemsGroup.size(); i++) {
                Item groupItem = itemsGroup.get(i);
                if (0 == i) {
                    sql.append(AstUtil.SPACE);
                } else {
                    sql.append(AstUtil.COMMA);
                }
                sql.append(AstUtil.toSql(groupItem));
            }

        }

        final List<OrderItem> orderItems = select.getOrderItems();
        if (!orderItems.isEmpty()) {
            sql.append(AstUtil.SPACE + select.getOrder());
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                if (0 == i) {
                    sql.append(AstUtil.SPACE + AstUtil.toSql(orderItem));
                } else {
                    sql.append(AstUtil.COMMA + AstUtil.toSql(orderItem));
                }
            }
        }
        final BooleanExpression havingExpression = select.getHavingExpression();
        if (null != havingExpression) {
            sql.append(AstUtil.SPACE);
            sql.append(select.getHaving());
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(havingExpression));
        }

        if (Optional.ofNullable(select.getPage()).isPresent()) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(select.getPage()));
        }

        return sql.toString();
    }
}
