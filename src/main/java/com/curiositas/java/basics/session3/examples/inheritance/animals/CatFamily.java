package com.curiositas.java.basics.session3.examples.inheritance.animals;

public abstract class CatFamily implements Animal {
    public void huntingInNight() {
        System.out.println(getName() + " is hunting in the night");
    }
}
