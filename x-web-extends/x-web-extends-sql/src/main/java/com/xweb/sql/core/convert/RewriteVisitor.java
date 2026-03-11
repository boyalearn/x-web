package com.xweb.sql.core.convert;

import com.xweb.sql.core.base.AbstractSelectVisitor;
import com.xweb.sql.core.base.BaseSelect;
import com.xweb.sql.core.base.GroupItem;
import com.xweb.sql.core.base.HavingItem;
import com.xweb.sql.core.base.Item;
import com.xweb.sql.core.base.OrderItem;
import com.xweb.sql.core.base.TableItem;
import com.xweb.sql.core.base.WhereItem;

import java.util.List;

public class RewriteVisitor extends AbstractSelectVisitor {

    @Override
    public void visit(BaseSelect baseSelect) {
        final List<Item> selectItems = baseSelect.getSelectItems();
        for (int i = 0; i < selectItems.size(); i++) {
            final Object result = this.visitItemAndReplace(selectItems.get(i));
            if (selectItems.get(i) != result) {
                selectItems.set(i, (Item) result);
            }
        }

        final List<TableItem> tableItems = baseSelect.getTableItems();
        for (int i = 0; i < tableItems.size(); i++) {
            final Object result = this.visitItemAndReplace(tableItems.get(i));
            if (tableItems.get(i) != result) {
                tableItems.set(i, (TableItem) result);
            }
        }

        final List<WhereItem> whereItems = baseSelect.getWhereItems();
        for (int i = 0; i < whereItems.size(); i++) {
            final Object result = this.visitItemAndReplace(whereItems.get(i));
            if (whereItems.get(i) != result) {
                whereItems.set(i, (WhereItem) result);
            }
        }

        final List<GroupItem> groupItems = baseSelect.getGroupItems();
        for (int i = 0; i < groupItems.size(); i++) {
            final Object result = this.visitItemAndReplace(groupItems.get(i));
            if (groupItems.get(i) != result) {
                groupItems.set(i, (GroupItem) result);
            }
        }

        final List<OrderItem> orderItems = baseSelect.getOrderItems();
        for (int i = 0; i < orderItems.size(); i++) {
            final Object result = this.visitItemAndReplace(orderItems.get(i));
            if (orderItems.get(i) != result) {
                orderItems.set(i, (OrderItem) result);
            }
        }
        final List<HavingItem> havingItems = baseSelect.getHavingItems();
        for (int i = 0; i < havingItems.size(); i++) {
            final Object result = this.visitItemAndReplace(havingItems.get(i));
            if (havingItems.get(i) != result) {
                havingItems.set(i, (HavingItem) result);
            }
        }
    }

    @Override
    protected void visitItem(Object selectItem) {

    }

    protected Object visitItemAndReplace(Object selectItem) {
        return selectItem;
    }
}
