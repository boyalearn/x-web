package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.operator.calculator.BooleanCalculator;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class JoinTableOperator extends AbstractOperator {

    private SqlOperator leftOperator;

    private SqlOperator rightOperator;

    private JoinType joinType;

    private BooleanCalculator booleanCalculator;

    public JoinTableOperator(SqlOperator left,SqlOperator right,JoinType type){
        this.leftOperator = left;
        this.rightOperator = right;
        this.joinType = type;
    }

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page page = new Page();
        if (joinType == JoinType.LEFT) {

        } else if (joinType == JoinType.INNER) {
            return innerJoin();
        }

        return page;
    }

    private Page innerJoin(){
        Page page = new Page();
        Page mainPage = leftOperator.next();
        if (mainPage.isEmpty()) {
            return page;
        }
        while (page.isEmpty()&&!mainPage.isEmpty()) {
            final List<Row> rows = mainPage.getRows();
            for (Row row : rows) {
                rightOperator.open();
                Page rightPage = rightOperator.next();
                if (rightPage.isEmpty()) {
                    continue;
                }
                while (!rightPage.isEmpty()) {
                    final List<Row> rightRows = rightPage.getRows();
                    for (Row rightRow : rightRows) {
                        Row matchRow = new Row();
                        matchRow.addSlices(row.getSlices());
                        matchRow.addSlices(rightRow.getSlices());
                        if (booleanCalculator.compute(matchRow)) {
                            page.addRow(matchRow);
                        }
                    }
                    rightPage = rightOperator.next();
                }
            }
            if(page.isEmpty()){
                mainPage = leftOperator.next();
            }
        }
        return page;
    }


    @Override
    public void close() {

    }

    public static enum JoinType {
        LEFT, RIGHT, OUTER, INNER;
    }
}
