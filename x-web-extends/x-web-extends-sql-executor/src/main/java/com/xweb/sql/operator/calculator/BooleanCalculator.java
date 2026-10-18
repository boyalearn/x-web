package com.xweb.sql.operator.calculator;

import com.xweb.sql.data.Row;

public interface BooleanCalculator extends Calculator{

    boolean compute(Row row);
}
