package com.curiositas.java.basics.session4.examples.overriding;

public class Parent extends SocialRole {

    public Parent(SocializationLevel socializationLevel) {
        super(socializationLevel);
    }

    @Override
    public String getName() {
        return "Parent";
    }
}
