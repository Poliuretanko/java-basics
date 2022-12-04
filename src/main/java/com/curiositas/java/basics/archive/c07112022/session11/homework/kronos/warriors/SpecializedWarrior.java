package com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.warriors;

import com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.attack.Attack;

public abstract class SpecializedWarrior implements Warrior {

    private final Attack attack;

    public SpecializedWarrior(Attack attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {attack.attack();}
}
