package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.ContinuingTask;

public class Step33_3ThreadApplication {
    public static void main(String[] args) {
        var task = new ContinuingTask();
        var application = new Application(task, 3);
        application.run();
    }
}
