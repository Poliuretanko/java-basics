package com.curiositas.java.basics.session11.examples.ducks.strategy.version2.fly;

public class WingsFlyBehavior implements FlyBehavior {
    @Override
    public void performFly() {
        System.out.println("Fly with wings");
    }
}
