package com.curiositas.java.basics.session3.examples.homework.btsydenov.resources;

public class Gold implements CurrentResource {

    public Integer goldAmount;

    public void setGoldAmount(int goldAmount) {
        this.goldAmount = goldAmount;
        System.out.println("You currently have " + goldAmount + " Gold.");
    }

    @Override
    public int getCurrentAmount() {
        return goldAmount;
    }
}
