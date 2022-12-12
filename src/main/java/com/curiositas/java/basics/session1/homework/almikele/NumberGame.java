package com.curiositas.java.basics.session1.homework.almikele;

import java.util.Scanner;

/**
 * 1. Read user number
 * 2. Check, if it really a number
 * 3. Assert if equals with number from computer
 * 4. Give user info about right way
 */
public class NumberGame {

    public static final String INTEGER_NUMBER_MESSAGE = "Wrong! You should input integer number!";

    public static void main(String[] args) {
        int lowInterval = 0;
        int highInterval = 10;
        int randomIntFromComputer = (int) (Math.random() * (highInterval + 1) + lowInterval);
        int numberOfTries = 5;
        int triesCounter;
        Scanner scanner = new Scanner(System.in);

        try {
            if (args.length == 2) {
                highInterval = Integer.parseInt(args[0]);
                numberOfTries = Integer.parseInt(args[1]);
            }
        } catch (Exception e) {
            System.out.println(INTEGER_NUMBER_MESSAGE);
        }

        if (lowInterval > highInterval) {
            System.out.println("Wrong! Higher interval should more than lower interval");
        }

        System.out.printf("""
                Let's play a game!\s
                Try to guess, what number computer have?
                Choose INT number from %d to %d.
                You have only %d tries!
                """, lowInterval, highInterval, numberOfTries);

        for (triesCounter = 1; triesCounter <= numberOfTries; triesCounter++) {
            System.out.print("\nYour guess is: ");
            String inputLine = scanner.nextLine();
            try {
                int usersChoice = Integer.parseInt(inputLine);

                if (usersChoice < lowInterval || usersChoice > highInterval) {
                    checkUsersWrongNumber(
                            String.format("You should choose from %s to %s!", lowInterval, highInterval),
                            numberOfTries,
                            triesCounter);
                } else if (usersChoice < randomIntFromComputer) {
                    checkUsersWrongNumber("It's more than yours!", numberOfTries, triesCounter);
                } else if (usersChoice > randomIntFromComputer) {
                    checkUsersWrongNumber("It's less than yours!", numberOfTries, triesCounter);
                } else {
                    System.out.println("Bingo! You won!\nThank you for game! See ya next time!");
                    break;
                }
            } catch (Exception e) {
                checkUsersWrongNumber(INTEGER_NUMBER_MESSAGE, numberOfTries, triesCounter);
            }
        }

        if (triesCounter > numberOfTries) {
            System.out.println("\nSorry, you loose... Try again next time!");
        }
    }

    private static void checkUsersWrongNumber(String x, int numberOfTries, int counter) {
        System.out.printf("\nWrong! %s%n", x);
        System.out.printf("You have %d more tries!%n", numberOfTries - counter);
    }
}
