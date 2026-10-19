package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.Column;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TableAssociationExpressionCalculator implements BooleanCalculator{

    private TableAssociationExpression tableAssociationExpression;

    @Override
    public boolean compute(Row row) {
        final Column left = tableAssociationExpression.getLeft();
        final Column right = tableAssociationExpression.getRight();
        final Slice leftSlice = row.getSliceByColumnName(left.getTable().getName(), left.getName());
        final Slice rightSlice = row.getSliceByColumnName(right.getTable().getName(), right.getName());

        if(tableAssociationExpression.getOp().equals("=")){
            return leftSlice.getData().equals(rightSlice.getData());
        }
        return false;
    }
}
