package com.xweb.sql.operator.calculator.util;

import java.math.BigDecimal;

public class CalculatorUtil {
    public static boolean GT(Object data, Object value) {
        if (data instanceof Number) {
            return new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString())) == 1;
        } else if (data instanceof String) {
            try {
                int c = new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString()));
                return c == 1;
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
        throw new RuntimeException();
    }

    public static boolean EGT(Object data, Object value) {
        if (data instanceof Number) {
            int c = new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString()));
            return c == 1 || c == 0;
        } else {
            try {
                int c = new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString()));
                return c == 1 || c == 0;
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}
