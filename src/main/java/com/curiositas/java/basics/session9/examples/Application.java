package com.curiositas.java.basics.session9.examples;

import java.util.ArrayList;

public class Application {
    private final Runnable task;
    private final Integer threadCount;

    public Application(Runnable task, Integer threadCount) {
        this.task = task;
        this.threadCount = threadCount;
    }

    public void run() {
        var threads = new ArrayList<Thread>();
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(task));
        }
        threads.parallelStream().forEach(Thread::start);
    }
}
