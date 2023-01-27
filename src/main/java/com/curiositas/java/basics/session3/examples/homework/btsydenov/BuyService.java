package com.curiositas.java.basics.session3.examples.homework.btsydenov;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.items.Dota2Item;
import com.curiositas.java.basics.session3.examples.homework.btsydenov.items.SingleItem;
import com.curiositas.java.basics.session3.examples.homework.btsydenov.items.UpgradedItem;
import com.curiositas.java.basics.session3.examples.homework.btsydenov.resources.Gold;

public class BuyService {

    public static boolean isEnoughGold(Dota2Item item, Gold gold) {
        if (item instanceof SingleItem) {
            if (gold.getCurrentAmount() > item.itemCost()) {
                return true;
            } else {
                System.out.println("You lack " + (item.itemCost() - gold.getCurrentAmount()) + " gold to buy " + item.getItemName() + ", keep farming.");
                return false;
            }
        } else if (item instanceof UpgradedItem) {
            if (gold.getCurrentAmount() > ((UpgradedItem) item).getRecipeCost()) {
                return true;
            } else {
                System.out.println("You lack " + (((UpgradedItem) item).getRecipeCost() - gold.getCurrentAmount()) + " gold to assemble " + item.getItemName() + ", keep farming.");
                return false;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    public static void buy(SingleItem item, Gold gold) throws IllegalGoldAmountException {
        if (isEnoughGold(item, gold)) {
            System.out.println(item.getItemName() + " was successfully bought.");
            gold.setGoldAmount(gold.getCurrentAmount() - item.itemCost());
        } else {
            System.out.println("You lack " + (item.itemCost() - gold.getCurrentAmount()) + " gold to buy " + item.getItemName() + ", keep farming.");
        }
    }

    public static void assemble(UpgradedItem item, Gold gold) throws IllegalGoldAmountException {
        if (isEnoughGold(item, gold)) {
            System.out.println("Well done! Now you have " + item.getItemName() + "! Your damage increases by " + item.bonusDamage());
            gold.setGoldAmount(gold.getCurrentAmount() - item.getRecipeCost());
        }
    }
}
