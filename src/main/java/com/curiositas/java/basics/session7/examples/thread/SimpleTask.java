package com.curiositas.java.basics.session7.examples.thread;

import java.util.Random;

public class SimpleTask implements Runnable {
    private final Output output;

    public SimpleTask(Output output) {
        this.output = output;
    }

    @Override
    public void run() {
        output.write(Thread.currentThread().getName() + " IS WORKING");
    }
}
