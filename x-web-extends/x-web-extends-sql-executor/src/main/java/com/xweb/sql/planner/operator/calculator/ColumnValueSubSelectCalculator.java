package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.ColumnValueNode;
import com.xweb.sql.planner.operator.SqlOperator;

import java.util.List;

public class ColumnValueSubSelectCalculator extends ColumnValueExpressionCalculator {

    private SqlOperator operator;

    public ColumnValueSubSelectCalculator(ColumnValueNode columnValueNode) {
        super(columnValueNode);
    }


    public ColumnValueSubSelectCalculator(ColumnValueNode columnValueNode, SqlOperator operator) {
        super(columnValueNode);
        this.operator = operator;
    }


    @Override
    protected boolean computeEqualExpression(Slice slice) {
        final Object data = slice.getData();
        final Object value = computeValueExpression();
        return computeValueConstantEqualExpression(data, value);
    }


    @Override
    protected Object computeValueExpression() {
        Page result = new Page();
        this.operator.open();
        Page value = this.operator.next();
        while (!value.isEmpty()) {
            result.addRows(value.getRows());
            value = this.operator.next();
        }
        if (result.isEmpty()) {
            return null;
        } else if (result.getRows().size() > 1) {
            throw new RuntimeException();
        } else {
            List<Slice> slices = result.getRows().get(0).getSlices();
            if (slices.size() != 1) {
                throw new RuntimeException();
            }
            return slices.get(0).getData();
        }
    }


}
