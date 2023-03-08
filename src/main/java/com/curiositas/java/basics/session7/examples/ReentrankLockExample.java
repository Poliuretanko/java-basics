package com.curiositas.java.basics.session7.examples;

import java.util.ArrayList;

public class ReentrankLockExample {
    public static void main(String[] args) {

        var task = new ReentrantLockTask();

        var threads = new ArrayList<Thread>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(task));
        }

        threads.parallelStream().forEach(Thread::start);
    }

}
