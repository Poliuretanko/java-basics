package com.curiositas.java.basics.session4.examples.polymorphism.formatters;

import static java.lang.Math.min;

public class CuttingFormatter implements Formatter {

    private final int maximumLength;
    private final String replacement;

    public CuttingFormatter(int maximumLength, String replacement) {
        this.maximumLength = maximumLength;
        this.replacement = replacement;
    }

    @Override
    public String format(String text) {
        if (text.length() > maximumLength) {
            return text.substring(0, maximumLength - 1).trim() + replacement;
        }
        return text;
    }
}
