package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.quack;

public class SqueakBehavior implements SoundBehavior {
    @Override
    public void performSound() {
        System.out.println("Squeak");
    }
}
