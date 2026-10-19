package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PriorityBooleanExpressionCalculator implements BooleanCalculator{

    private BooleanCalculator calculator;

    @Override
    public boolean compute(Row row) {
        return calculator.compute(row);
    }
}
