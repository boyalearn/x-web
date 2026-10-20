package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.Expression;
import com.xweb.sql.meta.Item;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.expression.BetweenExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.item.Column;
import com.xweb.sql.meta.item.Constant;
import com.xweb.sql.operator.calculator.util.CalculatorUtil;
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
        if (value instanceof BetweenExpression) {
            return computeValueExpressionEqualExpression(data, (BetweenExpression) value);
        } else if (value instanceof Select) {
            throw new RuntimeException();
        } else {
            return computeValueConstantEqualExpression(data, value);
        }

    }

    private boolean computeValueExpressionEqualExpression(Object data, BetweenExpression expression) {
        String lowerOp = expression.getLowerOp();
        String upperOp = expression.getUpperOp();
        Node lower = expression.getLower();
        Node upper = expression.getUpper();

        if (!(lower instanceof Constant && upper instanceof Constant)) {
            throw new RuntimeException();
        }
        if (lowerOp.equals(">=")) {
            if (!CalculatorUtil.EGT(data, ((Constant) lower).getData())) {
                return false;
            }
        } else {
            if (!CalculatorUtil.GT(data, ((Constant) lower).getData())) {
                return false;
            }
        }

        if (upperOp.equals("<=")) {
            if (CalculatorUtil.GT(data, ((Constant) upper).getData())) {
                return false;
            }
        } else {
            if (CalculatorUtil.EGT(data, ((Constant) upper).getData())) {
                return false;
            }
        }

        return true;

    }

    private boolean computeValueConstantEqualExpression(Object data, Object value) {
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
            return expression;
        } else if (Optional.ofNullable(select).isPresent()) {
            throw new RuntimeException("value expression error.");
        } else {
            throw new RuntimeException("value expression error.");
        }
    }


}
