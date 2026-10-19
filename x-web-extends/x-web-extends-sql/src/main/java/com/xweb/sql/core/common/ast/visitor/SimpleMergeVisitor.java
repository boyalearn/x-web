package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.merge.SimpleMerge;
import com.xweb.sql.core.common.merge.WhenMatchedThenOperatorItem;

import java.util.List;

public class SimpleMergeVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        SimpleMerge simpleMerge = (SimpleMerge)item;
        StringBuffer sql = new StringBuffer();
        sql.append(simpleMerge.getMerge());
        sql.append(AstUtil.SPACE);
        sql.append(simpleMerge.getInto());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(simpleMerge.getTable()));
        sql.append(AstUtil.SPACE);
        sql.append(simpleMerge.getUsing());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(simpleMerge.getUseTable()));
        sql.append(AstUtil.SPACE);
        sql.append(simpleMerge.getOn());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(simpleMerge.getOnConditionExpression()));
        final List<WhenMatchedThenOperatorItem> whenThenItems = simpleMerge.getWhenThenItems();
        for (WhenMatchedThenOperatorItem whenThenItem : whenThenItems) {
            sql.append(AstUtil.SPACE);
            sql.append(AstUtil.toSql(whenThenItem));
        }
        return sql.toString();
    }
}
