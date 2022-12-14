package com.curiositas.java.basics.session1.homework.AgafonovPavel;

import java.util.Scanner;

public class MagickNumber {
    public static void main(String[] args) {

        int countAttempt = 5;
        final int computerTurn = 1 + (int) Math.random() * 10; // 1+Math.random() позвоялет избавиться от попадения 0 в выборку
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zdorovo, Mechenyy.\nI saved you and I will not play nobility: \nyou complete a couple of tasks for me - and we are even. \nGuess the number from 1 to 10");
        System.out.println("The computer guessed your turn");

        while (countAttempt > 0) {
            int CurrentNumber = scanner.nextInt(); // ввод даннх пользователем
            if (CurrentNumber > 0 && CurrentNumber < 11) { // проверка на корректность введенных данных
                if (CurrentNumber == computerTurn) {
                    System.out.println("You win. Number " + computerTurn + " right");
                    break;
                } else if (CurrentNumber > computerTurn) {
                    System.out.println("Your number is more than the computer guessed");
                    countAttempt--;
                } else {
                    System.out.println("Your number is less than the computer guessed.");
                    countAttempt--;
                }
            } else {
                System.out.println("Read more carefully from 1 to 10");
                break;
            }
        }
    }
}
