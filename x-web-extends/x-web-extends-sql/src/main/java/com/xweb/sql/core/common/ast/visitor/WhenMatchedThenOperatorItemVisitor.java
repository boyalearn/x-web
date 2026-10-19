package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.merge.WhenMatchedThenOperatorItem;

public class WhenMatchedThenOperatorItemVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        WhenMatchedThenOperatorItem whenMatchedThenOperatorItem =(WhenMatchedThenOperatorItem)item;
        StringBuffer sql = new StringBuffer();
        sql.append(whenMatchedThenOperatorItem.getWhen());
        if (AstUtil.isNotEmpty(whenMatchedThenOperatorItem.getNot())) {
            sql.append(AstUtil.SPACE);
            sql.append(whenMatchedThenOperatorItem.getNot());
        }
        sql.append(AstUtil.SPACE);
        sql.append(whenMatchedThenOperatorItem.getMatched());
        if (AstUtil.isNotEmpty(whenMatchedThenOperatorItem.getBy())) {
            sql.append(AstUtil.SPACE);
            sql.append(whenMatchedThenOperatorItem.getBy());
        }
        if (AstUtil.isNotEmpty(whenMatchedThenOperatorItem.getSource())) {
            sql.append(AstUtil.SPACE);
            sql.append(whenMatchedThenOperatorItem.getSource());
        }
        sql.append(AstUtil.SPACE);
        sql.append(whenMatchedThenOperatorItem.getThen());
        sql.append(AstUtil.toSql(whenMatchedThenOperatorItem.getOperator()));
        return sql.toString();
    }
}
