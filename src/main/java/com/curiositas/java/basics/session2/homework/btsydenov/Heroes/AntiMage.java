package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

import java.util.Random;

public class AntiMage extends AgilityHeroes{

    final int minDamage = 53;
    final int maxDamage = 57;

    @Override
    public int heroMinDamage() {
        return minDamage;
    }

    @Override
    public int heroMaxDamage() {
        return maxDamage;
    }

    @Override
    public String heroName() {
        return "Anti-Mage";
    }

    @Override
    public  int heroHealthPoints() {
        return 620;
    }

    @Override
    public String heroAttackType() {
        return heroName() + " has melee attack type.";
    }

    @Override
    public int heroDealDamage() {
        Random random = new Random();
        return minDamage + random.nextInt(maxDamage);
    }

}
