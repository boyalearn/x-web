package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.merge.DeleteMergeOperator;

public class DeleteMergeOperatorVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        DeleteMergeOperator deleteMergeOperator=(DeleteMergeOperator)item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.SPACE);
        sql.append(deleteMergeOperator.getDelete());
        return sql.toString();
    }
}
