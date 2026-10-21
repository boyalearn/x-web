package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.data.Row;

public class TrueBooleanCalculator implements BooleanCalculator {
    @Override
    public boolean compute(Row row) {
        return Boolean.TRUE;
    }
}
