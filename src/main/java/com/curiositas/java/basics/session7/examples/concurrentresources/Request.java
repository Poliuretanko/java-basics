package com.curiositas.java.basics.session7.examples.concurrentresources;

import org.jetbrains.annotations.NotNull;

public class Request implements Comparable {
    private final int number;

    public Request(int number) {
        this.number = number;
    }

    public void execute() {
        String threadName = Thread.currentThread().getName();
        System.out.println(threadName + " executed task #" + number);
    }

    @Override
    public int compareTo(@NotNull Object o) {
        if (! (o instanceof Request comparableObject)) {
            return -1;
        }
        return Integer.compare(number, comparableObject.number);
    }
}
