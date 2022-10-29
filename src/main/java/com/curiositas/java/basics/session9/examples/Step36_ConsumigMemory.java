package com.curiositas.java.basics.session9.examples;

import com.curiositas.java.basics.session9.examples.tasks.ConsumingMemoryWithGarbageCollectionTask;

public class Step36_ConsumigMemory {
    public static void main(String[] args) {
        var task = new ConsumingMemoryWithGarbageCollectionTask();
        var application = new Application(task, 3);
        application.run();
    }
}
