package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public class ScanningTask implements Runnable {

    private final File file;
    private final MultiFunctionalUnit mfu;

    public ScanningTask(File file, MultiFunctionalUnit mfu) {
        this.file = file;
        this.mfu = mfu;
    }

    @Override
    public void run() {
        System.out.println("ScanningTask: locking mfu");
        synchronized (mfu) {
            System.out.println("ScanningTask: mfu is locked!");
            String scannedContent = mfu.scan();

            System.out.println("ScanningTask: locking file");
            synchronized (file) {
                System.out.println("ScanningTask: file is locked!");
                file.write(scannedContent);
            }
        }
    }
}
