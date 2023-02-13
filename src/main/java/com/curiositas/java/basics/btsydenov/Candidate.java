package com.curiositas.java.basics.btsydenov;

public class Candidate {

    private final String name;
    private int currentAmountOfVotes = 0;
    private float percentage = 0;

    public Candidate(String name) {
        this.name = name;
    }

    public void addVote() {
        currentAmountOfVotes++;
    }

    public int getCurrentAmountOfVotes() {
        return currentAmountOfVotes;
    }

    public String getName() {
        return name;
    }

    public void setPercentageOfVotes(float percentage) {
        this.percentage = percentage;
    }

    public float getPercentage() {
        return percentage;
    }

}
