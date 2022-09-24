package com.curiositas.java.basics.session7.examples.thread;

public class ConsoleOutput implements Output{
    @Override
    public void write(String message) {
        System.out.println(message);
    }
}
