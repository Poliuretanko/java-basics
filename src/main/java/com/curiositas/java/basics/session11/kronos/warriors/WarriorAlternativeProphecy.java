package com.curiositas.java.basics.session11.kronos.warriors;

import com.curiositas.java.basics.session11.kronos.attack.Attack;

public abstract class WarriorAlternativeProphecy implements Warrior{
    private Attack attack;

    public WarriorAlternativeProphecy(Attack attack) {
        this.attack = attack;
    }

    @Override
    public void attack() {attack.attack();}

    public void useAlternateAttack(Attack attack){
        this.attack = attack;
    }

}
