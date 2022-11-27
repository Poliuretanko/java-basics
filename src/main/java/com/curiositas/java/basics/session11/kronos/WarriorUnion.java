package com.curiositas.java.basics.session11.kronos;

import com.curiositas.java.basics.session11.kronos.attack.Bite;
import com.curiositas.java.basics.session11.kronos.attack.Cut;
import com.curiositas.java.basics.session11.kronos.attack.Shoot;
import com.curiositas.java.basics.session11.kronos.attack.Stab;
import com.curiositas.java.basics.session11.kronos.warriors.*;

import java.util.ArrayList;

public class WarriorUnion {
    public static void main(String[] args) {
        var warriors = new ArrayList<Warrior>();

        warriors.add(new Archer(new Shoot()));
        warriors.add(new Slinger(new Shoot()));
        warriors.add(new Spearman(new Stab()));
        warriors.add(new Swordsman(new Cut()));
        warriors.add((Warrior) new Wolf(new Bite()));
        WarriorAlternativeProphecy crossbowman = new Crossbowman(new Shoot());
        warriors.add(crossbowman);

        warriors.forEach(warrior -> {
            warrior.selfPresent();
            warrior.attack();

        });

        System.out.println("Arrows are over");
        crossbowman.useAlternateAttack(new Cut());
        crossbowman.selfPresent();
        crossbowman.attack();
    }
}
