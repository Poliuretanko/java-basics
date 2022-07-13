package com.curiositas.java.basics.session2.examples.encapsulation;

public class OutputToConsole implements Output {
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
