package com.curiositas.java.basics.session3.examples.homework.almikele;

public class Jeans implements Clothes {
    private static final int PRICE = 300;
    public static final int WASHES_BEFORE_UTILIZE = 40;
    public static final int WEAR_DAYS_BEFORE_WASH = 7;

    @Override
    public int buying(int money) {
        if (money >= PRICE) {
            System.out.println("You have new jeans!");
            return money - PRICE;
        } else {
            throw new RuntimeException("Sorry, you have no enough money");
        }
    }

    @Override
    public void wearing(int wearDays) {
        System.out.printf("wearing %d days%n", wearDays);
    }

    @Override
    public boolean washing(int wearDays) {
        return isTimeTo(wearDays, WEAR_DAYS_BEFORE_WASH, "wash", "wear");
    }

    @Override
    public boolean utilization(int washCount) {
        return isTimeTo(washCount, WASHES_BEFORE_UTILIZE, "utilize", "wash");
    }

    private static boolean isTimeTo(int count, int maxValue, String toDo, String stillCan) {
        if (count > maxValue) {
            System.out.printf("Time to %s!%n", toDo);
            return true;
        } else {
            System.out.printf("You can %s it %%d time(s)%%n".formatted(stillCan), maxValue - count);
            return false;
        }
    }
}
