package com.curiositas.java.basics.session2.examples;

import java.util.Scanner;

public class Step14_2EncapsulationInMethods {
    public static void main(String[] args) {
        writeToConsole("Input your name");
        var userName = readLineFromConsole();

        writeToConsole("Input the current hour");
        var currentHourAsString = readLineFromConsole();
        int currentHour = Integer.parseInt(currentHourAsString);

        var greeting = defineGreetingMessage(userName, currentHour);
        writeToConsole(greeting);
    }

    private static String defineGreetingMessage(String userName, int currentHour) {
        String greeting;
        if (currentHour > 5 && currentHour <= 11) {
            greeting = "Good morning, " + userName;
        } else if (currentHour > 11 && currentHour <= 18) {
            greeting = "Good afternoon, " + userName;
        } else if (currentHour > 18 && currentHour <= 21) {
            greeting = "Good evening, " + userName;
        } else {
            greeting = "Good night, " + userName;
        }
        return greeting;
    }

    private static void writeToConsole(String message) {
        System.out.println(message);
    }

    private static String readLineFromConsole() {
        var scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
