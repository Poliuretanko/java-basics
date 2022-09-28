package com.curiositas.java.basics.session7.kronos;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FoodShop {
    static Random inComeCustomers = new Random();
    static int customerWithProducts = inComeCustomers.nextInt(12,281);

    public static void main(String[] args){
        int CASH_DESK_NUMBER = 3;
        ExecutorService executor = Executors.newFixedThreadPool(CASH_DESK_NUMBER);
        System.out.println("Number of customer in store:" + customerWithProducts);
        for (int i=0; i < customerWithProducts; i++) {
            executor.execute(new CashDesk(i));
        }
        executor.shutdown();
    }

}
