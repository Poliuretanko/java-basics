package com.curiositas.java.basics.session7.examples.concurrentresources.executor;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;
import com.curiositas.java.basics.session7.examples.concurrentresources.queue.SimpleTaskQueue;

public class SimpleRequestExecutor extends RequestExecutor {

    public SimpleRequestExecutor(SimpleTaskQueue queue) {
        super(queue);
    }

    @Override
    public void run() {
        while (queue.hasTasks()) {
            Request request = queue.pullTask();
            request.execute();
            executedTaskCounter++;
        }
    }
}
