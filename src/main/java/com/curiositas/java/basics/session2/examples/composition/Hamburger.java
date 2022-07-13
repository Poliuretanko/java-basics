package com.curiositas.java.basics.session2.examples.composition;

public class Hamburger {
    private final Bread bread;
    private final Cheese cheese;
    private final Sause sause;
    private final Cutlet cutlet;

    public Hamburger(Bread bread, Cheese cheese, Sause sause, Cutlet cutlet) {
        this.bread = bread;
        this.cheese = cheese;
        this.sause = sause;
        this.cutlet = cutlet;
    }

    public String getDescription() {
        return "Hamburger: " + bread.getDescription() + ", " +
                cheese.getDescription() + ", " +
                sause.getDescription() + ", " +
                cutlet.getDescription();
    }
}
