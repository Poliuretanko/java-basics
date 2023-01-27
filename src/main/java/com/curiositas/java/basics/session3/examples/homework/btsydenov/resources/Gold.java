package com.curiositas.java.basics.session3.examples.homework.btsydenov.resources;

import com.curiositas.java.basics.session3.examples.homework.btsydenov.IllegalGoldAmountException;

public class Gold implements CurrentResource {

    public Integer goldAmount;

    public void setGoldAmount(int goldAmount) throws IllegalGoldAmountException {
        if (goldAmount < 0) {
            throw new IllegalGoldAmountException("Gold amount cannot be less than 0");
        }
        this.goldAmount = goldAmount;
        System.out.println("You currently have " + goldAmount + " Gold.");
    }

    @Override
    public int getCurrentAmount() {
        return goldAmount;
    }
}
