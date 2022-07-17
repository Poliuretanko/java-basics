package com.curiositas.java.basics.session3.examples.polymorphism.formatters;

public class ReverseFormatter implements Formatter {
    @Override
    public String format(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
