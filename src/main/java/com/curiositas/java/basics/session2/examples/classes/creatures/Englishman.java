package com.curiositas.java.basics.session2.examples.classes.creatures;

/**
 * It's a class. you can create an object of this class.
 * Another class Human is a parent - it's
 */
public class Englishman extends Human {
    @Override
    public String say() {
        return name() + " says \"Good afternoon!\"";
    }

    @Override
    public String name() {
        return "Englishman";
    }
}
