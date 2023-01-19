package com.curiositas.java.basics.session2.homework.almikele.part1.egg;

public class ChickenEgg implements Egg {
    public boolean isBroken = false;

    @Override
    public void brake() {
        isBroken = true;
    }
}
