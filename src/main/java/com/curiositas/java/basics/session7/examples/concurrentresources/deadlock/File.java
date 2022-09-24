package com.curiositas.java.basics.session7.examples.concurrentresources.deadlock;

public class File extends Resource {
    public String read() {
        acquire();
        return "Some content";
    }

    public void write(String content) {
        acquire();
        System.out.println("Scan to file: " + content);
    }
}
