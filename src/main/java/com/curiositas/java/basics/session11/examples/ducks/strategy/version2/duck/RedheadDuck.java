package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck;

import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.FlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SoundBehavior;

public class RedheadDuck extends ImmutableDuck {

    public RedheadDuck(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
        super(flyBehavior, soundBehavior);
    }

    @Override
    public String getName() {
        return "Redhead";
    }
}
