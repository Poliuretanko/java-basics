package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public interface Warrior {

    void attack();

    String getName();

    default void selfPresent() {
        System.out.println("\nI'm a " + getName() + " and I'm not duck.");
    }
}
