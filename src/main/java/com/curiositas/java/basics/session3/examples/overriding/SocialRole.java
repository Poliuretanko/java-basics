package com.curiositas.java.basics.session3.examples.overriding;

public abstract class SocialRole {
    private final SocializationLevel socializationLevel;

    public SocialRole(SocializationLevel socializationLevel) {
        this.socializationLevel = socializationLevel;
    }

    public String act() {
        return "being part of society";
    }

    public SocializationLevel getSocializationLevel() {
        return socializationLevel;
    }
}
