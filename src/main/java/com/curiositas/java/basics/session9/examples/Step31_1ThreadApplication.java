package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.ContinuingTask;

public class Step31_1ThreadApplication {
    public static void main(String[] args) {
        var task = new ContinuingTask();
        var application = new Application(task, 1);
        application.run();
    }
}
