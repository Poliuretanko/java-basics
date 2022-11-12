package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck;

public interface Duck {

    void quack();

    void fly();

    String getName();

    default void selfPresent() {
        System.out.println("\nI'm a " + getName() + " duck.");
    }

}
