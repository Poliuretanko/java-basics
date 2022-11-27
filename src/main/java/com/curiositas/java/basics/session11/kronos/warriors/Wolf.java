package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Wolf implements Attack{
    public Wolf(Attack attack) {
        super();
    }

    @Override
    public String getName() {
        return "Wolf";
    }

    @Override
    public void attack() {

    }
}
