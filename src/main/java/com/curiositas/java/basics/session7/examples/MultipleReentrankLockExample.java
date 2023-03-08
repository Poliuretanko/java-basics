package com.curiositas.java.basics.session7.examples;

import java.util.ArrayList;

public class MultipleReentrankLockExample {
    public static void main(String[] args) {
        var task = new MultipleReentrantLockTask();
        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(task));
        }
        threads.parallelStream().forEach(Thread::start);
    }
}
