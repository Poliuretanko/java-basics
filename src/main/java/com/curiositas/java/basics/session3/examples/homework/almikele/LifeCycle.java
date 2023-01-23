package com.curiositas.java.basics.session3.examples.homework.almikele;

import java.util.Random;

public class LifeCycle {
    public static void main(String[] args) {
        int howMuchMoneyIHave = new Random().nextInt(0, 1000);
        System.out.printf("You have %d money%n", howMuchMoneyIHave);

        Jeans jeans = new Jeans();
        howMuchMoneyIHave = jeans.buying(howMuchMoneyIHave);
        System.out.printf("Now you have %d money%n", howMuchMoneyIHave);

        wear(jeans);
    }

    private static void wear(Jeans jeans) {
        int washCount = 0;
        for (int daysOfWear = 0; daysOfWear <= Jeans.WEAR_DAYS_BEFORE_WASH + 1; daysOfWear++) {
            jeans.wearing(daysOfWear);
            if (jeans.washing(daysOfWear)) {
                System.out.println("washing!!!");
                washCount++;
                daysOfWear = 0;
            }
            if (jeans.utilization(washCount)) {
                System.out.println("utilization!");
                break;
            }
        }
    }
}
