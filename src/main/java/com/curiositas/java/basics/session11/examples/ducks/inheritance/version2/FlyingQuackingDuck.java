package com.curiositas.java.basics.session11.examples.ducks.inheritance.version2;

public abstract class FlyingQuackingDuck implements Duck {
    @Override
    public void quack() {
        System.out.println("Quack");
    }

    @Override
    public void fly() {
        System.out.println("Fly with wings");
    }
}
