package com.curiositas.java.basics.session8.examples;

import com.curiositas.java.basics.session8.examples.counter.Counter;

import java.util.ArrayList;
import java.util.Collection;

public class Step29_IntegersAndMemory {
    private final static int THREAD_COUNT = 2;
    private final static int STEPS_COUNT = 2;


    public static void main(String[] args) throws InterruptedException {

        Collection<Thread> threads = new ArrayList<>();
        Collection<Counter> counters = new ArrayList<>();
        for (int i = 0; i < THREAD_COUNT; i++) {
            Counter counter = new Counter(STEPS_COUNT);
            counters.add(counter);
            threads.add(new Thread(counter));
        }
        threads.parallelStream().forEach(Thread::start);
        while (threads.stream().anyMatch(Thread::isAlive)) {
            Thread.sleep(100);
        }
        counters.forEach(System.out::println);
    }
}
