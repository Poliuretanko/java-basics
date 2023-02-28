package com.curiositas.java.basics.session7.examples.homework.btsydenov;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class CashDesksModel {
    public static int NUM_CASHDESKS = 3;
    public static int NUM_CUSTOMERS = 100;

    public static void main(String[] args) throws InterruptedException {
        Queue<Customer> customers = new ConcurrentLinkedQueue<>();
        List<CashDesk> cashDesks = new ArrayList<>();
        Thread[] threads = new Thread[NUM_CASHDESKS];
        Shop shop = new Shop();

        for (int i =0; i < NUM_CUSTOMERS; i++) {
            customers.add(new Customer(i+1));
        }

        // Begin verification.
        // This block is just for verification purposes.
        // In the end I compare totalAmountBroughtByCustomers with shop.getTotalMoneyCollected().
        List<Customer> customersList = customers.stream().toList();
        int totalAmountBroughtByCustomers = 0;
        for (Customer customer : customersList) {
            totalAmountBroughtByCustomers += customer.getPurchaseAmount();
        }
        // End verification.

        for (int i = 0; i < NUM_CASHDESKS; i++){
            cashDesks.add(new CashDesk(customers, shop));
        }

        for (int i = 0; i < NUM_CASHDESKS; i++) {
            threads[i] = new Thread(cashDesks.get(i), "Cash Desk #" + (i+1));
            threads[i].start();
        }

        for (int i = 0; i < NUM_CASHDESKS; i++) {
            threads[i].join();
            System.out.println(threads[i].getName() + " served " + cashDesks.get(i).getNumCustomersServed() + " customers and collected $" + cashDesks.get(i).getCashDeskAmount());
        }

        System.out.println("Shop collected $" + shop.getTotalMoneyCollected());
        System.out.println("Just for verification, totalAmountBroughtByCustomers = $" + totalAmountBroughtByCustomers);
    }
}



