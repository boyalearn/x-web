package com.xweb.sql.mysql;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.select.BaseSelect;
import com.xweb.sql.core.common.Table;
import com.xweb.sql.core.common.order.OrderItem;
import com.xweb.sql.core.common.select.UnionSelect;
import com.xweb.sql.core.convert.AbstractCommonAstVisitor;
import com.xweb.sql.core.convert.RewriteFilter;

import java.util.ArrayList;
import java.util.List;


public class MysqlRewriterVisitor extends AbstractCommonAstVisitor {

    private List<RewriteFilter> rewriteFilters;

    public MysqlRewriterVisitor() {
        this.rewriteFilters = new ArrayList<>();
    }

    public void addFilter(RewriteFilter rewriteFilter) {
        this.rewriteFilters.add(rewriteFilter);
    }

    @Override
    protected Object visit(UnionSelect unionSelect) {
        return super.visit(unionSelect);
    }

    @Override
    public Object visit(BaseSelect select) {
        final List<Item> selectItems = select.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            Item selectItem = selectItems.get(i);
            Object result = visit(selectItem);
            if (result != selectItem) {
                selectItems.set(i, (Item) result);
            }
        }

        final List<Table> tableItems = select.getTableItems();
        if (!tableItems.isEmpty()) {
            for (int i = 0; i < tableItems.size(); i++) {
                Table tableItem = tableItems.get(i);
                Object result = visit(tableItem);
                if (result != tableItem) {
                    tableItems.set(i, (Table) result);
                }
            }
        }

        final BooleanExpression whereExpression = select.getWhereExpression();
        if (null != whereExpression) {
            Object result = visit(whereExpression);
            if (result != whereExpression) {
                select.setWhereExpression((BooleanExpression) result);
            }
        }
        final List<Item> itemsGroup = select.getGroupItems();
        if (!itemsGroup.isEmpty()) {
            for (int i = 0; i < itemsGroup.size(); i++) {
                Item item = itemsGroup.get(i);
                Object result = visit(item);
                if (result != item) {
                    itemsGroup.set(i, (Item) result);
                }
            }

        }

        final List<OrderItem> orderItems = select.getOrderItems();
        if (!orderItems.isEmpty()) {
            for (int i = 0; i < orderItems.size(); i++) {
                OrderItem orderItem = orderItems.get(i);
                Object result = visit(orderItem);
                if (result != orderItem) {
                    orderItems.set(i, (OrderItem) result);
                }
            }
        }
        final BooleanExpression havingExpression = select.getHavingExpression();
        if (null != havingExpression) {
            Object result = visit(havingExpression);
            if (result != havingExpression) {
                select.setHavingExpression((BooleanExpression) result);
            }
        }
        return select;
    }


    @Override
    protected Object doVisit(Object object) {
        for (RewriteFilter rewriteFilter : this.rewriteFilters) {
            if (rewriteFilter.support(object)) {
                return rewriteFilter.change(object);
            }
        }
        return object;
    }
}
