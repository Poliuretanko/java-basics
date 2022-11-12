package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack;

public class SilenceBehavior implements SoundBehavior {
    @Override
    public void performSound() {
        System.out.println("Silence");
    }
}
