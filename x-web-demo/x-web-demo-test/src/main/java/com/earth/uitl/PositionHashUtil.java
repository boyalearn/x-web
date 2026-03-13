package com.earth.uitl;

/**
 * @author zouhuixing
 * @date 2024/8/21
 */
public class PositionHashUtil {
    private static Double WIDTH = 40000 * 1000D;
    private static Double LONG = 40000 * 1000D;
    private static Double HEIGHT = 900D;

    public static Integer HASH_LEN = 16;

    public static String positionHashCode(double x, double y, int len) {
        StringBuffer result = new StringBuffer();
        getByte(x, y, result, 0D, WIDTH, 0, LONG, len);
        return MathUtil.binToHex(result.toString());
    }

    private static void getByte(double x, double y, StringBuffer result, double xMin, double xMax, double yMin, double yMax, int len) {
        if (len > 0) {
            boolean xNext = false;
            boolean yNext = false;
            if (x >= (xMin + xMax) / 2) {
                xNext = true;
                result.append("1");
            } else {
                result.append("0");
            }
            if (y >= (yMin + yMax) / 2) {
                yNext = true;
                result.append("1");
            } else {
                result.append("0");
            }
            if (xNext) {
                xMin = (xMin + xMax) / 2;
            } else {
                xMax = (xMin + xMax) / 2;
            }
            if (yNext) {
                yMin = (yMin + yMax) / 2;
            } else {
                yMax = (yMin + yMax) / 2;
            }
            getByte(x, y, result, xMin, xMax, yMin, yMax, len - 1);
        }
    }


    public static String[] getNeighbor(String code) {
        int len = code.length();
        StringBuffer xBuffer = new StringBuffer();
        StringBuffer yBuffer = new StringBuffer();

        for (int i = 0; i < len; i += 2) {
            xBuffer.append(code.charAt(i));
            yBuffer.append(code.charAt(i + 1));
        }
        String x = xBuffer.toString();
        String y = yBuffer.toString();
        String xSub = MathUtil.binAdd(x, -1);
        String xAdd = MathUtil.binAdd(x, 1);

        String ySub = MathUtil.binAdd(y, -1);
        String yAdd = MathUtil.binAdd(y, 1);
        String[] result = new String[9];
        result[0] = MathUtil.binToHex(combine(xSub, ySub));
        result[1] = MathUtil.binToHex(combine(xSub, y));
        result[2] = MathUtil.binToHex(combine(xSub, yAdd));
        result[3] = MathUtil.binToHex(combine(x, ySub));
        result[4] = MathUtil.binToHex(combine(x, yAdd));
        result[5] = MathUtil.binToHex(combine(xAdd, ySub));
        result[6] = MathUtil.binToHex(combine(xAdd, y));
        result[7] = MathUtil.binToHex(combine(xAdd, yAdd));
        result[8] = MathUtil.binToHex(code);
        return result;
    }

    private static String combine(String x, String y) {
        StringBuffer result = new StringBuffer();
        int length = x.length();
        for (int i = 0; i < length; i++) {
            result.append(x.charAt(i));
            result.append(y.charAt(i));
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String bin = positionHashCode(213842.02125550358, 200079.8911758954, 20);
        System.out.println(bin);
        bin = positionHashCode(200000.02125550358, 200079.8911758954, 20);
        System.out.println(bin);
    }
}
