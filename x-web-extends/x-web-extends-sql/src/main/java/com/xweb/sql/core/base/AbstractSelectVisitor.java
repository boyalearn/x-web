package com.xweb.sql.core.base;

import java.util.List;

public abstract class AbstractSelectVisitor {

    public void visit(BaseSelect baseSelect) {
        final List<Item> selectItems = baseSelect.getSelectItems();
        for (Item selectItem : selectItems) {
            this.visitItem(selectItem);
        }

        final List<TableItem> tableItems = baseSelect.getTableItems();
        for (TableItem tableItem : tableItems) {
            this.visitItem(tableItem);
        }


        final List<WhereItem> whereItems = baseSelect.getWhereItems();
        for (WhereItem whereItem : whereItems) {
            this.visitItem(whereItem);
        }

        final List<GroupItem> groupItems = baseSelect.getGroupItems();
        for (GroupItem groupItem : groupItems) {
            this.visitItem(groupItem);
        }

        final List<OrderItem> orderItems = baseSelect.getOrderItems();
        for (OrderItem orderItem : orderItems) {
            this.visitItem(orderItem);
        }
        final List<HavingItem> havingItems = baseSelect.getHavingItems();
        for (HavingItem havingItem : havingItems) {
            this.visitItem(havingItem);
        }
    }

    protected abstract void visitItem(Object selectItem);

}
