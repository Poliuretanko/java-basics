package com.curiositas.java.basics.session2.examples.inheritance.animals;

public class Dog extends CanineFamily {
    @Override
    public String sound() {
        return "Bark";
    }

    @Override
    public String getName() {
        return "Dog";
    }

    @Override
    public void joinFlock() {
        System.out.println(getName() + " and human are the flock");
    }
}
