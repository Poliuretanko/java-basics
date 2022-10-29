package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.ContinuingTaskWithPauses;

public class Step34_3ThreadWithPausesApplication {
    public static void main(String[] args) {
        var task = new ContinuingTaskWithPauses();
        var application = new Application(task, 3);
        application.run();
    }
}
