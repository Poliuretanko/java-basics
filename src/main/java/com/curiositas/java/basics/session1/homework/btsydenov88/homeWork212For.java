package com.curiositas.java.basics.session1.homework.btsydenov88;

import java.util.Random;
import java.util.Scanner;

public class homeWork212For {

    // These are just the counter and the limit for while loop to catch a moment when it's time to print dumbAss message
    public static int dumbCounter = 0;
    public static final int dumbAssLimit = 3;

    public static final int minRandomValue = 1;
    public static final int maxRandomValue = 10;

    // The computer's choice is an integer within minRandomValue and maxRandomValue
    public static Random random = new Random();
    public static final int computerChoice = minRandomValue + random.nextInt(maxRandomValue);

    /**
     * Compares 2 values and informs the user if the value1 is less or greater than value2.
     * @return true - if the values are equal;
     * false - if the values are not equal.
     */
    public static boolean isInputEqualRandom(int value1, int value2) {
        if (value1 == value2) {
            System.out.println("Congratulations! You got it right!");
            return true;
        } else if (value1 < value2){
            System.out.println("Wrong... You guess is less than computer's chosen number. Try again please.");
            return false;
        } else {
            System.out.println("Wrong... You guess is greater than computer's chosen number. Try again please.");
            return false;
        }
    }

    /**
     * Checks if the dumbAssCounter reached the limit. Corresponding messages are printed.
     * @return true - if the dumbAss limit is reached;
     * false - if not reached
     */
    public static boolean isDumbAss(int dumbAssCounter, int dumbAssLimit) {
        if (dumbAssCounter == dumbAssLimit) {
            System.out.println("You dumb ass! You should've chosen an integer number in the range from 1 to 10! Not a word! Not anything else! Just a number within 1 and 10!");
            return true;
        } else {
            System.out.println("It should be an integer number between 1 and 10. Try again please");
            return false;
        }

    }

    /**
     * Verifies if the input value is within the specified range min - max
     * @return true - if the input is within the range;
     * false - if the input is not within the range
     */
    public static boolean isInputWithinRange(int min, int max, int input) {
        return (input >= min && input <= max);
    }

    /**
     * Verifies if a string can be converted into an integer.
     * @return  true - if convertable;
     * false - if not convertable
     */
    public static boolean isInteger(String string) {
        int intValue;

        if(string == null || string.equals("")) {
            return false;
        }

        try {
            intValue = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException ignore) {
            // do nothing
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("Let's play a game! Choose some random number within the range 0-10");

        // Let's play the game.
        while (true) {

            // Read the user's choice
            Scanner scanner = new Scanner(System.in);
            var inputLine=scanner.nextLine();

            if (isInteger(inputLine)) {
                var convertedInputLine = Integer.parseInt(inputLine);
                if (isInputWithinRange(minRandomValue, maxRandomValue, convertedInputLine)){
                    if (isInputEqualRandom(convertedInputLine, computerChoice)) {
                        break;
                    }
                } else {
                    dumbCounter++;
                    if (isDumbAss(dumbCounter, dumbAssLimit)) {
                        break;
                    }
                }
            } else {
                dumbCounter++;
                if (isDumbAss(dumbCounter, dumbAssLimit)) {
                    break;
                }
            }
        }
    }
}
