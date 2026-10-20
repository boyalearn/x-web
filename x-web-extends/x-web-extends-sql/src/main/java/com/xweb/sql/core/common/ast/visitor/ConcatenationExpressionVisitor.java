package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.ConcatenationExpression;

public class ConcatenationExpressionVisitor implements AstVisitor {
    @Override
    public String visitor(Item item) {
        ConcatenationExpression concatenationExpression = (ConcatenationExpression) item;
        StringBuffer sql = new StringBuffer();
        sql.append(AstUtil.toSql(concatenationExpression.getLeft()));
        sql.append(AstUtil.SPACE);
        sql.append(concatenationExpression.getConcatenationOperator());
        sql.append(AstUtil.SPACE);
        sql.append(AstUtil.toSql(concatenationExpression.getRight()));
        sql.append(AstUtil.toStringCommon(concatenationExpression));
        return sql.toString();
    }
}
