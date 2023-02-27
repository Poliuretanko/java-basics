package com.curiositas.java.basics.session7.examples.homework.btsydenov;

import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class CashDesk implements Runnable {
    private final AtomicInteger cashDeskAmount = new AtomicInteger(0);
    private final Shop shop;
    private final Queue<Customer> customers;

    private int numCustomersServed;

    public CashDesk(Queue<Customer> customers, Shop shop) {
        this.shop = shop;
        this.numCustomersServed = 0;
        this.customers = customers;
    }

    public void processPurchase(int customerId, int purchaseAmount, Shop shop) throws InterruptedException {
        cashDeskAmount.getAndAdd(purchaseAmount);
        shop.addTotalMoneyCollected(purchaseAmount);
        System.out.println("Cash desk " + Thread.currentThread().getName() + " served customer " + customerId + " with purchase amount $" + purchaseAmount);
        numCustomersServed++;
    }

    public int getCashDeskAmount() {
        return cashDeskAmount.get();
    }
    public int getNumCustomersServed() {
        return numCustomersServed;
    }

    @Override
    public void run() {
        while (!customers.isEmpty()) {
            Customer customer = customers.poll();
            try {
                processPurchase(customer.getId(), customer.getPurchaseAmount(), shop);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
