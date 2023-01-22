package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class BeltOfStrength extends SingleItem {

    final int cost = 450;

    @Override
    public String getItemName() {
        return "Belt of Strength";
    }

    @Override
    public int itemCost() {
        return cost;
    }
}
