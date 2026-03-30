package com.xweb.sql.mysql.filter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.item.ConstantItem;
import com.xweb.sql.core.common.select.BaseSelect;

import java.util.List;
import java.util.Optional;

public class GroupNumberFilter implements MysqlFilter {


    @Override
    public boolean support(Item item) {
        if (!(item instanceof BaseSelect)) {
            return false;
        }
        BaseSelect baseSelect = (BaseSelect) item;
        final List<Item> groupItems = baseSelect.getGroupItems();
        if (Optional.ofNullable(groupItems).isPresent() && !groupItems.isEmpty()) {
            for (Item groupItem : groupItems) {
                if (groupItem instanceof ConstantItem) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Item change(Item item) {
        BaseSelect baseSelect = (BaseSelect) item;
        final List<Item> selectItems = baseSelect.getSelectItems();
        final List<Item> groupItems = baseSelect.getGroupItems();
        for (int i = 0; i < groupItems.size(); i++) {
            Item groupItem = groupItems.get(i);
            if (groupItem instanceof ConstantItem) {
                ConstantItem constantItem = (ConstantItem) groupItem;
                String constant = constantItem.getConstant();
                try {
                    Integer index = Integer.valueOf(constant);
                    groupItems.set(i, selectItems.get(index - 1));
                } catch (Exception e) {
                    continue;
                }
            }
        }
        return baseSelect;
    }
}
