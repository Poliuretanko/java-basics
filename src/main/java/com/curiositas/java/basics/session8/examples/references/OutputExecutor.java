package com.curiositas.java.basics.session8.examples.references;


import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

public class OutputExecutor implements Runnable {

    private final String message;
    private final int weakReferencesCount;
    List<WeakReference<MyObject>> references = new ArrayList<>();

    public OutputExecutor(String message, int weakReferencesCount) {
        this.message = message;
        this.weakReferencesCount = weakReferencesCount;
    }

    @Override
    public void run() {
        var references = createReferences();
        printReferences(references);
    }

    private List<WeakReference<MyObject>> createReferences() {
        for (int i = 0; i < weakReferencesCount; i++) {
            references.add(MyObject.createReference(message.trim()));
        }
        return references;
    }

    private void printReferences(List<WeakReference<MyObject>> references) {
        references.forEach(reference -> System.out.println(reference.get()));
    }

    public List<WeakReference<MyObject>> getReferences() {
        return references;
    }
}
