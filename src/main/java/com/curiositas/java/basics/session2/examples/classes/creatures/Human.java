package com.curiositas.java.basics.session2.examples.classes.creatures;

/**
 * This is an abstract class. It means that you can't create an object of this class. You can create an object of child of this class
 * Look, interface Creature is a parent for this class. It's known by the phrase "Human implements Creature"
 * P.S. class can implement more than one interfaces
 */
public abstract class Human implements Creature {
    @Override
    public String move() {
        return name() + " walk with feet";
    }
}
