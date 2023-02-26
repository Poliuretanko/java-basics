package com.curiositas.java.basics.session7.examples;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockTask implements Runnable {
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {

            System.out.printf("%s #1 hold count %d; queue length %d; held by current thread %s%n",
                    threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
            Thread.sleep(500);

            while(!lock.tryLock()) {
                System.out.printf("%s do another job%n", threadName);
                Thread.sleep(50);
            }
            System.out.printf("%s #2 hold count %d; queue length %d; held by current thread %s%n",
                    threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.printf("%s #3 hold count %d; queue length %d; held by current thread %s%n",
                threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
    }
}
