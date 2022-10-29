package com.curiositas.java.basics.session9.examples.tasks;

public class ContinuingTaskWithPauses extends ContinuingTask {
    @Override
    protected void doTask() {
        super.doTask();
        doSomeJob();
    }
}
