package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

public interface Dota2Heroes {
    String heroName();
    String heroMainAttribute();
    String heroAttackType();
    int heroMinDamage();
    int heroMaxDamage();
    int heroHealthPoints();
    int heroDealDamage();
    void getDamage(int damage);

    default String heroDamageStats() {
        return heroMinDamage() + "-" + heroMaxDamage();
    }
}
