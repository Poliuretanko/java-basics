package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

import java.util.Random;

public class Bane extends IntelligenceHeroes{

    final int minDamage = 33;
    final int maxDamage = 39;

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
        return "Bane";
    }

    @Override
    public  int heroHealthPoints() {
        return 640;
    }

    @Override
    public String heroAttackType() {
        return heroName() + " has ranged attack type.";
    }

    @Override
    public int heroDealDamage() {
        Random random = new Random();
        return minDamage + random.nextInt(maxDamage);
    }

}
