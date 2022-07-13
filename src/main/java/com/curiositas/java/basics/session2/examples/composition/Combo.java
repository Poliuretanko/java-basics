package com.curiositas.java.basics.session2.examples.composition;

public class Combo {
    private final Hamburger hamburger;
    private final CocaCola cola;

    public Combo(Hamburger hamburger, CocaCola cola) {
        this.hamburger = hamburger;
        this.cola = cola;
    }

    public String getDescription() {
        return "Combo: \n" + hamburger.getDescription() + "\n" + cola.getDescription();
    }
}
