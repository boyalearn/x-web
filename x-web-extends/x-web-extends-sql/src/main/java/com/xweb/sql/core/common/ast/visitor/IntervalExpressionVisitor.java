package com.xweb.sql.core.common.ast.visitor;

import com.xweb.sql.core.common.Item;
import com.xweb.sql.core.common.ast.AstUtil;
import com.xweb.sql.core.common.expression.IntervalExpression;

import java.util.Optional;

public class IntervalExpressionVisitor implements AstVisitor{
    @Override
    public String visitor(Item item) {
        IntervalExpression intervalExpression= (IntervalExpression)item;
        StringBuffer sql = new StringBuffer();
        if (Optional.ofNullable(intervalExpression.getLeft()).isPresent()) {
            sql.append(AstUtil.toSql(intervalExpression.getLeft()));
            sql.append(AstUtil.SPACE);
        }
        if(AstUtil.isNotEmpty(intervalExpression.getOperator())){
            sql.append(intervalExpression.getOperator());
            sql.append(AstUtil.SPACE);
        }
        sql.append(intervalExpression.getInterval());
        if (AstUtil.isNotEmpty(intervalExpression.getSign())) {
            sql.append(intervalExpression.getSign());
        }
        if (AstUtil.isNotEmpty(intervalExpression.getStringIntervalField())) {
            sql.append(AstUtil.SPACE);
            sql.append(intervalExpression.getStringIntervalField());
        }
        if (AstUtil.isNotEmpty(intervalExpression.getNumber())) {
            sql.append(AstUtil.SPACE);
            sql.append(intervalExpression.getNumber());
        }
        if (AstUtil.isNotEmpty(intervalExpression.getIntervalField())) {
            sql.append(AstUtil.SPACE);
            sql.append(intervalExpression.getIntervalField());
        }
        sql.append(AstUtil.toStringCommon(intervalExpression));
        return sql.toString();
    }
}
