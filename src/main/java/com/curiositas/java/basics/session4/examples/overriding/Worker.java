package com.curiositas.java.basics.session4.examples.overriding;

public class Worker extends SocialRole {

    public Worker(SocializationLevel socializationLevel) {
        super(socializationLevel);
    }

    @Override
    public String act() {
        return super.act() + " and working";
    }

    @Override
    public String getName() {
        return "Worker";
    }
}
