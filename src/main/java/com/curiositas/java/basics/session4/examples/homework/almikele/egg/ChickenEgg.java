package com.curiositas.java.basics.session4.examples.homework.almikele.egg;

public class ChickenEgg implements Egg {
    public boolean isBroken = false;

    @Override
    public void brake() {
        if (!isBroken) {
            this.isBroken = true;
        } else {
            throw new IllegalStateException("egg already broken!");
        }
    }
}
