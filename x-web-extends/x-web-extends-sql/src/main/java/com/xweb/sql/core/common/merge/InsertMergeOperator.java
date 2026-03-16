package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

@Data
public class InsertMergeOperator extends AbstractItem implements MergeOperator {

    private String insert;

    private String table;

    private List<Item> columnItems;

    private String values;

    private List<Item> valueItems;
}
