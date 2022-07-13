package com.curiositas.java.basics.session2.examples.classes.creatures;

public abstract class Flying implements Creature {
    @Override
    public String move() {
        return name() + " fly with wings";
    }
}
