package com.xweb.sql.mysql.filter;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.item.FunctionCallItem;

public class NvlToIfNullFilter implements MysqlFilter {

    private final static String NVL = "NVL";

    private final static String IF_NULL = "IFNULL";

    @Override
    public boolean support(Item item) {
        if (item instanceof FunctionCallItem && ((FunctionCallItem) item).getName().equalsIgnoreCase(NVL)) {
            return true;
        }
        return false;
    }

    @Override
    public Item change(Item item) {
        FunctionCallItem functionCallItem = (FunctionCallItem) item;
        functionCallItem.setName(IF_NULL);
        return item;
    }
}
