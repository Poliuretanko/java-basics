package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.composition.*;

public class Step12_1CompositionWithDuplicity {
    public static void main(String[] args) {
        Bread bread = new Bread();
        Cheese cheese = new Cheese();
        Sause sause = new Sause();
        Cutlet cutlet = new Cutlet();
        Hamburger hamburger = new Hamburger(bread, cheese, sause, cutlet);
        CocaCola cola = new CocaCola();
        Combo combo = new Combo(hamburger, cola);
        System.out.println(combo.getDescription());


        Bread breadForFirstHamburger = new Bread();
        Cheese cheeseForFirstHamburger = new Cheese();
        Sause sauseForFirstHamburger = new Sause();
        Cutlet cutletForFirstHamburger = new Cutlet();
        Hamburger firstHamburger = new Hamburger(breadForFirstHamburger, cheeseForFirstHamburger, sauseForFirstHamburger, cutletForFirstHamburger);

        Bread breadForSecondHamburger = new Bread();
        Cheese cheeseForSecondHamburger = new Cheese();
        Sause sauseForSecondHamburger = new Sause();
        Cutlet cutletForSecondHamburger = new Cutlet();
        Hamburger secondHamburger = new Hamburger(breadForSecondHamburger, cheeseForSecondHamburger, sauseForSecondHamburger, cutletForSecondHamburger);

        CocaCola firstCola = new CocaCola();
        CocaCola secondCola = new CocaCola();
        ComboForPair comboForPair = new ComboForPair(firstHamburger, secondHamburger, firstCola, secondCola);

        System.out.println(comboForPair.getDescription());
        
    }
}
