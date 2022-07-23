package com.curiositas.java.basics.session4.examples.exceptions;

public class AnotherPerson {
    private final int age;

    private final static int minimalAllowedAge = 0;
    private final static int maximalAllowedAge = 150;

    public AnotherPerson(int age) {
        if (age < minimalAllowedAge) {
            throw new IllegalArgumentException("Age can't be less than " + minimalAllowedAge);
        }
        if (age > maximalAllowedAge) {
            throw new IllegalArgumentException("Age can't be grater than " + maximalAllowedAge);

        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
