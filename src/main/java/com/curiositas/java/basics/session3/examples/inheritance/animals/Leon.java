package com.curiositas.java.basics.session3.examples.inheritance.animals;

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
