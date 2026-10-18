package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class ColumnValueExpressionCalculator implements BooleanCalculator{

    private ColumnValueExpression columnValueExpression;

    @Override
    public boolean compute(Row row) {
        return false;
    }
}
