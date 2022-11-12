package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck;


import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.FlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SoundBehavior;

public class DecoyDuck extends MutableDuck {

    public DecoyDuck(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
        super(flyBehavior, soundBehavior);
    }

    @Override
    public String getName() {
        return "Decoy";
    }
}
