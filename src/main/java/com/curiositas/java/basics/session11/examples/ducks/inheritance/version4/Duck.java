package com.curiositas.java.basics.session11.examples.ducks.inheritance.version4;

public interface Duck {

    void quack();

    void fly();

    String getName();

    default void selfPresent() {
        System.out.println("\nI'm a " + getName() + " duck.");
    }

}
