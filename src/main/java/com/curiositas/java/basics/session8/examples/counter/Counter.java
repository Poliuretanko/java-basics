package com.curiositas.java.basics.session8.examples.counter;

import org.openjdk.jol.vm.VM;

import java.util.concurrent.atomic.AtomicInteger;

public class Counter implements Runnable {

    private int counterAsPrimitive = 0;
    private Integer counterAsObject = 0;
    private final MyInteger counterAsMyObject = new MyInteger();

    private static final AtomicInteger sharedCounter = new AtomicInteger(0);
    private final int stepsCount;

    public Counter(int stepsCount) {
        this.stepsCount = stepsCount;
    }

    @Override
    public void run() {
        int i = 0;
        for (; i < stepsCount; i++) {
            System.out.println(Thread.currentThread().getName() + ": using local variable i(" + i + ") @" + VM.current().addressOf(i));
            System.out.println(Thread.currentThread().getName() + ": Incrementing counterAsPrimitive(" + counterAsPrimitive + ") @" + VM.current().addressOf(counterAsPrimitive));
            System.out.println(Thread.currentThread().getName() + ": Incrementing counterAsObject(" + counterAsObject + ") @" + VM.current().addressOf(counterAsObject));
            System.out.println(Thread.currentThread().getName() + ": Incrementing counterAsMyObject(" + counterAsMyObject + ") @" + VM.current().addressOf(counterAsMyObject));
            counterAsPrimitive++;
            counterAsObject++;
            counterAsMyObject.increment();
            System.out.println(Thread.currentThread().getName() + ": Incrementing shared counter(" + getSharedCounter() + ") @" + VM.current().addressOf(sharedCounter));
            sharedCounter.incrementAndGet();
        }
    }

    public int getSharedCounter() {
        return sharedCounter.get();
    }

    @Override
    public String toString() {
        return "Counter state {" + "counterAsPrimitive=" + counterAsPrimitive + ", counterAsObject=" + counterAsObject + ", counterAsMyObject=" + counterAsMyObject + ", sharedCounter=" + getSharedCounter() + '}';
    }
}
