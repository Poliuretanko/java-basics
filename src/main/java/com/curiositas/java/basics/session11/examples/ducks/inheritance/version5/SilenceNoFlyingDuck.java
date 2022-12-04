package com.curiositas.java.basics.session11.examples.ducks.inheritance.version5;

public abstract class SilenceNoFlyingDuck extends NoFlyingDuck {
    @Override
    public void quack() {
        System.out.println("Silence");
    }
}
