package com.curiositas.java.basics.session11.examples.ducks.inheritance.version6;

public class ModelDuck extends NoFlyingDuck {

    private boolean flyWithRocket = false;

    @Override
    public void quack() {
        System.out.println("Silence");
    }

    @Override
    public void fly() {
        if (isFlyWithRocket()) {
            System.out.println("Rocket fly!");
        } else {
            super.fly();
        }
    }

    @Override
    public String getName() {
        return "Model";
    }

    public boolean isFlyWithRocket() {
        return flyWithRocket;
    }

    public void setFlyWithRocket(boolean flyWithRocket) {
        this.flyWithRocket = flyWithRocket;
    }
}
