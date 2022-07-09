package com.curiositas.java.basics.session2.examples;

import java.util.Scanner;

public class Step14_1NoEncapsulation {
    public static void main(String[] args) {
        System.out.println("Input your name");
        var scanner = new Scanner(System.in);
        var userName = scanner.nextLine();
        System.out.println("Input the current hour");
        var currentHourAsString = scanner.nextLine();
        var currentHour = Integer.parseInt(currentHourAsString);
        if (currentHour > 5 && currentHour <= 11) {
            System.out.println("Good morning, " + userName);
        } else if (currentHour > 11 && currentHour <= 18) {
            System.out.println("Good afternoon, " + userName);
        } else if (currentHour > 18 && currentHour <= 21) {
            System.out.println("Good evening, " + userName);
        } else {
            System.out.println("Good night, " + userName);
        }
    }
}
