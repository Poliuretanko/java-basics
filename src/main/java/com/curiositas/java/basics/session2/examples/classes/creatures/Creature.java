package com.curiositas.java.basics.session2.examples.classes.creatures;

/**
 * It's an interface - it's a just an abstract type like a Class. Class contains details of implementation, but Interface not
 * You can't create an object of interface. You can create only an object of a class that is a child of interface
 */
public interface Creature {
    String say();

    String move();

    String name();
}
