package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.Constant;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;
import java.util.Optional;

@AllArgsConstructor
public class ColumnValueExpressionCalculator implements BooleanCalculator {

    private static final String EQ = "=";

    private static final String NEQ = "!=";

    private ColumnValueExpression columnValueExpression;

    @Override
    public boolean compute(Row row) {
        Column column = columnValueExpression.getColumn();
        Slice slice = row.getSliceByColumnName(column.getTable().getName(), column.getName());

        switch (columnValueExpression.getOp()) {
            case EQ:
                return computeEqualExpression(slice);
            case NEQ:
                return !computeEqualExpression(slice);
            default:
                break;
        }
        return false;

    }

    private boolean computeEqualExpression(Slice slice) {
        final Object data = slice.getData();
        final Object value = computeValueExpression();
        if (data instanceof String) {
            return data.equals(value.toString());
        } else if (data instanceof Number) {
            if (value instanceof Number) {
                return new BigDecimal(data.toString()).equals(new BigDecimal(value.toString()));
            }
            return false;
        } else {
            throw new RuntimeException("");
        }
    }

    private Object computeValueExpression() {
        final Constant constant = this.columnValueExpression.getConstant();
        final Expression expression = this.columnValueExpression.getExpression();
        final Select select = this.columnValueExpression.getSelect();
        if (Optional.ofNullable(constant).isPresent()) {
            return constant.getData();
        } else if (Optional.ofNullable(expression).isPresent()) {
            throw new RuntimeException("value expression error.");

        } else if (Optional.ofNullable(select).isPresent()) {
            throw new RuntimeException("value expression error.");
        } else {
            throw new RuntimeException("value expression error.");
        }
    }


}
