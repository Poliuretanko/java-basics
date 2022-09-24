package com.curiositas.java.basics.session7.examples.concurrentresources.queue;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;

public class SynchronizedTaskQueue implements TaskQueue {

    private final Request[] requests;
    private int index = -1;

    public SynchronizedTaskQueue(int size) {
        requests = new Request[size];
    }

    @Override
    public void addTask(Request request) {
        index++;
        requests[index] = request;
    }

    @Override
    public synchronized Request pullTask() {
        var request = requests[index];
        index--;
        return request;
    }

    @Override
    public boolean hasTasks() {
        return index > -1;
    }

    @Override
    public int getTaskCount() {
        return index + 1;
    }
}
