package com.curiositas.java.basics.session7.examples.homework.btsydenov;

import java.util.Random;

public class Customer {
    private final int id;
    private final int purchaseAmount;

    public Customer(int id) {
        this.id = id;
        this.purchaseAmount = genRandomPurchaseAmount();
    }

    public int getId() {
        return id;
    }

    public int getPurchaseAmount() {
        return purchaseAmount;
    }

    private int genRandomPurchaseAmount() {
        Random random = new Random();
        return random.nextInt(100) + 1;
    }
}
