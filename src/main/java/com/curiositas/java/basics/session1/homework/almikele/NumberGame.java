package com.curiositas.java.basics.session1.homework.almikele;

import java.util.Scanner;

/**
 * It is a number game, that check users number with computers generated number.
 * You can change high interval value or/and number of users tries. <br/> <br/>
 * Algorithm:
 * <ol>
 * <li>Read user number
 * <li>Check, if it really a number
 * <li>Assert if equals with number from computer
 * <li>Give user info about right way
 * <ol/>
 */
public class NumberGame {
    private static final int LOW_INTERVAL = 0;
    public static final String INTEGER_NUMBER_MESSAGE = "Wrong! You should input integer number!";

    public static void main(String[] args) {
        int[] params = {10, 5};

        fetchParamsFromRunConfig(args, params);

        int highInterval = params[0];
        int numberOfTries = params[1];
        int randomIntFromComputer = (int) (Math.random() * (highInterval + 1) + LOW_INTERVAL);

        int triesCounter;

        Scanner scanner = new Scanner(System.in);

        if (LOW_INTERVAL > highInterval) {
            System.out.println("Wrong! Higher interval should more than lower interval");
        }

        System.out.printf("""
                Let's play a game!\s
                Try to guess, what number computer have?
                Choose INT number from %d to %d.
                You have only %d tries!
                """, LOW_INTERVAL, highInterval, numberOfTries);

        triesCounter = checkUserNumber(randomIntFromComputer, scanner, highInterval, numberOfTries);

        if (triesCounter > numberOfTries) {
            System.out.println("\nSorry, you loose... Try again next time!");
        }
    }

    private static int checkUserNumber(int randomIntFromComputer, Scanner scanner, int highInterval, int numberOfTries) {
        int triesCounter;
        for (triesCounter = 1; triesCounter <= numberOfTries; triesCounter++) {
            System.out.print("\nYour guess is: ");
            String inputLine = scanner.nextLine();
            try {
                int usersChoice = Integer.parseInt(inputLine);

                if (usersChoice < LOW_INTERVAL || usersChoice > highInterval) {
                    checkUsersWrongNumber(
                            String.format("You should choose from %s to %s!", LOW_INTERVAL, highInterval),
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
            } catch (NumberFormatException e) {
                checkUsersWrongNumber(INTEGER_NUMBER_MESSAGE, numberOfTries, triesCounter);
            }
        }
        return triesCounter;
    }

    private static void fetchParamsFromRunConfig(String[] args, int[] params) {
        try {
            if (args.length == 2) {
                params[0] = Integer.parseInt(args[0]);
                params[1] = Integer.parseInt(args[1]);
            }
        } catch (NumberFormatException e) {
            System.out.println(INTEGER_NUMBER_MESSAGE);
        }
    }

    private static void checkUsersWrongNumber(String x, int numberOfTries, int counter) {
        System.out.printf("\nWrong! %s%n", x);
        System.out.printf("You have %d more tries!%n", numberOfTries - counter);
    }
}
