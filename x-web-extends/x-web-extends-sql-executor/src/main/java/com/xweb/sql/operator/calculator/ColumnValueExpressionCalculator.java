package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.Node;
import com.xweb.sql.meta.Select;
import com.xweb.sql.meta.expression.BetweenAndNode;
import com.xweb.sql.meta.expression.ColumnValueNode;
import com.xweb.sql.meta.node.ColumnNode;
import com.xweb.sql.meta.node.ConstantNode;
import com.xweb.sql.operator.calculator.util.CalculatorUtil;
import lombok.AllArgsConstructor;

import java.math.BigDecimal;

@AllArgsConstructor
public class ColumnValueExpressionCalculator implements BooleanCalculator {

    private static final String EQ = "=";

    private static final String NEQ = "!=";

    private ColumnValueNode columnValueNode;

    @Override
    public boolean compute(Row row) {
        ColumnNode column = columnValueNode.getColumn();
        Slice slice = row.getSliceByColumnName(column.getTable().getName(), column.getName());

        switch (columnValueNode.getOp()) {
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
        if (value instanceof BetweenAndNode) {
            return computeValueExpressionEqualExpression(data, (BetweenAndNode) value);
        } else if (value instanceof Select) {
            throw new RuntimeException();
        } else {
            return computeValueConstantEqualExpression(data, value);
        }

    }

    private boolean computeValueExpressionEqualExpression(Object data, BetweenAndNode expression) {
        String lowerOp = expression.getLowerOp();
        String upperOp = expression.getUpperOp();
        Node lower = expression.getLower();
        Node upper = expression.getUpper();

        if (!(lower instanceof ConstantNode && upper instanceof ConstantNode)) {
            throw new RuntimeException();
        }
        if (lowerOp.equals(">=")) {
            if (!CalculatorUtil.EGT(data, ((ConstantNode) lower).getData())) {
                return false;
            }
        } else {
            if (!CalculatorUtil.GT(data, ((ConstantNode) lower).getData())) {
                return false;
            }
        }

        if (upperOp.equals("<=")) {
            if (CalculatorUtil.GT(data, ((ConstantNode) upper).getData())) {
                return false;
            }
        } else {
            if (CalculatorUtil.EGT(data, ((ConstantNode) upper).getData())) {
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
        final Node value = this.columnValueNode.getValue();
        if (value instanceof ConstantNode) {
            return ((ConstantNode)value).getData();
        } else {
            return value;
        }
    }


}
