package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public class Crossbowman extends WarriorAlternativeProphecy {

    public Crossbowman(Attack attack) {
        super(attack);
    }

    @Override
    public String getName() {
        return "Crossbowman";
    }
}
