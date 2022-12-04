package com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.warriors;

import com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.attack.Attack;

public class Archer extends SpecializedWarrior {

    public Archer(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Archer";
    }
}
