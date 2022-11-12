package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.inheritance.version1.*;

import java.util.ArrayList;

public class Step40_DuckSimulator {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new PacificBlackDuck());
        ducks.add(new RedheadDuck());

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });
    }
}
