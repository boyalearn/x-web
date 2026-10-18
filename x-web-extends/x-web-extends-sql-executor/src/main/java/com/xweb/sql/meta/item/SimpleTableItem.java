package com.xweb.sql.meta.item;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SimpleTableItem extends AbstractItem implements TableItem {

    private String name;

    public SimpleTableItem(String name) {
        this.name = name;
    }

    public SimpleTableItem(String name, String alias) {
        this.name = name;
        super.setAlias(alias);
    }
}
