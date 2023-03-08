package com.curiositas.java.basics.session7.examples.concurrentresources;

import com.curiositas.java.basics.session7.examples.concurrentresources.executor.RequestExecutor;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.TaskQueue;

import java.util.ArrayList;
import java.util.Collection;

public class Application {
    private final int threadCount;
    private final TaskQueue queue;
    private final RequestExecutor executor;

    public Application(RequestExecutor executor, TaskQueue queue, int threadCount) {
        this.queue = queue;
        this.executor = executor;
        this.threadCount = threadCount;
    }

    public void startApplication() throws InterruptedException {
        Collection<Thread> threads = new ArrayList<>();
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(executor));
        }
        threads.parallelStream().forEach(Thread::start);

        while (queue.hasTasks() || threads.stream().allMatch(Thread::isAlive)) {
            Thread.sleep(100);
        }
        System.out.println(executor.getExecutedTaskCounter() + " tasks executed");
    }
}
