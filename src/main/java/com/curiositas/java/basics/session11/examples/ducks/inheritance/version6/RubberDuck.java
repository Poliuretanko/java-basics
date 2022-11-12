package com.curiositas.java.basics.session11.examples.ducks.inheritance.version6;

public class RubberDuck extends NoFlyingDuck {
    @Override
    public void quack() {
        System.out.println("Squeak");
    }

    @Override
    public String getName() {
        return "Rubber";
    }
}
