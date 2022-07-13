package com.curiositas.java.basics.session1.examples;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        // This variable is an object of the Scanner class. It helps us to read what a user has written to the console
        Scanner scanner = new Scanner(System.in);

        // Invite a user to the game
        System.out.println("What is the season right now?");

        // A program always choose a rock :-)
        //var computerChoice = "rock";

        // Read user's choice
        String inputLine = scanner.nextLine();

        // Let's play the game
        switch (inputLine) {
            case "winter" -> System.out.println("Oh, it’s a really cold");
            case "summer" -> System.out.println("“Nice weather” " +   "!");
            //case "apocalypse" -> System.out.println("We screwed!");
            default -> System.out.println(" It's apocalypse! We screwed");
        }
    }

}
