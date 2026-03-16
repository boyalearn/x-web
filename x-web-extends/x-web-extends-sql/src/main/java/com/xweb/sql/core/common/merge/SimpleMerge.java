package com.xweb.sql.core.common.merge;

import com.xweb.sql.core.common.BooleanExpression;
import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.Merge;
import lombok.Data;

import java.util.List;

/**
 * merge into tableb b --被操作表
 * using (select * from a) a–参照表 支持子查询
 * on a.id=b.id–关联关系
 * when matched --a,b表均匹配到做update
 * then update set b.nme= b.nme
 * when not matched–a表有 b表匹配不到做insert （也可以加上 by target）
 * then insert(id,nme) values(a.id,a.nme)
 * when not matched by source–a表没有做delete
 * then delete ;
 */
@Data
public class SimpleMerge implements Merge {

    private String merge;

    private String into;

    private Item table;

    private String using;

    private Item useTable;

    private String on;

    private BooleanExpression onConditionExpression;

    private List<WhenMatchedThenOperatorItem> whenThenItems;
}
