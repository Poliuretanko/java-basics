package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly;

public class NoFlyBehavior implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("No fly");
    }
}
