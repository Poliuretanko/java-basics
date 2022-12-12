package com.curiositas.java.basics.session1.homework.btsydenov88;

import java.util.Random;
import java.util.Scanner;

public class homeWork212For {
    /**
     * It just prints a dumbAss message
     */
    public static void printDumbAssMessage() {
        System.out.println("You dumb ass! You should've chosen an integer number in the range from 1 to 10! Not a word! Not anything else! Just a number between 1 and 10!");
    }

    /**
     * Verifies if a string can be converted into an integer.
     * @param string
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
        } catch (NumberFormatException e) {
            System.out.println("Something went wrong.");
        }
        return false;
    }

    public static void main(String[] args) {

        // This is just a counter for while loop
        var counter = 0;

        // This is just a counter for while loop to catch a moment when it's time to print dumbAss message
        var dumbCounter = 0;

        // Invite a user to the game
        System.out.println("Let's play a game! Choose some random number within the range 0-10");

        // initiate Random() method
        Random random = new Random();

        // Let's play the game. The counter is supposed to be incremented when the number is correctly guessed or the dumbAss limit is reached.
        while (counter < 1) {

            // Let the user input something
            Scanner scanner = new Scanner(System.in);

            // The computer's choice is an integer between 1 and 10
            var computerChoice = random.nextInt(10) + 1;

            // Read the user's choice
            var inputLine=scanner.nextLine();

            // Verify if the input from the user is an integer
            if (!isInteger(inputLine)) {

                dumbCounter++;
                if (dumbCounter != 3) {
                    System.out.println("It should be an integer number between 1 and 10. Try again please");
                } else {
                    printDumbAssMessage();
                    counter++;
                }
            } else {

                // convert the input to integer and check if it was guessed right
                var convertedInputLine = Integer.parseInt(inputLine);

                // verify if the input is within 1-10
                if (convertedInputLine < 1 || convertedInputLine > 10) {
                    dumbCounter++;
                    if (dumbCounter != 3) {
                        System.out.println("Sorry but your chosen number is not within 1-10. Choose an integer number within 1-10.");
                    } else {
                        printDumbAssMessage();
                        counter++;
                    }
                }

                // verify if the user's guess is right
                if (convertedInputLine == computerChoice) {
                    System.out.println("Congratulations! You got it right!");
                    counter++;
                } else {
                    System.out.println("Wrong... Try again please.");
                }
            }
        }

    }
}
