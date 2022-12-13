package com.curiositas.java.basics.session1.homework.KosachevAA;

import java.util.Scanner;

public class HomeW_1 {
    public static void main(String[] args) {

        final int VictoryGameNumber = (int)(Math.random()*11);
        boolean EndGame = false;
        Scanner scanner = new Scanner(System.in);

        while (!EndGame){
            if (scanner.hasNextInt()) {
               int CurrentNumber = scanner.nextInt();
               if (CurrentNumber == VictoryGameNumber) {
                   System.out.println("Congratulations! You won this stupid game!");
                   EndGame = true;
               } else if (CurrentNumber > VictoryGameNumber && CurrentNumber < 11 && CurrentNumber > 0) {
                   System.out.println("The entered number is greater than the winning number. Try again");
                   EndGame = false;
               } else if (CurrentNumber < VictoryGameNumber && CurrentNumber < 11 && CurrentNumber > 0) {
                   System.out.println("The entered number is less than the winning number. Try again");
                   EndGame = false;
               } else {
                   System.out.println("Enter a number from 1 ..10 or end the game by entering enough");
                   EndGame = false;
               }

            } else {
                var CurrentLine = scanner.nextLine();
                if (CurrentLine.equals("enough")) {
                    System.out.println("Game Over! Ya-ya-ya");
                    EndGame = true;
                } else if (!CurrentLine.equals("")){
                    System.out.println("Enter a number from 1 ..10 or end the game by entering enough");
                    EndGame = false;
                }
            }
        }
        scanner.close();
    }

}

/*Оффтоп: Для меня осталась пара странностей.
Во первых я так и не понял, почему scanner каким-то образом передает пустую строчку,
если вначале ввести число, а потом enough. Хотя если ввести сразу enough то пустой строки нет.
И вторая кроится в сравнии полученной строки со сканера, если сравнивать полученную строку через оператор ==, то выдает
false при идентичных строках, но через equals сравнивает нормально. Потом на консуле хотел бы разобрать эти моменты.
*/