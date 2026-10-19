package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Merge;
import lombok.Data;

import java.util.List;


@Data
public class SimpleMerge extends AbstractItem implements Merge {

    private String merge;

    private String into;

    private Item table;

    private String using;

    private Item useTable;

    private String on;

    private BooleanExpression onConditionExpression;

    private List<WhenMatchedThenOperatorItem> whenThenItems;
}
