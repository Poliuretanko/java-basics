package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

public abstract class IntelligenceHeroes implements Dota2Heroes {
    @Override
    public String heroMainAttribute() {
        return "The main attribute of " + heroName() + " is intelligence.";
    }

    @Override
    public String heroDamageStats() {
        return heroMinDamage() + "-" + heroMaxDamage();
    }
}
