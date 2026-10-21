package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.TableAssociationNode;
import com.xweb.sql.meta.node.ColumnNode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TableAssociationExpressionCalculator implements BooleanCalculator {

    private TableAssociationNode tableAssociationExpression;

    @Override
    public boolean compute(Row row) {
        final ColumnNode left = tableAssociationExpression.getLeft();
        final ColumnNode right = tableAssociationExpression.getRight();
        final Slice leftSlice = row.getSliceByColumnName(left.getTable().getName(), left.getName());
        final Slice rightSlice = row.getSliceByColumnName(right.getTable().getName(), right.getName());

        if (tableAssociationExpression.getOp().equals("=")) {
            return leftSlice.getData().equals(rightSlice.getData());
        }
        return false;
    }
}
