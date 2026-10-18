package com.xweb.sql.meta;


import com.xweb.sql.meta.item.AbstractItem;
import lombok.Data;

@Data
public class UnionSelect extends AbstractItem implements Select{
    private Select select;

    private String unionAll;

    private Select unionSelect;
}
