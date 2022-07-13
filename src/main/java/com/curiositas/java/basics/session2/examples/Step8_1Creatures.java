package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.classes.creatures.*;

import java.util.ArrayList;

/**
 * This program shows you how the inheritance is working.
 * A tip: to watch the hierarchy of classes, open package classes.creatures in the filetree, select all files,
 *        tap right mouse button and choose Diagrams -> Show Diagram
 */
public class Step8_1Creatures {
    public static void main(String[] args) {
        makeCreaturesAndForceThemSayingAndWalking();
    }

    // This static method you can access only from the static context (static method, static class)
    private static void makeCreaturesAndForceThemSayingAndWalking() {
        var creatures = new ArrayList<Creature>();

        var englishman = new Englishman();
        creatures.add(englishman);

        var german = new German();
        creatures.add(german);

        var duck = new Duck();
        creatures.add(duck);

        var pigeon = new Pigeon();
        creatures.add(pigeon);

        creatures.forEach(creature -> System.out.println(creature.say()));
        creatures.forEach(creature -> System.out.println(creature.move()));
    }
}
