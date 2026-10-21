package com.xweb.sql.planner.operator.calculator;

import com.xweb.sql.data.Row;

public class LogicBooleanCalculator implements BooleanCalculator {

    private BooleanCalculator leftBooleanCalculator;

    private Type type;

    private BooleanCalculator rightBooleanCalculator;

    public LogicBooleanCalculator(BooleanCalculator left, String op, BooleanCalculator right) {
        this.leftBooleanCalculator = left;
        this.type = getType(op);
        this.rightBooleanCalculator = right;
    }


    @Override
    public boolean compute(Row row) {
        if (Type.AND == type) {
            return leftBooleanCalculator.compute(row) && rightBooleanCalculator.compute(row);
        } else if (Type.OR == type) {
            return leftBooleanCalculator.compute(row) || rightBooleanCalculator.compute(row);
        }
        return false;
    }


    private Type getType(String op) {
        if ("and".equals(op) || "AND".equals(op)) {
            return Type.AND;
        } else if ("or".equals(op) || "OR".equals(op)) {
            return Type.OR;
        } else {
            return Type.NOT;
        }
    }

    public static enum Type {
        AND, OR, NOT;
    }
}
