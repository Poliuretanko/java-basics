package com.curiositas.java.basics.session8.examples;

import com.curiositas.java.basics.session8.examples.references.MyObject;
import com.curiositas.java.basics.session8.examples.references.OutputExecutor;

public class Step30_CollectingObjects {

    private static final int WEAK_REFERENCES_COUNT = 1_000_000;

    public static void main(String[] args) throws InterruptedException {
        var firstReference = MyObject.createReference("first");
        var executor = new OutputExecutor("second", WEAK_REFERENCES_COUNT);
        var thread = new Thread(executor);

        System.out.println(firstReference.get());

        thread.start();

        while(thread.isAlive()) {
            Thread.sleep(100);
        }

        System.out.println(firstReference.get());
        var references = executor.getReferences();

        long count = references.stream().filter(reference -> reference.get() == null).count();
        System.out.println(count + " of " + WEAK_REFERENCES_COUNT + " objects were collected as garbage");
    }
}
