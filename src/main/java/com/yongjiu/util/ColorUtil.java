package com.yongjiu.util;

/**
 * <strong>颜色工具类</strong><br>
 * <ul>
 * <li>颜色进制转换</li>
 * <li>颜色合法性校验</li>
 * </ul>
 * <br>
 * @author yongjiu
 * @version V1.0.0
 */
public class ColorUtil {

    /**
     *
     * @param hex 颜色十六进制
     * @return 颜色RGB
     */
    public static Integer[] hex2Rgb(String hex) {
        StringBuilder sb = new StringBuilder();
        if (hex == null) {
            return new Integer[]{255,255,255};
        }
        String c = hex.toUpperCase().replace( "#", "");

        Integer r = Integer.parseInt((c.length() == 3 ? c.substring(0, 1) + c.substring(0, 1) : c.substring(0, 2)), 16);
        Integer g = Integer.parseInt((c.length() == 3 ? c.substring(1, 2) + c.substring(1, 2) : c.substring(2, 4)), 16);
        Integer b = Integer.parseInt((c.length() == 3 ? c.substring(2, 3) + c.substring(2, 3) : c.substring(4, 6)), 16);

        sb.append("RGB(" + r + "," + g + "," + b + ")");

        return new Integer[]{r,g,b};
    }
}
