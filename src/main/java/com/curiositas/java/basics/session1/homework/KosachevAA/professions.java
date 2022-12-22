package com.curiositas.java.basics.session1.homework.KosachevAA;


import com.curiositas.java.basics.session1.homework.KosachevAA.classes.Civil;
import com.curiositas.java.basics.session1.homework.KosachevAA.classes.Military;
import com.curiositas.java.basics.session1.homework.KosachevAA.classes.ProfessionInfo;

import java.util.ArrayList;

public class professions {
    public static void main(String[] args) {
        choiceOfProfession();
    }

    // This static method you can access only from the static context (static method, static class)
    private static void choiceOfProfession() {
        var choiceProfession = new ArrayList<ProfessionInfo>();

        var civil = new Civil();
        choiceProfession.add(civil);

        var military = new Military();
        choiceProfession.add(military);

        choiceProfession.forEach(creature -> System.out.println(creature.getProfessionInfo()));

    }
}
