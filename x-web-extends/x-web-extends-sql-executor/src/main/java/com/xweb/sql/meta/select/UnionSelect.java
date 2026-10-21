package com.xweb.sql.meta.select;


import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.common.AbstractNode;
import lombok.Data;

@Data
public class UnionSelect extends AbstractNode implements Select {
    private Select select;

    private String unionAll;

    private Select unionSelect;
}
