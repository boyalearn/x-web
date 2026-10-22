package com.xweb.sql.planner.operator.calculator.util;

import java.math.BigDecimal;

public class ComputeUtil {
    public static boolean GT(Object data, Object value) {
        int c = compare(data, value);
        return c == 1;
    }

    public static boolean EGT(Object data, Object value) {
        int c = compare(data, value);
        return c == 1 || c == 0;
    }

    private static int compare(Object data, Object value) {
        if (data instanceof Number) {
            return new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString()));
        } else if (data instanceof String) {
            try {
                return new BigDecimal(data.toString()).compareTo(new BigDecimal(value.toString()));
            } catch (Exception e) {
                throw new RuntimeException();
            }
        } else {
            throw new RuntimeException();
        }
    }
}
