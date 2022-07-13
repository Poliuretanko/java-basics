package com.curiositas.java.basics.session2.examples.composition;

public class ComboForPair {
    private final Hamburger firstHamburger;
    private final Hamburger secondHamburger;
    private final CocaCola firstCola;
    private final CocaCola secondCola;

    public ComboForPair(Hamburger firstHamburger, Hamburger secondHamburger, CocaCola firstCola, CocaCola secondCola) {
        this.firstHamburger = firstHamburger;
        this.secondHamburger = secondHamburger;
        this.firstCola = firstCola;
        this.secondCola = secondCola;
    }

    public String getDescription() {
        return "ComboForPair: \n" + firstHamburger.getDescription() + "\n" + secondHamburger.getDescription() + "\n"
                + firstCola.getDescription() + "\n" + secondCola.getDescription();
    }
}
