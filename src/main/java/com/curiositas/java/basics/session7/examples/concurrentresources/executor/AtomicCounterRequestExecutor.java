package com.curiositas.java.basics.session7.examples.concurrentresources.executor;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.TaskQueue;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounterRequestExecutor extends RequestExecutor {

    private static AtomicInteger executedTaskCounter = new AtomicInteger(0);

    public AtomicCounterRequestExecutor(TaskQueue queue) {
        super(queue);
    }

    @Override
    public void run() {
        while (queue.hasTasks()) {
            Request request = queue.pullTask();
            request.execute();
            executedTaskCounter.incrementAndGet();
        }
    }

    @Override
    public Integer getExecutedTaskCounter() {
        return executedTaskCounter.get();
    }
}
