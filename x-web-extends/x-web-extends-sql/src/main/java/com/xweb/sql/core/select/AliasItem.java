package com.xweb.sql.core.select;

import lombok.Data;

@Data
public class AliasItem implements SelectItem {

    private String as;

    private SelectItem item;

    private String alias;

    public String toString() {
        return item.toString() + ((null == as) ? " " : " " + as + " ") + alias;
    }
}
