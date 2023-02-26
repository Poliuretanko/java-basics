package com.curiositas.java.basics.session7.examples;

import java.util.concurrent.locks.ReentrantLock;

public class MultipleReentrantLockTask implements Runnable {
    private final ReentrantLock lock = new ReentrantLock();

    @Override
    public void run() {
        String threadName = Thread.currentThread().getName();
        try {

            System.out.printf("%s #1 hold count %d; queue length %d; held by current thread %s%n",
                    threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
            Thread.sleep(500);

            lock.lock();
            Thread.sleep(500);
            System.out.printf("%s #2 hold count %d; queue length %d; held by current thread %s%n",
                    threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());

            try {
                lock.lock();
                Thread.sleep(500);
                System.out.printf("%s #3 hold count %d; queue length %d; held by current thread %s%n",
                        threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
            } finally {
                lock.unlock();
            }

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } finally {
            lock.unlock();
        }
        System.out.printf("%s #4 hold count %d; queue length %d; held by current thread %s%n",
                threadName, lock.getHoldCount(), lock.getQueueLength(), lock.isHeldByCurrentThread());
    }
}
