package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.inheritance.version3.*;

import java.util.ArrayList;

public class Step42_AddRubberDuck {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new PacificBlackDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });
    }
}
