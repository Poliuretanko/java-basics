package com.curiositas.java.basics.session8.examples.counter;


public class MyInteger {
    private int value = 0;

    public void increment() {
        value++;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
