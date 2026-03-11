package com.xweb.sql.mysql;

import com.xweb.sql.core.base.item.FunctionItem;
import com.xweb.sql.core.convert.RewriteFilter;

public class NvlToIfNullFilter implements RewriteFilter {

    private final static String NVL = "NVL";

    private final static String IF_NULL = "ifnull";

    @Override
    public boolean support(Object object) {
        if (object instanceof FunctionItem) {
            FunctionItem functionItem = (FunctionItem) object;
            if (NVL.equalsIgnoreCase(functionItem.getName())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public Object change(Object object) {
        FunctionItem functionItem = (FunctionItem) object;
        functionItem.setName(IF_NULL);
        return functionItem;
    }
}
