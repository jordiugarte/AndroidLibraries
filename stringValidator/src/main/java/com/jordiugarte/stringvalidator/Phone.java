package com.jordiugarte.stringvalidator;

/**
 * Created by: jordiugarte on 08/08/21.
 * Website: https://github.com/jordiugarte
 * Email: jordi933@gmail.com
 */

public class Phone {

    public static boolean isValidPhoneNumberWithDialCode(String s) {
        return !s.isEmpty() && s.matches("[+][[0-9]+][0-9]+");
    }

    public static boolean isValidPhoneNumberWithDialCode(String s, int maxSize) {
        return !s.isEmpty() && s.matches("[+][[0-9]+]{" + maxSize + "}[0-9]+");
    }

    public static boolean isValidPhoneNumberWithDialCode(String s, int minSize, int maxSize) {
        return !s.isEmpty() && s.matches("[+][[0-9]+]{" + minSize + "," + maxSize + "}[0-9]+");
    }

    public static boolean isValidPhoneNumber(String s) {
        return !s.isEmpty() && s.matches("[0-9]+");
    }

    public static boolean isValidPhoneNumber(String s, int maxSize) {
        return !s.isEmpty() && s.matches("[0-9]{" + maxSize + "}+");
    }

    public static boolean isValidPhoneNumber(String s, int minSize, int maxSize) {
        return !s.isEmpty() && s.matches("[0-9]{" + minSize + ", " + maxSize + "}+");
    }
}
