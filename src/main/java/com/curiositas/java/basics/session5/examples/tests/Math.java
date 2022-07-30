package com.curiositas.java.basics.session5.examples.tests;

public class Math {
    public int sum(int x, int y) {
        return x + y;
    }

    public int brokenSum(int x, int y) {
        return x - y;
    }

    public int division(int x, int y) {
        if (y == 0) {
            throw new IllegalArgumentException("Divider can't be 0");
        }
        return x/y;
    }

}
