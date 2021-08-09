package com.jordiugarte.stringvalidator;

import android.util.Patterns;

/**
 * Created by: jordiugarte on 08/08/21.
 * Website: https://github.com/jordiugarte
 * Email: jordi933@gmail.com
 */

public class User {

    public static boolean isNameValid(String s) {
        return Generic.isNotEmpty(s) && s.matches("[A-Za-zÁ-úñÑ]*");
    }

    public static boolean isNameValid(String s, int maxSize) {
        boolean valid = Generic.isNotEmpty(s);
        valid = valid && s.matches("[A-Za-zÁ-úñÑ]{" + maxSize + "}*");
        return valid;
    }

    public static boolean isNameValid(String s, int minSize, int maxSize) {
        boolean valid = Generic.isNotEmpty(s);
        valid = valid && s.matches("[A-Za-zÁ-úñÑ]{" + minSize + "," + maxSize + "}*");
        return valid;
    }

    public static boolean areNamesValid(String s) {
        return !s.isEmpty() && s.matches("[A-Za-zÁ-úñÑ]+[(| )[A-Za-zÁ-úñÑ]]*");
    }

    public static boolean areNamesValid(String s, int maxSize) {
        return !s.isEmpty() && s.matches("[A-Za-zÁ-úñÑ]{" + maxSize + "}+[(| )[A-Za-zÁ-úñÑ]{" + maxSize + "}]*");
    }

    public static boolean areNamesValid(String s, int minSize, int maxSize) {
        return !s.isEmpty() && s.matches("[A-Za-zÁ-úñÑ]{" + minSize + "," + maxSize + "}+[(| )[A-Za-zÁ-úñÑ]{" + minSize + "," + maxSize + "}]*");
    }

    public static boolean isValidEmail(String s) {
        return !s.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(s).matches();
    }

    public static boolean isValidEmail(String s, int minSize) {
        return !s.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(s).matches() && s.length() >= minSize;
    }

    public static boolean isValidEmail(String s, int minSize, int maxSize) {
        return !s.isEmpty() && Patterns.EMAIL_ADDRESS.matcher(s).matches() && s.length() >= minSize && s.length() <= maxSize;
    }

    public static boolean isValidUsername(String s) {
        return !s.isEmpty() && s.matches("[a-z0-9\\.\\_]");
    }

    public static boolean isValidUsername(String s, int maxSize) {
        return !s.isEmpty() && s.matches("[a-z0-9\\.\\_]{" + maxSize + "}");
    }

    public static boolean isValidUsername(String s, int minSize, int maxSize) {
        return !s.isEmpty() && s.matches("[a-z0-9\\.\\_]{" + minSize + "," + maxSize + "}");
    }

    public static boolean isValidPassword(String s) {
        return !s.isEmpty() && s.matches("[a-zA-Z0-9\\!\\@\\#\\$\\_]");
    }

    public static boolean isValidPassword(String s, int maxSize) {
        return !s.isEmpty() && s.matches("[a-zA-Z0-9\\!\\@\\#\\$\\_]{" + maxSize + "}");
    }

    public static boolean isValidPassword(String s, int minSize, int maxSize) {
        return !s.isEmpty() && s.matches("[a-zA-Z0-9\\!\\@\\#\\$\\_]{" + minSize + "," + maxSize + "}");
    }
}
