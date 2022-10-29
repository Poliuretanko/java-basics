package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session7.examples.concurrentresources.deadlock.File;
import com.curiositas.java.basics.session7.examples.concurrentresources.deadlock.MultiFunctionalUnit;
import com.curiositas.java.basics.session7.examples.concurrentresources.deadlock.PrintingTask;
import com.curiositas.java.basics.session7.examples.concurrentresources.deadlock.ScanningTask;

public class Step35_Deadlock {
    public static void main(String[] args) {
        var file = new File();
        var mfu = new MultiFunctionalUnit();
        var printingTask = new PrintingTask(file, mfu);
        var scanningTask = new ScanningTask(file, mfu);

        var printingThread = new Thread(printingTask);
        var scanningThread = new Thread(scanningTask);

        printingThread.start();
        scanningThread.start();
    }
}
