package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.duck;

import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly.FlyBehavior;
import com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack.SoundBehavior;

public abstract class MutableDuck implements Duck {
    private FlyBehavior flyBehavior;
    private SoundBehavior soundBehavior;

    public MutableDuck(FlyBehavior flyBehavior, SoundBehavior soundBehavior) {
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

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setSoundBehavior(SoundBehavior soundBehavior) {
        this.soundBehavior = soundBehavior;
    }
}
