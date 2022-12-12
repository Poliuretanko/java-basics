package com.curiositas.java.basics.session1.homework.dinara;

import java.util.Scanner;
import java.util.Random;
public class GuessNumer {

    public static void main(String[] args) {

        // This variable is an object of the Scanner class. It helps us to read what a user has written to the console
        Scanner scanner = new Scanner(System.in);

        //initialize random number generator
        Random random = new Random();

        // Invite a user to the game
        System.out.println("Let's play a game! Choose number between 1 to 10");

        // A program will choose number between 1 to 10
        int computerChoice = 1 + random.nextInt(10);

        // Read user's choice
        int inputNumber = scanner.nextInt();

       if (inputNumber == 0 || inputNumber >= 11 ){
           throw new ArithmeticException("Invalid number. Plese enter value between 1 to 10");
       } else if (computerChoice > inputNumber){
           System.out.println("computerChoice is greater than yours");
           System.out.println("The computerChoice is " + computerChoice);
       } else if (computerChoice < inputNumber){
           System.out.println("computerChoice is less than yours");
           System.out.println("The computerChoice is " + computerChoice);
       } else {
           System.out.println("computerChoice is less than yours");
           System.out.println("The computerChoice is " + computerChoice);
       }
    }
}