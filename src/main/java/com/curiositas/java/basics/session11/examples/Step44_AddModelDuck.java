package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.inheritance.version5.*;

import java.util.ArrayList;

public class Step44_AddModelDuck {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new PacificBlackDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());
        ducks.add(new ModelDuck());

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });
    }
}
