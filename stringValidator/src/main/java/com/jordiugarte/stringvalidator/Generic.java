package com.jordiugarte.stringvalidator;

import android.webkit.URLUtil;

/**
 * Created by: jordiugarte on 08/08/21.
 * Website: https://github.com/jordiugarte
 * Email: jordi933@gmail.com
 */

public class Generic {

    public static boolean isNotEmpty(String s) {
        return !s.isEmpty() || s != null;
    }

    public static boolean isNumber(String s) {
        return s.matches("[0-9]+");
    }

    public static boolean isValidAmount(String s) {
        return isNotEmpty(s) && s.matches("^([1-9][0-9]*)$");
    }

    public static boolean isValidURL(String s) {
        return URLUtil.isValidUrl(s);
    }
}
