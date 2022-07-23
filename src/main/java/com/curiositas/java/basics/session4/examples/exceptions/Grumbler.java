package com.curiositas.java.basics.session4.examples.exceptions;

import java.util.Random;

public class Grumbler {
    private final Random random = new Random();

    public void grumble() throws NotEnoughTimeException, EverythingIsWrongException {
        int randomChoice = random.nextInt(1, 2);

        switch (randomChoice) {
            case 1 -> throw new NotEnoughTimeException("Not enough time at all!");
            case 2 -> throw new EverythingIsWrongException("Everything is wrong!");
        }

    }

}
