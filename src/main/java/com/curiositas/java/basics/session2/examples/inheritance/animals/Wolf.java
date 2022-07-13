package com.curiositas.java.basics.session2.examples.inheritance.animals;

public class Wolf extends CanineFamily {
    @Override
    public String sound() {
        return "Howl";
    }

    @Override
    public String getName() {
        return "Wolf";
    }
}
