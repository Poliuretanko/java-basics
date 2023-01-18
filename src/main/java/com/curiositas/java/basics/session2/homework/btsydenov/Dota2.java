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
        System.out.println("\n");
        System.out.println("=====================================");

        // Let's fight a bit
        System.out.println("Bane with Divine Rapier fights against Beastmaster with Desolator.");

        Bane bane = new Bane();
        BeastMaster beastmaster = new BeastMaster();
        DivineRapier divineRapier = new DivineRapier();
        Desolator desolator = new Desolator();
        var roundCounter=1;

        while (true) {
            System.out.println("Let the round number " + roundCounter + " begin!");

            //Bane hits first
            if (isVictimDeadAfterAttack(bane, beastmaster, divineRapier)) {
                break;
            }

            //Beastmaster hits second
            else if (isVictimDeadAfterAttack(beastmaster, bane, desolator)) {
                break;
            }

            System.out.println("The round number " + roundCounter + " didn't define the winner. We're moving on to the next round!");
            System.out.println("---");
            roundCounter++;
        }
    }

    public static boolean isVictimDeadAfterAttack(Dota2Heroes attacker, Dota2Heroes victim, Dota2Items attackersItem) {
        victim.getDamage(attacker.heroDealDamage() + attackersItem.itemBonusDamage());
        System.out.println(attacker.heroName() + " deals " + (attacker.heroDealDamage() + attackersItem.itemBonusDamage()) + " damage to " + victim.heroName() + ".");
        if (victim.heroHealthPoints() < 0) {
            System.out.println(victim.heroName() + " has no HP left.");
            System.out.println(attacker.heroName() + " has won this tough battle!");
            return true;
        } else {
            System.out.println(victim.heroName() + " has " + victim.heroHealthPoints() + " HP left.");
            return false;
        }
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
