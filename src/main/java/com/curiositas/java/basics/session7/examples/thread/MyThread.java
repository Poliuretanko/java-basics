package com.curiositas.java.basics.session7.examples.thread;

public class MyThread extends Thread{
    private final Output output;

    public MyThread(Runnable target, Output output) {
        super(target);
        this.output = output;
    }

    @Override
    public void run() {
        output.write(Thread.currentThread().getName() + " START");
        super.run();
        output.write(Thread.currentThread().getName() + " FINISH");
    }
}
