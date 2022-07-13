package com.curiositas.java.basics.session2.examples.classes.creatures;

public class German extends Englishman{
    @Override
    public String say() {
        return name() + " says \"Guten Tag!\"";
    }

    @Override
    public String name() {
        return "German";
    }
}
