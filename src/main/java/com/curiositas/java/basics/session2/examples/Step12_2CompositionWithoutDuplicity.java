package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.composition.*;

public class Step12_2CompositionWithoutDuplicity {
    public static void main(String[] args) {

        Hamburger hamburger = makeAHamburger();
        CocaCola cola = pourTheCola();
        Combo combo = new Combo(hamburger, cola);
        System.out.println(combo.getDescription());

        Hamburger firstHamburger = makeAHamburger();
        Hamburger secondHamburger = makeAHamburger();
        CocaCola firstCola = pourTheCola();
        CocaCola secondCola = pourTheCola();
        ComboForPair comboForPair = new ComboForPair(firstHamburger, secondHamburger, firstCola, secondCola);

        System.out.println(comboForPair.getDescription());
        
    }

    private static Hamburger makeAHamburger() {
        Bread bread = new Bread();
        Cheese cheese = new Cheese();
        Sause sause = new Sause();
        Cutlet cutlet = new Cutlet();
        return new Hamburger(bread, cheese, sause, cutlet);
    }

    private static CocaCola pourTheCola() {
        return new CocaCola();
    }
}
