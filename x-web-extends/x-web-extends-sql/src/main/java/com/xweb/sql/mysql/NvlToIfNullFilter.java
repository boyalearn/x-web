package com.xweb.sql.mysql;

import com.xweb.sql.core.common.item.FunctionCallItem;
import com.xweb.sql.core.convert.RewriteFilter;

public class NvlToIfNullFilter implements RewriteFilter {

    private final static String NVL = "NVL";

    private final static String IF_NULL = "IFNULL";

    @Override
    public boolean support(Object object) {
        if (object instanceof FunctionCallItem) {
            FunctionCallItem FunctionCallItem = (FunctionCallItem) object;
            if (NVL.equalsIgnoreCase(FunctionCallItem.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object change(Object object) {
        FunctionCallItem FunctionCallItem = (FunctionCallItem) object;
        FunctionCallItem.setName(IF_NULL);
        return FunctionCallItem;
    }
}
