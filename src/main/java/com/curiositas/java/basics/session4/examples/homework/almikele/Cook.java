package com.curiositas.java.basics.session4.examples.homework.almikele;

import com.curiositas.java.basics.session4.examples.homework.almikele.egg.ChickenEgg;
import com.curiositas.java.basics.session4.examples.homework.almikele.egg.Egg;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.BlackPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.spice.Salt;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.SweetPepper;
import com.curiositas.java.basics.session4.examples.homework.almikele.vegetable.Tomato;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Cook {
    public static final int EGGS_QUANTITY = 3;
    public static final String SIMPLE_CHOICE = "simple";
    public static final String FULL_CHOICE = "full";

    public static void main(String[] args) {
        System.out.printf("""
                Lets cook some simple yaishnitsa.\s
                 Choose which you want?\s
                 Type %s or %s to choose your own one:\s
                """, SIMPLE_CHOICE, FULL_CHOICE);
        Scanner scanner = new Scanner(System.in);
        String choice = scanner.nextLine();
        if (!SIMPLE_CHOICE.equals(choice) && !FULL_CHOICE.equals(choice)) {
            throw new IllegalArgumentException("Sorry, we can't cook this type of yaishnitsa: " + choice);
        }

        Yaishnitsa simpleYaishnitsa = yaishnitsa();

        if (FULL_CHOICE.equals(choice)) {
            System.out.println("Now we add some vegetables:");
            yaishnitsa(simpleYaishnitsa, tomato(), sweetPepper());
        }
        System.out.println("Fry!");
        System.out.println("Bon appetite!");
    }

    private static Yaishnitsa yaishnitsa() {
        System.out.println("Let's do some simple yaishnitsa: ");
        Yaishnitsa yaishnitsa = new Yaishnitsa();

        yaishnitsa.setEggs(eggs(new ChickenEgg()));
        yaishnitsa.setSalt(salt());
        yaishnitsa.setBlackPepper(blackPepper());
        return yaishnitsa;
    }

    private static void yaishnitsa(Yaishnitsa yaishnitsa, Tomato tomato, SweetPepper sweetPepper) {
        yaishnitsa.setTomato(tomato);
        yaishnitsa.setSweetPepper(sweetPepper);
    }

    private static Set<Egg> eggs(Egg egg) {
        Set<Egg> eggs = new HashSet<>();
        for (int i = 1; i <= EGGS_QUANTITY; i++) {
            try {
                egg.brake();
            } catch (IllegalStateException e) {
                System.out.println("Something wrong with egg: " + e.getMessage());
            }
            eggs.add(egg);
            System.out.println("add an broken egg");
        }
        return eggs;
    }

    private static BlackPepper blackPepper() {
        System.out.println("add pepper");
        return new BlackPepper();
    }

    private static Salt salt() {
        System.out.println("add salt");
        return new Salt();
    }

    static Tomato tomato() {
        Tomato tomato = new Tomato();
        tomato.cut();
        System.out.println("add cut tomato");
        return tomato;
    }

    static SweetPepper sweetPepper() {
        SweetPepper sweetPepper = new SweetPepper();
        sweetPepper.cut();
        System.out.println("add cut sweet pepper");
        return sweetPepper;
    }
}
