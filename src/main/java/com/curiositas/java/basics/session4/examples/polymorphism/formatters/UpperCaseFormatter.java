package com.curiositas.java.basics.session4.examples.polymorphism.formatters;

public class UpperCaseFormatter implements Formatter {

    @Override
    public String format(String text) {
        return text.toUpperCase();
    }
}
