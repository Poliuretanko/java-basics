package com.curiositas.java.basics.session7.examples.concurrentresources.executor;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.SynchronizedTaskQueue;

public class SynchronizerRequestExecutor extends RequestExecutor {

    public SynchronizerRequestExecutor(SynchronizedTaskQueue queue) {
        super(queue);
    }

    @Override
    public void run() {
        while (queue.hasTasks()) {
            Request request = queue.pullTask();
            request.execute();
            synchronized (this) {
                executedTaskCounter++;
            }
        }
    }
}
