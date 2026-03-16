package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import lombok.Data;

@Data
public class DeleteMergeOperator extends AbstractItem implements MergeOperator{

    private String delete;
}
