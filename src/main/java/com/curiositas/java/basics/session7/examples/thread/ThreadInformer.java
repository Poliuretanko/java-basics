package com.curiositas.java.basics.session7.examples.thread;

import java.util.Arrays;

public class ThreadInformer {

    private final Thread thread;

    public ThreadInformer(Thread thread) {
        this.thread = thread;
    }

    public String getThreadInfo() {
        return "name " + thread.getName() +
                "\nid " + thread.getId() +
                "\nstacktrace " + Arrays.toString(thread.getStackTrace()) +
                "\nis daemon " + thread.isDaemon() +
                "\nstate " + thread.getState();
    }
}
