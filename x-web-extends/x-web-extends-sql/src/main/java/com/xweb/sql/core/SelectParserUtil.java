package com.xweb.sql.core;

import com.xweb.sql.core.select.AliasItem;
import com.xweb.sql.core.select.SelectItem;

public class SelectParserUtil {
    public static void setParentChild(Object currentParent, SelectItem selectItem) {
        if (currentParent instanceof AliasItem) {
            AliasItem aliasItem = (AliasItem) currentParent;
            aliasItem.setItem(selectItem);
        } else {
            throw new RuntimeException("unknown");
        }
    }
}
