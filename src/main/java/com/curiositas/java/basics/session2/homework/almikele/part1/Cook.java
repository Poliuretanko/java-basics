package com.curiositas.java.basics.session2.homework.almikele.part1;

import com.curiositas.java.basics.session2.homework.almikele.part1.egg.ChickenEgg;
import com.curiositas.java.basics.session2.homework.almikele.part1.spice.Pepper;
import com.curiositas.java.basics.session2.homework.almikele.part1.spice.Salt;
import com.curiositas.java.basics.session2.homework.almikele.part1.vegetable.SweetPepper;
import com.curiositas.java.basics.session2.homework.almikele.part1.vegetable.Tomato;

import java.util.ArrayList;
import java.util.List;

public class Cook {
    public static final int EGGS_QUANTITY = 3;
    public static final String PREFIX = "- ";

    public static void main(String[] args) {
        System.out.println("Lets cook some yaishnitsa:");
        for (int i = 1; i <= EGGS_QUANTITY; i++) {
            ChickenEgg chickenEgg = new ChickenEgg();
            System.out.println(PREFIX + chickenEgg.brake() + " with code: " + chickenEgg.hashCode());
            System.out.println(PREFIX + chickenEgg.add() + " with code: " + chickenEgg.hashCode());
        }

        for (String spice : addSpices()) {
            System.out.println(PREFIX + spice);
        }
        for (String vegetable : cutAndAddVegetables()) {
            System.out.println(PREFIX + vegetable);
        }
        cutAndAddVegetables();
        System.out.println("Fry!");
        System.out.println("Bon appetite!");
    }


    static List<String> addSpices() {
        Salt salt = new Salt();
        Pepper pepper = new Pepper();
        List<String> spices = new ArrayList<>();
        spices.add(salt.add());
        spices.add(pepper.add());
        return spices;
    }

    static List<String> cutAndAddVegetables() {
        Tomato tomato = new Tomato();
        SweetPepper sweetPepper = new SweetPepper();
        List<String> vegetables = new ArrayList<>();
        vegetables.add(tomato.cut());
        vegetables.add(tomato.add("tomato"));
        vegetables.add(sweetPepper.cut());
        vegetables.add(sweetPepper.add("sweet pepper"));
        return vegetables;
    }
}
