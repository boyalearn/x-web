package com.xweb.sql.operator;

import com.xweb.sql.data.Page;
import com.xweb.sql.data.Row;
import com.xweb.sql.operator.calculator.BooleanCalculator;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class FilterOperator implements SqlOperator {
    private SqlOperator operator;

    private BooleanCalculator booleanCalculator;


    public FilterOperator(SqlOperator operator) {
        this.operator = operator;
    }

    @Override
    public void open() {

    }

    @Override
    public Page next() {
        Page result = new Page();
        Page next = operator.next();
        while (result.isEmpty() && !next.isEmpty()) {
            List<Row> rows = next.getRows();
            for (Row row : rows) {
                if (booleanCalculator.compute(row)) {
                    result.addRow(row);
                }
            }
            next = operator.next();
        }
        return result;
    }

    @Override
    public void close() {

    }


}
