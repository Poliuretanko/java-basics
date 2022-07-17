package com.curiositas.java.basics.session3.examples.encapsulation;

public class OutputToConsole implements Output {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
