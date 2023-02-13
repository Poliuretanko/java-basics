package com.curiositas.java.basics.btsydenov;

public class Voter {
    private int dumbAssCounter = 0;

    private final String name;

    public Voter(String name) {
        this.name = name;
    }

    public void addDumbAssCounter() {
        dumbAssCounter++;
    }

    public int getDumbAssCounter() {
        return dumbAssCounter;
    }

    public String getName() {
        return name;
    }
}
