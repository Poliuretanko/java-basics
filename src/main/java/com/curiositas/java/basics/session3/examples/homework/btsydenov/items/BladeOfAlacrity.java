package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class BladeOfAlacrity extends SingleItem {

    final int cost = 1000;

    @Override
    public String getItemName() {
        return "Blade of Alacrity";
    }

    @Override
    public int itemCost() {
        return cost;
    }
}
