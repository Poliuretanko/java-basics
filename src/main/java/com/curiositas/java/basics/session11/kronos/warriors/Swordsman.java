package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Swordsman extends SpecializedWarrior {

    public Swordsman(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Swordsman";
    }
}
