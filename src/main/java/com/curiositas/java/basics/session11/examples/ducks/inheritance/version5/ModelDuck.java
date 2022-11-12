package com.curiositas.java.basics.session11.examples.ducks.inheritance.version5;

public class ModelDuck extends NoFlyingDuck {
    @Override
    public void quack() {
        System.out.println("Silence");
    }

    @Override
    public String getName() {
        return "Model";
    }
}
