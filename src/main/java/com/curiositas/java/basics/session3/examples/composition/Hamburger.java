package com.curiositas.java.basics.session3.examples.composition;

public class Hamburger {
    private Bread bread;
    private Cheese cheese;
    private Sause sause;
    private Cutlet cutlet;

    public Hamburger(Bread bread, Cheese cheese, Sause sause, Cutlet cutlet) {
        this.bread = bread;
        this.cheese = cheese;
        this.sause = sause;
        this.cutlet = cutlet;
    }

    public Hamburger() {
    }

    public String getDescription() {
        return "Hamburger: " + bread.getDescription() + ", " +
                cheese.getDescription() + ", " +
                sause.getDescription() + ", " +
                cutlet.getDescription();
    }

    public String getString() {
        return "AAA";
    }

    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger();
        System.out.println(hamburger.getString());
    }
}
