package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.inheritance.version6.*;

import java.util.ArrayList;

public class Step45_MakeModelDuckFlyWithARocket {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck());
        ducks.add(new PacificBlackDuck());
        ducks.add(new RedheadDuck());
        ducks.add(new RubberDuck());
        ducks.add(new DecoyDuck());
        ModelDuck modelDuck = new ModelDuck();
        ducks.add(modelDuck);

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });

        modelDuck.setFlyWithRocket(true);
        modelDuck.selfPresent();
        modelDuck.quack();
        modelDuck.fly();
    }
}
