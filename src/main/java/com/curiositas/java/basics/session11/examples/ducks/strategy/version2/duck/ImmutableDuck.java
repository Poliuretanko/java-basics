package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck;

import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.FlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SoundBehavior;

public abstract class ImmutableDuck implements Duck {
    private final FlyBehavior flyBehavior;
    private final SoundBehavior soundBehavior;

    public ImmutableDuck(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
        this.flyBehavior = flyBehavior;
        this.soundBehavior = soundBehavior;
    }

    @Override
    public void quack() {
        soundBehavior.performSound();
    }

    @Override
    public void fly() {
        flyBehavior.performFly();
    }
}
