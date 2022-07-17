package com.curiositas.java.basics.session3.examples.overriding;

public class Outsider extends SocialRole {

    public Outsider() {
        super(SocializationLevel.LOW);
    }

    @Override
    public String act() {
        return "living alone";
    }
}
