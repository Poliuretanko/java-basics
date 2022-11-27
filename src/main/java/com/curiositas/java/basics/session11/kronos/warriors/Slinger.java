package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Slinger extends SpecializedWarrior {

    public Slinger(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Slinger";
    }
}
