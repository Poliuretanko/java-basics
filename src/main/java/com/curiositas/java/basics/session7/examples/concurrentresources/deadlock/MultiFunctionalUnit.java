package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public class MultiFunctionalUnit extends Resource {
    public void print(String message) {
        acquire();
        System.out.println("Print: " + message);
    }

    public String scan() {
        acquire();
        return "Scanned image";
    }
}
