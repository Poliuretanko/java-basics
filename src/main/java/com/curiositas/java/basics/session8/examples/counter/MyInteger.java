package com.curiositas.java.basics.session8.examples.counter;

import org.openjdk.jol.vm.VM;

public class MyInteger {
    private int value = 0;
    private String someString = "some";

    public void increment() {
        value++;
    }

    @Override
    public String toString() {
        return String.valueOf(value) + " @" + VM.current().addressOf(value) + "//// " + someString + " @" + VM.current().addressOf(someString);
    }
}
