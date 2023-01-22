package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class OgreAxe extends SingleItem {

    final int cost = 1000;

    @Override
    public String getItemName() {
        return "Ogre Axe";
    }

    @Override
    public int itemCost() {
        return cost;
    }
}
