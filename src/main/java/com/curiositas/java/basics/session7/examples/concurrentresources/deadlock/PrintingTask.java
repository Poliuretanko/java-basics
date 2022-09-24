package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public class PrintingTask implements Runnable {

    private final File file;
    private final MultiFunctionalUnit mfu;

    public PrintingTask(File file, MultiFunctionalUnit mfu) {
        this.file = file;
        this.mfu = mfu;
    }

    @Override
    public void run() {
        System.out.println("PrintingTask: locking file");
        synchronized (file) {
            System.out.println("PrintingTask: file is locked!");
            String content = file.read();

            System.out.println("PrintingTask: locking mfu");
            synchronized (mfu) {
                System.out.println("PrintingTask: mfu is locked!");
                mfu.print(content);
            }
        }
    }
}
