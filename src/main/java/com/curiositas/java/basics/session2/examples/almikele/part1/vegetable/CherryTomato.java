package com.curiositas.java.basics.session2.examples.almikele.part1.vegetable;

public abstract class CherryTomato implements Vegetable {
    public String cut(int tomatoes) {
        return "cut %d tomato".formatted(tomatoes);
    }
}
