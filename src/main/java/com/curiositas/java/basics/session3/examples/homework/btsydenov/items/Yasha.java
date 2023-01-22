package com.curiositas.java.basics.session3.examples.homework.btsydenov.items;

public class Yasha extends UpgradedItem {

    private final BandOfElvenskin bandOfElvenskin;
    private final BladeOfAlacrity bladeOfAlacrity;
    final int bonusDamage = 16;
    final int recipeCost = 600;

    public Yasha(BandOfElvenskin bandOfElvenskin, BladeOfAlacrity bladeOfAlacrity) {
        this.bandOfElvenskin = bandOfElvenskin;
        this.bladeOfAlacrity = bladeOfAlacrity;
    }

    @Override
    public String getItemName() {
        return "Yasha";
    }

    @Override
    public int itemCost() {
        return (this.bandOfElvenskin.itemCost() + this.bladeOfAlacrity.itemCost() + recipeCost);
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
