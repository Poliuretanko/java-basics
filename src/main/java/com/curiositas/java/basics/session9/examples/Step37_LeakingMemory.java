package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.LeakingMemoryTask;

public class Step37_LeakingMemory {
    public static void main(String[] args) {
        var task = new LeakingMemoryTask();
        var application = new Application(task, 3);
        application.run();
    }
}
