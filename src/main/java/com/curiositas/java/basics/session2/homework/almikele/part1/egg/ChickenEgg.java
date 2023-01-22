package com.curiositas.java.basics.session2.homework.almikele.part1.egg;

public class ChickenEgg implements Egg {
    public boolean isBroken = false;

    @Override
    public void brake(boolean isBroken) {
        if (!isBroken) {
            this.isBroken = true;
        } else {
            throw new IllegalStateException("egg already broken!");
        }
    }
}
