package com.curiositas.java.basics.session9.examples.tasks;

public abstract class Task implements Runnable {
    protected void doSomeJob() {
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
