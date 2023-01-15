package com.curiositas.java.basics.session2.homework.btsydenov.Heroes;

public abstract class AgilityHeroes implements Dota2Heroes {
    @Override
    public String heroMainAttribute() {
        return "The main attribute of " + heroName() + " is agility.";
    }
}