package com.curiositas.java.basics.session7.examples.homework.kosachev;

import java.util.ArrayList;
import java.util.Collection;

public class CashDesksHandling {

    public static void main(String[] args) throws InterruptedException {

        var numberOfPurchases = 100;
        var numberOfCashDesks = 3;

        var arrayPurchase = new ArrayPurchase(numberOfPurchases);

        for (int i = 0; i < numberOfPurchases; i++) {
            var purchase = new Purchase(i);
            arrayPurchase.addOrderProcessing(purchase);
        }

        OrderProcessingExecutor orderProcessingExecutor = new OrderProcessingExecutor(arrayPurchase);

        Collection<Thread> threads = new ArrayList<>();
        for (int i = 0; i < numberOfCashDesks; i++) {
            threads.add(new Thread(orderProcessingExecutor));
        }
        threads.parallelStream().forEach(Thread::start);

//        while (arrayPurchase.hasOrderProcessing()) {
//            Thread.sleep(100);
//        }
        while (threads.stream().anyMatch(Thread::isAlive)){
            Thread.sleep(100);
        }


        System.out.println(orderProcessingExecutor.getOrderProcessingExecutorTaskCounter() + " purchase executed");


    }



   // public void run() throws InterruptedException {}


}
