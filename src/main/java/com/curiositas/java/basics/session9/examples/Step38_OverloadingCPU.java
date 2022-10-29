package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.SearchingPrimeNumberTask;

public class Step38_OverloadingCPU {
    public static void main(String[] args) {
        var task = new SearchingPrimeNumberTask();
        var application = new Application(task, 15);
        application.run();
    }
}
