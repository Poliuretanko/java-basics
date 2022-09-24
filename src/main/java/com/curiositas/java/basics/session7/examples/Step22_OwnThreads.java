package com.curiositas.java.basics.session7.examples;

import com.curiositas.java.basics.session7.examples.thread.ConsoleOutput;
import com.curiositas.java.basics.session7.examples.thread.MyThread;
import com.curiositas.java.basics.session7.examples.thread.SimpleTask;

public class Step22_OwnThreads {
    public static void main(String[] args) {
        var output = new ConsoleOutput();
        var thread1 = new MyThread(new SimpleTask(output), output);
        var thread2 = new MyThread(new SimpleTask(output), output);
        var thread3 = new MyThread(new SimpleTask(output), output);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
