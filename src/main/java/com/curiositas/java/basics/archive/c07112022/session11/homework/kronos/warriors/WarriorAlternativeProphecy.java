package com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.warriors;

import com.curiositas.java.basics.archive.c07112022.session11.homework.kronos.attack.Attack;

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
