package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public abstract class SpecializedWarrior implements Warrior {

    private final Attack attack;

    public SpecializedWarrior(Attack attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {attack.attack();}
}
