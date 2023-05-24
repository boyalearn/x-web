package com.xweb.common.utils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class StringUtils {

    private static Pattern NUMBER_PATTERN = Pattern.compile("[0-9]*");


    public static final boolean isNumber(String number) {
        if (null == number || number.isEmpty()) {
            return false;
        }
        Matcher isNum = NUMBER_PATTERN.matcher(number);
        if (isNum.matches()) {
            return true;
        }
        return false;
    }

    public static final boolean isEmpty(String str) {
        return str == null ? true : str.isEmpty();
    }

    public static final boolean isNotEmpty(String str) {
        return !isEmpty(str);
    }
}
