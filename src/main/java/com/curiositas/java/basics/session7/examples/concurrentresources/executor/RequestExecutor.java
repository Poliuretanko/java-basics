package com.curiositas.java.basics.session7.examples.concurrentresources.executor;

import com.curiositas.java.basics.session7.examples.concurrentresources.queue.TaskQueue;

public abstract class RequestExecutor implements Runnable {
    protected final TaskQueue queue;

    protected static Integer executedTaskCounter = 0;

    public RequestExecutor(TaskQueue queue) {
        this.queue = queue;
    }

    public int getTaskCount() {
        return queue.getTaskCount();
    }

    public Integer getExecutedTaskCounter() {
        return executedTaskCounter;
    }
}
