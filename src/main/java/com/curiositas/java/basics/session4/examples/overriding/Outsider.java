package com.curiositas.java.basics.session4.examples.overriding;

public class Outsider extends SocialRole {

    public Outsider() {
        super(SocializationLevel.LOW);
    }

    @Override
    public String act() {
        return getName() + " is living alone";
    }

    @Override
    public String getName() {
        return "Outsider";
    }
}
