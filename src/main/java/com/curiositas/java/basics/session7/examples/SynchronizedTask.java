package com.curiositas.java.basics.session7.examples;

public class SynchronizedTask implements Runnable {
    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {

            System.out.printf("%s #1 before synchronized%n", threadName);
            Thread.sleep(500);

            synchronized (this) {
                Thread.sleep(50);
                System.out.printf("%s #2 in synchronized%n", threadName);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s #3 after synchronized%n", threadName);
    }
}
