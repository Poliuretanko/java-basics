package com.curiositas.java.basics.session7.examples;

import com.curiositas.java.basics.session7.examples.concurrentresources.Application;
import com.curiositas.java.basics.session7.examples.concurrentresources.Request;
import com.curiositas.java.basics.session7.examples.concurrentresources.executor.AtomicCounterRequestExecutor;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.IteratorTaskQueue;

public class Step25_JavaConcurrencyInstruments {
    public static void main(String[] args) throws InterruptedException {

        var taskCount = 100000;
        var threadCount = 100;
        var queue = new IteratorTaskQueue();

        for (int i = 0; i < taskCount; i++) {
            var request = new Request(i);
            queue.addTask(request);
        }

        var application = new Application(new AtomicCounterRequestExecutor(queue), queue, threadCount);

        application.run();
    }
}
