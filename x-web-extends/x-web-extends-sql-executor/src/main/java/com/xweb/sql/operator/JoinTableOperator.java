package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.data.Slice;
import com.xweb.sql.meta.expression.TableAssociationExpression;
import com.xweb.sql.meta.item.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@Getter
@Setter
public class JoinTableOperator extends AbstractOperator {

    private SqlOperator leftOperator;

    private SqlOperator rightOperator;

    private JoinType joinType;

    private List<TableAssociationExpression> tableAssociations;

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page page = new Page();
        if (joinType == JoinType.LEFT_JOIN) {

        } else if (joinType == JoinType.INNER_JOIN) {
            final Page leftPage = leftOperator.next();
            if (leftPage.isEmpty()) {
                return page;
            }
            final List<Row> rows = leftPage.getRows();
            for (Row row : rows) {
                rightOperator.open();
                Page rightPage = rightOperator.next();
                if (rightPage.isEmpty()) {
                    return page;
                }
                while (!rightPage.isEmpty()) {
                    final List<Row> rightRows = rightPage.getRows();
                    for (Row rightRow : rightRows) {
                        if (isMatch(row, rightRow)) {
                            Row matchRow = new Row();
                            matchRow.addSlices(row.getSlices());
                            matchRow.addSlices(rightRow.getSlices());
                            page.addRow(matchRow);
                        }
                    }
                    rightPage = rightOperator.next();
                }
            }


        }

        return page;
    }

    private boolean isMatch(Row left, Row right) {
        boolean match = true;
        for (TableAssociationExpression tableAssociation : tableAssociations) {
            Column first = tableAssociation.getLeft();
            Column second = tableAssociation.getRight();
            Slice firstSlice = left.getSliceByColumnName(first.getTable().getName(), first.getName());
            Slice secondSlice = right.getSliceByColumnName(second.getTable().getName(), second.getName());
            if (tableAssociation.getOp().equals("=")) {
                if (!firstSlice.getData().equals(secondSlice.getData())) {
                    return false;
                }
            } else {
                throw new RuntimeException("未实现");
            }

        }
        return match;
    }

    @Override
    public void close() {

    }

    public static enum JoinType {
        LEFT_JOIN, RIGHT_JOIN, OUTER_JOIN, INNER_JOIN;
    }
}
