package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.resources.Gold;

public abstract class SingleItem implements Dota2Item {

    public boolean isBuy(Gold gold) {
        if (gold.getCurrentAmount() > itemCost()) {
            System.out.println(getItemName() + " was successfully bought.");
            gold.setGoldAmount(gold.getCurrentAmount() - itemCost());
            return true;
        } else {
            System.out.println("You lack " + (itemCost() - gold.getCurrentAmount()) + " gold to buy " + getItemName() + ", keep farming.");
            return false;
        }
    }
}
