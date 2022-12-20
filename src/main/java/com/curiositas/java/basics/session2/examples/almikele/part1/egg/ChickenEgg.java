package com.curiositas.java.basics.session2.examples.almikele.part1.egg;

public abstract class ChickenEgg implements Egg {
    public static final int QUANTITY = 3;

    @Override
    public String brake() {
        return "add belok + zheltok";
    }
}
