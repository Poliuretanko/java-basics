package com.curiositas.java.basics.session2.examples.inheritance.animals;

public abstract class CanineFamily implements Animal {

    public Boolean joinedToFlock;

    public void joinFlock() {
        joinedToFlock = true;
        System.out.println(getName() + " is joined to flock");
    }
}
