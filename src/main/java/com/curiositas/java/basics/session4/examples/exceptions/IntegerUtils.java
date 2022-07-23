package com.curiositas.java.basics.session4.examples.exceptions;

import java.util.regex.Pattern;

public class IntegerUtils {

    private static Pattern numberPattern = Pattern.compile("\\d+");

    public static Integer parseWithoutCheckingInput(String number) {
        return parse(number);
    }

    public static Integer parseWithCheckingInput(String number) {
        if (numberPattern.matcher(number).matches()) {
            return parse(number);
        }
        throw new IllegalArgumentException("The provided value is not a number. Value: " + number);
    }

    private static Integer parse(String number) {
        return Integer.parseInt(number);
    }
}
