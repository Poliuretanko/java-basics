package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Archer extends SpecializedWarrior {

    public Archer(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Archer";
    }
}
