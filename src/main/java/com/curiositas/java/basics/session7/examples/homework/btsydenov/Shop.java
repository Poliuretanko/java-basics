package com.curiositas.java.basics.session7.examples.homework.btsydenov;

import java.util.concurrent.atomic.AtomicInteger;

public class Shop {

    AtomicInteger totalMoneyCollected = new AtomicInteger();

    public Shop() {
        this.totalMoneyCollected.set(0);
    }

    public void addTotalMoneyCollected(int purchaseAmount) {
        this.totalMoneyCollected.addAndGet(purchaseAmount);
    }

    public int getTotalMoneyCollected() {
        return totalMoneyCollected.get();
    }
}
