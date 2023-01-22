package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class BandOfElvenskin extends SingleItem {

    final int cost = 450;

    @Override
    public String getItemName() {
        return "Band of Elvenskin";
    }

    @Override
    public int itemCost() {
        return cost;
    }
}
