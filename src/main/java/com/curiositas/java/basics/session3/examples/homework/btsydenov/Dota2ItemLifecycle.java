package com.curiositas.java.basics.session3.examples.homework.btsydenov;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.items.*;
import com.curiositas.java.basics.session3.examples.homework.btsydenov.resources.Gold;

import java.util.Random;

public class Dota2ItemLifecycle {

    public static void main(String[] args) {
        final int minGoldValue = 500;
        final int maxGoldValue = 5000;

        Random random = new Random();
        final int randomGold = minGoldValue + random.nextInt(maxGoldValue);

        Gold currentGold = new Gold();
        currentGold.setGoldAmount(randomGold);

        OgreAxe ogreAxe = new OgreAxe();
        BeltOfStrength beltOfStrength = new BeltOfStrength();
        Sange sange = new Sange(ogreAxe, beltOfStrength);

        if (ogreAxe.isBuy(currentGold)) {
            if (beltOfStrength.isBuy(currentGold)) {
                if (sange.isAssemble(currentGold)) {
                    BandOfElvenskin bandOfElvenskin = new BandOfElvenskin();
                    BladeOfAlacrity bladeOfAlacrity = new BladeOfAlacrity();
                    Yasha yasha = new Yasha(bandOfElvenskin, bladeOfAlacrity);
                    if (bandOfElvenskin.isBuy(currentGold)) {
                        if (bladeOfAlacrity.isBuy(currentGold)) {
                            yasha.isAssemble(currentGold);
                        }
                    }
                }
            }
        }
    }
}
