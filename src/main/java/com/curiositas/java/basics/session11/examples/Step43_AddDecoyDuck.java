package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.inheritance.version4.*;

import java.util.ArrayList;

public class Step43_AddDecoyDuck {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new PacificBlackDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });
    }
}
