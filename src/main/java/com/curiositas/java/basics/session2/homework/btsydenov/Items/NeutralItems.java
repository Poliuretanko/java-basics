package com.curiositas.java.basics.session2.homework.btsydenov.Items;

public abstract class NeutralItems implements Dota2Items{

    @Override
    public String itemType() {
        return "neutral";
    }

    @Override
    public String itemDescription() {
        return itemName() + " deals " + itemBonusDamage() + " bonus damage.";
    }
}
