package com.lz.util;

import org.apache.commons.lang3.StringUtils;

/**
 * Created by Maven on 2017/9/26.
 */
public class Strings {
    public static String lowerFirst(String str) {
        if (StringUtils.isBlank(str)) {
            return "";
        } else {
            return str.substring(0, 1).toLowerCase() + str.substring(1);
        }
    }

}
