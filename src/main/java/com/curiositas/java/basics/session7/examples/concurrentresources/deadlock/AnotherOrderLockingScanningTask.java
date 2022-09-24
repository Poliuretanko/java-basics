package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public class AnotherOrderLockingScanningTask implements Runnable {

    private final File file;
    private final MultiFunctionalUnit mfu;

    public AnotherOrderLockingScanningTask(File file, MultiFunctionalUnit mfu) {
        this.file = file;
        this.mfu = mfu;
    }

    @Override
    public void run() {
        System.out.println("ScanningTask: locking file");
        synchronized (file) {
            System.out.println("ScanningTask: file is locked!");

            String scannedContent;
            System.out.println("ScanningTask: locking mfu");
            synchronized (mfu) {
                System.out.println("ScanningTask: mfu is locked!");
                scannedContent = mfu.scan();
            }
            file.write(scannedContent);
        }
    }
}

