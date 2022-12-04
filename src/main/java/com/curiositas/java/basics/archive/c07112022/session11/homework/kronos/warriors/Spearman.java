package com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.warriors;

import com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.attack.Attack;

public class Spearman extends SpecializedWarrior {

    public Spearman(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Spearman";
    }
}
