package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class Sange extends UpgradedItem {

    private final OgreAxe ogreAxe;
    private final BeltOfStrength beltOfStrength;
    final int bonusDamage = 16;
    final int recipeCost = 600;

    public Sange(OgreAxe ogreAxe, BeltOfStrength beltOfStrength) {
        this.ogreAxe = ogreAxe;
        this.beltOfStrength = beltOfStrength;
    }

    @Override
    public String getItemName() {
        return "Sange";
    }

    @Override
    public int itemCost() {
        return (this.ogreAxe.itemCost() + this.beltOfStrength.itemCost() + recipeCost);
    }

    @Override
    public int getRecipeCost() {
        return recipeCost;
    }


    @Override
    public int bonusDamage() {
        return bonusDamage;
    }


}
