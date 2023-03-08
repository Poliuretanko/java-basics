package com.curiositas.java.basics.session7.examples.homework.kosachev;

public class Purchase {

    private final int number;

    public Purchase(int number) {
        this.number = number;
    }

    public void orderProcessing (){
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        String threadName = Thread.currentThread().getName();
        threadName.replace("thread", "cash desks");
        System.out.println(threadName + " complete order #" + number);
    }
}
