package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import lombok.Data;

@Data
public class WhenMatchedThenOperatorItem extends AbstractItem {

    private String when;

    private String not;

    private String matched;

    private String by;

    private String source;

    private String then;

    private MergeOperator operator;
}
