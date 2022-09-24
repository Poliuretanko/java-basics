package com.curiositas.java.basics.session7.examples.concurrentresources.queue;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class IteratorTaskQueue implements TaskQueue {

    private final Queue<Request> requests = new ConcurrentLinkedQueue<>();

    @Override
    public void addTask(Request request) {
        requests.add(request);
    }

    @Override
    public Request pullTask() {
        return requests.poll();
    }

    @Override
    public boolean hasTasks() {
        return requests.size() > 0;
    }

    @Override
    public int getTaskCount() {
        return requests.size();
    }
}
