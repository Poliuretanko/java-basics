package com.curiositas.java.basics.session7.examples.concurrentresources.queue;

import com.curiositas.java.basics.session7.examples.concurrentresources.Request;

public interface TaskQueue {

    void addTask(Request request);

    Request pullTask();

    boolean hasTasks();

    int getTaskCount();
}
