package com.curiositas.java.basics.session3.examples.composition;

public class Bread {
    private String type;

    public Bread(String type) {
        this.type = type;
    }

    public Bread() {
        this.type = "white";
    }

    String getDescription() {
        return "Bread";
    }

    public Bread copy() {
        return new Bread(type);
    }
}
