package com.earth.uitl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zouhuixing
 * @date 2024/8/21
 */
public class MathUtil {

    public static String binAdd(String bin, int num) {
        Integer source = Integer.valueOf(bin, 2);
        if (source == 0) {
            return bin;
        }
        String temp = Integer.toBinaryString(source + num);
        int zeroLen = bin.length() - temp.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < zeroLen; i++) {
            result.append(0);
        }
        result.append(temp);
        return result.toString();
    }

    public static String binToHex(String bin) {
        Long decimal = Long.parseUnsignedLong(bin, 2);
        String temp = Long.toHexString(decimal);
        int zeroLen = bin.length() / 4 - temp.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < zeroLen; i++) {
            result.append(0);
        }
        result.append(temp);
        return result.toString();
    }

    public static String hexToBin(String hex) {
        Long decimal = Long.parseUnsignedLong(hex, 16);
        String temp = Long.toBinaryString(decimal);
        int zeroLen = hex.length() * 4 - temp.length();
        StringBuffer result = new StringBuffer();
        for (int i = 0; i < zeroLen; i++) {
            result.append(0);
        }
        result.append(temp);
        return result.toString();
    }

    public static String[] differenceSet(String[] all, String[] sub) {
        List<String> result = new ArrayList<String>();
        List<String> subList = Arrays.asList(sub);
        for (int i = 0; i < all.length; i++) {
            if (!subList.contains(all[i])) {
                result.add(all[i]);
            }
        }
        return result.toArray(new String[0]);
    }
}
