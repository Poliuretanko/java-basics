package com.curiositas.java.basics.session11.examples.ducks.inheritance.version6;

public abstract class NoFlyingDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("No fly");
    }
}
