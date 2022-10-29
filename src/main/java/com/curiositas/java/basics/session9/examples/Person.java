package com.curiositas.java.basics.session9.examples;

public class Person {
    private final String firstName;
    private final String lastName;
    private final int weight;
    private final int height;

    public Person(String firstName, String lastName, int weight, int height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }
}
