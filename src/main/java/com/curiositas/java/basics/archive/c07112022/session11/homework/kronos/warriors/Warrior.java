package com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.warriors;

public interface Warrior {

    void attack();

    String getName();

    default void selfPresent() {
        System.out.println("\nI'm a " + getName() + " and I'm not duck.");
    }
}
