package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;


@Data
public class UpdateMergeOperator extends AbstractItem implements MergeOperator{

    private String update;

    private String key;

    private String set;

    private List<Item> updateItems;
}
