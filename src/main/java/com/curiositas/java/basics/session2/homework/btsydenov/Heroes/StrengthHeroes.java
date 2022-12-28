package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

public abstract class StrengthHeroes implements Dota2Heroes {
    @Override
    public String heroMainAttribute() {
        return "The main attribute of " + heroName() + " is strength.";
    }

    @Override
    public String heroDamageStats() {
        return heroMinDamage() + "-" + heroMaxDamage();
    }
}
