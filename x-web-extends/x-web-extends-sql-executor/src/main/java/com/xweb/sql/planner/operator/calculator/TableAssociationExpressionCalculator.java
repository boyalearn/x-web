package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.TableAssociationNode;
import com.xweb.sql.meta.node.ColumnNode;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TableAssociationExpressionCalculator implements BooleanCalculator {

    private TableAssociationNode tableAssociationNode;

    @Override
    public boolean compute(Row row) {
        final ColumnNode left = tableAssociationNode.getLeft();
        final ColumnNode right = tableAssociationNode.getRight();
        final Slice leftSlice = row.getSliceByColumnName(left.getTable().getName(), left.getName());
        final Slice rightSlice = row.getSliceByColumnName(right.getTable().getName(), right.getName());

        if (tableAssociationNode.getOp().equals("=")) {
            return leftSlice.getData().equals(rightSlice.getData());
        }
        return false;
    }
}
