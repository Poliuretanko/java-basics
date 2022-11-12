package com.curiositas.java.basics.session11.examples.ducks.strategy.version1;

public class RedheadDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }

    @Override
    public String getName() {
        return "Redhead";
    }
}
