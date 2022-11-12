package com.curiositas.java.basics.session11.examples.ducks.inheritance.version6;

public class DecoyDuck extends NoFlyingDuck {
    @Override
    public void quack() {
        System.out.println("Silence");
    }

    @Override
    public String getName() {
        return "Decoy";
    }
}
