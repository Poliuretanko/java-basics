package com.curiositas.java.basics.session5.examples.tests;

public class Output {
    public static Output getInstance() {
        return new Output();
    }

    public void write(String message) {
        System.out.println(message);
    }
}
