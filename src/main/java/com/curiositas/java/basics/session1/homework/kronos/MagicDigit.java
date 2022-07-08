package com.curiositas.java.basics.session1.homework.kronos;

/*
Write a program that chooses a number from 1 to 10 using java.util.Random, and the user should guess this number.
The user can input a number and the program responds to him whether his number is greater or less than desired.
If the user guessed right, the program reported him a congratulations message and ended.
 */

import java.util.Random;
import java.util.Scanner;

public class MagicDigit{
    private static final int maximalRandomNumber = 10;
    private static final int minimalRandomNumber = 1;
    private static final Random random = new Random();
    private static int generateRandomNumber() {
        return random.nextInt(minimalRandomNumber,maximalRandomNumber);
    }

    private static boolean checkUserGuess (int userGuess, int magicNumber){
        if (userGuess > magicNumber)  {
            System.out.println("Your number is greater than desired!");
            return false;
        } else if (userGuess < magicNumber) {
            System.out.println("Your number is less than desired!");
            return false;
        } else {
            System.out.println("Your win!!");
            return true;
        }
    }

    public static void main(String[] args)throws InterruptedException {
        int magicNumber = generateRandomNumber();
        Scanner scan = new Scanner(System.in);
        boolean newRound = false;
        while (true) {
            if (newRound) {
                magicNumber = generateRandomNumber();
                }
            System.out.print("Guess the number from 1 to 10: ");
            int userGuess = scan.nextInt(maximalRandomNumber);
            if (!((userGuess <= maximalRandomNumber) && (userGuess >= minimalRandomNumber)) ){
                System.out.println("Your number is out of range! Choose another one!");
                continue;
            }
            if (checkUserGuess(userGuess,magicNumber)) {
                System.out.println("Would you like to continue? Please answer 'yes' or 'no': ");
                String userAnswer = scan.next();
                if (userAnswer.equals("yes")){
                    newRound = true;
                    System.out.println("Next round!!");
                } else {
                    System.out.print("Goodbay!");
                    break;
                }
            }

        }

    }

}
