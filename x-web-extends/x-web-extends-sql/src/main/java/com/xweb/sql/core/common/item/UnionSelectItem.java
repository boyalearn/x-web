package com.xweb.sql.core.common.item;


import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.Data;

@Data
public class UnionSelectItem extends AbstractItem {

    private String union;

    private String all;

    private Item select;
}
