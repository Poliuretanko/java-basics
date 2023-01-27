package com.curiositas.java.basics.session3.examples.homework.btsydenov;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.items.*;
import com.curiositas.java.basics.session3.examples.homework.btsydenov.resources.Gold;

import java.util.Random;

public class Dota2ItemLifecycle {

    public static void main(String[] args) throws IllegalGoldAmountException {
        final int minGoldValue = -5000;
        final int maxGoldValue = 5000;

        Random random = new Random();
        final int randomGold = minGoldValue + random.nextInt(maxGoldValue);

        Gold currentGold = new Gold();
        // If the gold amount is less than 0, then it should throw an IllegalGoldAmountException
        try {
            currentGold.setGoldAmount(randomGold);
        } catch (IllegalGoldAmountException e) {
            e.printStackTrace();
        }

        // Let's try to buy all components and assemble Sange artifact
        OgreAxe ogreAxe = new OgreAxe();
        BeltOfStrength beltOfStrength = new BeltOfStrength();
        if (BuyService.isEnoughGold(beltOfStrength, currentGold)) {
            BuyService.buy(beltOfStrength, currentGold);
            if (BuyService.isEnoughGold(ogreAxe, currentGold)) {
                BuyService.buy(ogreAxe, currentGold);

                Sange sange = new Sange(ogreAxe, beltOfStrength);
                BuyService.assemble(sange, currentGold);
            }
        }

        // Now Let's try to buy all components and assemble Yasha artifact
        BandOfElvenskin bandOfElvenskin = new BandOfElvenskin();
        BladeOfAlacrity bladeOfAlacrity = new BladeOfAlacrity();
        if (BuyService.isEnoughGold(bandOfElvenskin, currentGold)) {
            BuyService.buy(bandOfElvenskin, currentGold);
            if (BuyService.isEnoughGold(bladeOfAlacrity, currentGold)) {
                BuyService.buy(bladeOfAlacrity, currentGold);

                Yasha yasha = new Yasha(bandOfElvenskin, bladeOfAlacrity);
                BuyService.assemble(yasha, currentGold);
            }
        }
    }
}
