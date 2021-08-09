package com.jordiugarte.stringvalidator;

/**
 * Created by: jordiugarte on 08/08/21.
 * Website: https://github.com/jordiugarte
 * Email: jordi933@gmail.com
 */

public class Address {

    public static boolean isValidPostalCode(String s) {
        return Generic.isNotEmpty(s) && s.length() > 4;
    }
}
