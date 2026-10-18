package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.BooleanExpression;
import com.xweb.sql.meta.expression.ColumnValueExpression;
import com.xweb.sql.meta.expression.ComplexBoolExpression;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.Column;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FilterOperator implements SqlOperator {
    private SqlOperator operator;
    private BooleanExpression booleanExpression;

    private List<ColumnValueExpression> columnValueExpressions;


    public FilterOperator(SqlOperator operator, BooleanExpression booleanExpression) {
        this.operator = operator;
        this.booleanExpression = booleanExpression;
        this.columnValueExpressions = new ArrayList<>();
        this.initBooleanExpression(this.booleanExpression);
    }

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page result = new Page();
        Page next = operator.next();
        if (!next.isEmpty()) {
            List<Row> rows = next.getRows();
            for (Row row : rows) {
                if (isMatch(row)) {
                    result.addRow(row);
                }
            }
        }
        return result;
    }

    @Override
    public void close() {

    }

    private Boolean isMatch(Row row) {
        if (this.columnValueExpressions.isEmpty()) {
            return true;
        }
        for (ColumnValueExpression columnValueExpression : this.columnValueExpressions) {
            if (columnValueExpression.getOp().equals("=")) {
                Column column = columnValueExpression.getColumn();
                Slice slice = row.getSliceByColumnName(column.getTable().getName(), column.getName());
                if (Optional.ofNullable(columnValueExpression.getConstant()).isPresent()) {
                    if (!slice.getData().equals(columnValueExpression.getConstant().getData())) {
                        return false;
                    }
                } else if (Optional.ofNullable(columnValueExpression.getExpression()).isPresent()) {
                    throw new RuntimeException();

                } else {
                    throw new RuntimeException();

                }

            }
        }
        return true;
    }

    private void initBooleanExpression(BooleanExpression expression) {
        if (expression instanceof ColumnValueExpression) {
            ColumnValueExpression columnValueExpression = (ColumnValueExpression) expression;
            this.columnValueExpressions.add(columnValueExpression);
        } else if (expression instanceof ComplexBoolExpression) {
            ComplexBoolExpression complexBoolExpression = (ComplexBoolExpression) booleanExpression;
            BooleanExpression left = complexBoolExpression.getLeft();
            BooleanExpression right = complexBoolExpression.getRight();

            if (complexBoolExpression.getLogic().equals("and")) {
                initBooleanExpression(left);
                initBooleanExpression(right);
            }
        }else if(expression instanceof TableAssociationExpression){
            return ;
        } else {
            throw new RuntimeException();
        }
    }


}
