package com.curiositas.java.basics.session2.examples.almikele.part1;

import com.curiositas.java.basics.session2.examples.almikele.part1.egg.ChickenEgg;
import com.curiositas.java.basics.session2.examples.almikele.part1.spice.Pepper;
import com.curiositas.java.basics.session2.examples.almikele.part1.spice.Salt;
import com.curiositas.java.basics.session2.examples.almikele.part1.vegetable.CherryTomato;
import com.curiositas.java.basics.session2.examples.almikele.part1.vegetable.SweetPepper;

import java.util.ArrayList;
import java.util.List;

import static com.curiositas.java.basics.session2.examples.almikele.part1.egg.ChickenEgg.QUANTITY;

public class Cook {
    public static void main(String[] args) {
        System.out.println("Lets cook some yaishnitsa:");
        ChickenEgg chickenEgg = new ChickenEgg() {
        };
        chickenEgg.brake();
        for (int i = 0; i < QUANTITY; i++) {
            System.out.println(chickenEgg.brake());
        }

        for (String spice : addSpices()) {
            System.out.println(spice);
        }
        for (String vegetable : cutVegetables()) {
            System.out.println(vegetable);
        }
        cutVegetables();
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

    static List<String> cutVegetables() {
        CherryTomato cherryTomato = new CherryTomato() {
            @Override
            public String add() {
                return "add cutted tomatoes";
            }
        };
        SweetPepper sweetPepper = new SweetPepper();
        List<String> vegetables = new ArrayList<>();
        vegetables.add(cherryTomato.cut(3));
        vegetables.add(cherryTomato.add());
        vegetables.add(sweetPepper.add());
        return vegetables;
    }
}
