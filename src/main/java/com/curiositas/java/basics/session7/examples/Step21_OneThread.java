package com.curiositas.java.basics.session7.examples;

import com.curiositas.java.basics.session7.examples.thread.ConsoleOutput;
import com.curiositas.java.basics.session7.examples.thread.ThreadInformer;

public class Step21_OneThread {
    public static void main(String[] args) {
        var currentThread = Thread.currentThread();
        var output = new ConsoleOutput();
        var informer = new ThreadInformer(currentThread);
        output.write(informer.getThreadInfo());
    }
}
