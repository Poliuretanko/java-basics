package com.curiositas.java.basics.session4.examples.overriding;

public abstract class SocialRole implements Actor, Role {
    private final SocializationLevel socializationLevel;

    public SocialRole(SocializationLevel socializationLevel) {
        this.socializationLevel = socializationLevel;
    }

    @Override
    public String act() {
        return getName() + " is being part of society";
    }

    public String getSocializationLevel() {
        return getName() + " has socialization level = " + socializationLevel;
    }
}
