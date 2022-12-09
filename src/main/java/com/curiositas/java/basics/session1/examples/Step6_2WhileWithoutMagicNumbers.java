package com.curiositas.java.basics.session1.examples;

import java.util.Random;

public class Step6_2WhileWithoutMagicNumbers {
    private final static int maximumTimes = 3; // We will roll dice only 3 times in order not to get tired
    private final static int minimalDiceResult = 1; // It's a minimal possible value of the dice
    private final static int maximumDiceResult = 6; // It's a maximal possible value of the dice

    public static void main(String[] args) {

        var time = 0;

        var randomizer = new Random();

        System.out.println("Let's roll the dice 3 times!");

        // while is another option to make a loop
        while (time < maximumTimes) {
            time++;
            // roll the dice
            var diceResult = randomizer.nextInt(minimalDiceResult, maximumDiceResult);

            // show the result to the user
            System.out.println(time + " time rolling the dice! The result is " + diceResult);
        }
    }
}
