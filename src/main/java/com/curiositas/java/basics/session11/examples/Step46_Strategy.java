package com.curiositas.java.basics.session11.examples;

import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck.*;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.NoFlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.RocketFlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.WingsFlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.QuackBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SilenceBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SqueakBehavior;

import java.util.ArrayList;

public class Step46_Strategy {
    public static void main(String[] args) {
        var ducks = new ArrayList<Duck>();

        ducks.add(new MallardDuck(new WingsFlyBehavior(), new QuackBehavior()));
        ducks.add(new PacificBlackDuck(new WingsFlyBehavior(), new QuackBehavior()));
        ducks.add(new RedheadDuck(new WingsFlyBehavior(), new QuackBehavior()));
        ducks.add(new RubberDuck(new NoFlyBehavior(), new SqueakBehavior()));
        ducks.add(new DecoyDuck(new NoFlyBehavior(), new SilenceBehavior()));
        MutableDuck modelDuck = new ModelDuck(new NoFlyBehavior(), new SilenceBehavior());
        ducks.add(modelDuck);

        ducks.forEach(duck -> {
            duck.selfPresent();
            duck.quack();
            duck.fly();
        });

        modelDuck.setFlyBehavior(new RocketFlyBehavior());
        modelDuck.selfPresent();
        modelDuck.quack();
        modelDuck.fly();
    }
}
