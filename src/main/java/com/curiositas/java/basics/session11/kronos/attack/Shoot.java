package com.curiositas.java.basics.session11.kronos.attack;

public class Shoot implements Attack {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public void attack() {
        System.out.println("I shoot enemy!!");
    }

}
