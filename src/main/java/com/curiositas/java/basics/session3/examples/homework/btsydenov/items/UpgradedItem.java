package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.resources.Gold;

public abstract class UpgradedItem implements Dota2Item {

    public boolean isAssemble(Gold gold) {
        if (gold.getCurrentAmount() > getRecipeCost()) {
            System.out.println("Well done! Now you have " + getItemName() + "! Your damage increases by " + bonusDamage());
            gold.setGoldAmount(gold.getCurrentAmount() - getRecipeCost());
            return true;
        } else {
            System.out.println("You lack " + (getRecipeCost() - gold.getCurrentAmount()) + " gold to assemble " + getItemName() + ", keep farming.");
            return false;
        }
    }

    public abstract int bonusDamage();
    public abstract int getRecipeCost();

}
