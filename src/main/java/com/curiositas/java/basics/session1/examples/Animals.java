package com.curiositas.java.basics.session1.examples;

import com.curiositas.java.basics.session1.examples.classes.creatures.Animal;
import com.curiositas.java.basics.session1.examples.classes.creatures.Panda;

import java.util.ArrayList;

public class Animals {
    public static void main (String[] args){ WalkingAnimals();}

    private static void WalkingAnimals(){
        var animalsVar = new ArrayList<Animal>();

        var panda = new Panda();
        System.out.println(panda.walk());
    }

}
