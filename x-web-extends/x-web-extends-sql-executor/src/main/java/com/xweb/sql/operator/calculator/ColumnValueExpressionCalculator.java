package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.item.Column;
import lombok.AllArgsConstructor;

import java.util.Optional;

@AllArgsConstructor
public class ColumnValueExpressionCalculator implements BooleanCalculator{

    private ColumnValueExpression columnValueExpression;

    @Override
    public boolean compute(Row row) {
        if (columnValueExpression.getOp().equals("=")) {
            Column column = columnValueExpression.getColumn();
            Slice slice = row.getSliceByColumnName(column.getTable().getName(), column.getName());
            if (Optional.ofNullable(columnValueExpression.getConstant()).isPresent()) {
                if (slice.getData().equals(columnValueExpression.getConstant().getData())) {
                    return true;
                }
            } else if (Optional.ofNullable(columnValueExpression.getExpression()).isPresent()) {
                throw new RuntimeException();

            } else {
                throw new RuntimeException();
            }

        }
        return false;
    }


}
