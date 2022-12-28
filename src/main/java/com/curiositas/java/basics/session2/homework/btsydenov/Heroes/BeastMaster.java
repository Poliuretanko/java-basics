package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

import java.util.Random;

public class BeastMaster extends StrengthHeroes{

    final int minDamage = 54;
    final int maxDamage = 58;

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
        return "Beastmaster";
    }

    @Override
    public  int heroHealthPoints() {
        return 660;
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
