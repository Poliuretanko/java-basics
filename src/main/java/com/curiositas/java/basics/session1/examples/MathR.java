/*package com.curiositas.java.basics.session1.examples;

import java.util.Scanner;
import java.lang.Math;

public class MathR {
    public static void main(String[] args) {
        mathLogic();
        System.out.println("Хотите попробовать снова? (yes/no)");
        Scanner input = new Scanner(System.in);
        String answer = input.nextLine();
        while (input.nextLine.equals("yes")) {
            mathLogic();
        }
            System.out.println("Отправляйтесь лесом");

        }
        public static void mathLogic() {
            int UnknownNumber, UserNumber, TrysCount = 0;
            Scanner input = new Scanner(System.in);
            System.out.println("ЗАДАЧА: Угадать число (от 0 до 100).");
            UnknownNumber = (int) Math.floor(Math.random() * 100);

            TrysCount++;
            System.out.print("Введите ваше число: ");
            UserNumber = input.nextInt();


            /* else if (UserNumber < UnknownNumber) System.out.println("Моё число больше.");*/
        /*    if (UserNumber > UnknownNumber || UserNumber < UnknownNumber) {
                for (int counter = 10; counter > 0; --counter) {
                    if (UserNumber > UnknownNumber) {
                        System.out.println("Моё число меньше. Осталось попыток " + counter);
                        Scanner newScanTw = new Scanner(System.in);
                        int scannerTwo = newScanTw.nextInt();
                        UserNumber = scannerTwo;
                    } else if (UserNumber < UnknownNumber) {
                        System.out.println("Моё число больше. Осталось попыток " + counter);
                        Scanner newScanThr = new Scanner(System.in);
                        int scannerThr = newScanThr.nextInt();
                        UserNumber = scannerThr;
                    }
                }

                while (UserNumber != UnknownNumber) ;
                System.out.println("Количество попыток: " + TrysCount);
            ввс}

            System.out.println("Вы угадали!");
        }
    }
    */