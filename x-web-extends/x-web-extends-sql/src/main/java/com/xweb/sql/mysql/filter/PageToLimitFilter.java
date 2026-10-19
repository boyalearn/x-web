package com.xweb.sql.mysql.filter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.page.LimitPageItem;
import com.xweb.sql.core.common.page.OffsetPageItem;

import java.util.ArrayList;

public class PageToLimitFilter implements MysqlFilter {
    @Override
    public boolean support(Item item) {
        if (item instanceof OffsetPageItem) {
            return true;
        }
        return false;
    }

    @Override
    public Item change(Item item) {
        OffsetPageItem offsetPageItem = (OffsetPageItem) item;
        LimitPageItem limitPageItem = new LimitPageItem();
        limitPageItem.setLimit("limit");
        limitPageItem.setLimitItems(new ArrayList<>());
        limitPageItem.getLimitItems().add(offsetPageItem.getStart());
        limitPageItem.getLimitItems().add(offsetPageItem.getRow());
        return limitPageItem;
    }
}
