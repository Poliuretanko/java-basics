package com.curiositas.java.basics.session7.examples;

import com.curiositas.java.basics.session7.examples.concurrentresources.Application;
import com.curiositas.java.basics.session7.examples.concurrentresources.Request;
import com.curiositas.java.basics.session7.examples.concurrentresources.executor.SimpleRequestExecutor;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.SimpleTaskQueue;

public class Step23_ConcurrentResources {

    public static void main(String[] args) throws InterruptedException {
        var taskCount = 100000;
        var threadCount = 100;
        var queue = new SimpleTaskQueue(taskCount);

        for (int i = 0; i < taskCount; i++) {
            var request = new Request(i);
            queue.addTask(request);
        }

        var application = new Application(new SimpleRequestExecutor(queue), queue, threadCount);

        application.startApplication();
    }
}
