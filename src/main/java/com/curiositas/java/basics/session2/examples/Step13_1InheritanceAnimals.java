package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.inheritance.animals.*;

import java.util.ArrayList;

public class Step13_1InheritanceAnimals {
    public static void main(String[] args) throws Exception {
        var wolf = new Wolf();
        var arcticWolf = new ArcticWolf();
        var dog = new Dog();
        var cat = new Cat();
        var leon = new Leon();

        wolf.joinFlock();
        arcticWolf.joinFlock();
        dog.joinFlock();

        cat.huntingInNight();
        leon.huntingInNight();

        var animals = new ArrayList<Animal>();
        animals.add(wolf);
        animals.add(arcticWolf);
        animals.add(dog);
        animals.add(cat);
        animals.add(leon);

        animals.forEach(animal -> {
            String animalSoundMessage = animal.getName() + " make " + animal.sound();
            System.out.println(animalSoundMessage);
        });
    }
}
