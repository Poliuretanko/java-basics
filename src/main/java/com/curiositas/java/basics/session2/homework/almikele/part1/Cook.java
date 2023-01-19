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

    public static void main(String[] args) {
        System.out.println("Lets cook some yaishnitsa");
        Yaishnitsa yaishnitsa = new Yaishnitsa();

        addEggs(yaishnitsa);
        addSalt(yaishnitsa);
        addPepper(yaishnitsa);
        addTomato(yaishnitsa);
        addSweetPepper(yaishnitsa);

        System.out.println("Fry!");
        System.out.println("Bon appetite!");
    }

    private static void addEggs(Yaishnitsa yaishnitsa) {
        List<ChickenEgg> eggs = new ArrayList<>();
        for (int i = 1; i <= EGGS_QUANTITY; i++) {
            ChickenEgg chickenEgg = new ChickenEgg();
            chickenEgg.brake(chickenEgg.isBroken);
            eggs.add(chickenEgg);
            System.out.println("add an broken egg");
        }
        yaishnitsa.setEggs(eggs);
    }

    private static void addPepper(Yaishnitsa yaishnitsa) {
        yaishnitsa.setPepper(new Pepper());
        System.out.println("add pepper");
    }

    private static void addSalt(Yaishnitsa yaishnitsa) {
        yaishnitsa.setSalt(new Salt());
        System.out.println("add salt");
    }

    static void addTomato(Yaishnitsa yaishnitsa) {
        Tomato tomato = new Tomato();
        tomato.cut(tomato.isCut);
        yaishnitsa.setTomato(tomato);
        System.out.println("add cut tomato");
    }

    static void addSweetPepper(Yaishnitsa yaishnitsa) {
        SweetPepper sweetPepper = new SweetPepper();
        sweetPepper.cut(sweetPepper.isCut);
        yaishnitsa.setSweetPepper(sweetPepper);
        System.out.println("add cut sweet pepper");
    }
}
