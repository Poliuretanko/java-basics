package com.curiositas.java.basics.session2.examples.inheritance.animals;

public class Leon extends CatFamily {
    @Override
    public String sound() {
        return "Roar";
    }

    @Override
    public String getName() {
        return "Leon";
    }
}
