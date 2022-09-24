package com.curiositas.java.basics.session7.examples;

import com.curiositas.java.basics.session7.examples.concurrentresources.deadlock.*;

public class Step27_SolvedDeadlock {
    public static void main(String[] args) {
        var file = new File();
        var mfu = new MultiFunctionalUnit();
        var printingTask = new PrintingTask(file, mfu);
        var scanningTask = new AnotherOrderLockingScanningTask(file, mfu);

        var printingThread = new Thread(printingTask);
        var scanningThread = new Thread(scanningTask);

        printingThread.start();
        scanningThread.start();
    }
}
