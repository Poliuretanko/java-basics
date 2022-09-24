package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public abstract class Resource {
    protected void acquire() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
