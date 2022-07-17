package com.curiositas.java.basics.session3.examples.overriding;

public class Worker extends SocialRole {

    public Worker(SocializationLevel socializationLevel) {
        super(socializationLevel);
    }

    @Override
    public String act() {
        return "working and " + super.act();
    }
}
