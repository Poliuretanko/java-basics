package com.curiositas.java.basics.session11.examples.ducks.inheritance.version3;

public class RubberDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public void fly() {
        System.out.println("No fly");
    }

    @Override
    public String getName() {
        return "Rubber";
    }
}
