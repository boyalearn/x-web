package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.AbstractItem;
import com.xweb.sql.core.common.Item;
import lombok.Data;

import java.util.List;

/**
 * * when matched --a,b表均匹配到做update
 * * then update set b.nme= b.nme
 * * when not matched–a表有 b表匹配不到做insert （也可以加上 by target）
 * * then insert(id,nme) values(a.id,a.nme)
 * * when not matched by source–a表没有做delete
 * * then delete ;
 */
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
