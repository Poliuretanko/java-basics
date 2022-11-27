package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Spearman extends SpecializedWarrior {

    public Spearman(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Spearman";
    }
}
