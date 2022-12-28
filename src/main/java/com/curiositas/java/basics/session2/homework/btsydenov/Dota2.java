package com.curiositas.java.basics.session2.homework.btsydenov;

import com.curiositas.java.basics.session2.homework.btsydenov.Heroes.*;
import com.curiositas.java.basics.session2.homework.btsydenov.Items.*;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Dota2 {
    public static void main(String[] args) {
        listDota2Heroes();
        System.out.println("\n");
        listDota2Items();
    }

    public static void listDota2Heroes() {
        var heroes = new ArrayList<Dota2Heroes>();

        var antimage = new AntiMage();
        heroes.add(antimage);

        var beastmaster = new BeastMaster();
        heroes.add(beastmaster);

        var bane = new Bane();
        heroes.add(bane);

        // this counter is used for the numbered list of heroes
        AtomicInteger counter = new AtomicInteger(1);

        System.out.println("These are the heroes in Dota 2:");
        heroes.forEach(hero -> {
            System.out.println(counter.getAndIncrement() + ".\t" + hero.heroName() + ".");
            System.out.println("\t" + hero.heroMainAttribute() + " " + hero.heroAttackType());
            System.out.println("\t" + "The hero has " + hero.heroHealthPoints() + " HP and deals " + hero.heroDamageStats() + " damage.");
        });
    }

    public static void listDota2Items() {
        var items = new ArrayList<Dota2Items>();

        var desolator = new Desolator();
        items.add(desolator);

        var paladinSword = new PaladinSword();
        items.add(paladinSword);

        var divineRapier = new DivineRapier();
        items.add(divineRapier);

        // this counter is used for the numbered list of heroes
        AtomicInteger counter = new AtomicInteger(1);

        System.out.println("These are the items in Dota 2:");
        items.forEach( item -> {
            System.out.println(counter.getAndIncrement() + ".\t" + item.itemName() + ".");
            System.out.println("\t" + item.itemName() + " is a " + item.itemType() + " item. " + item.itemDescription());
        });
    }
}
