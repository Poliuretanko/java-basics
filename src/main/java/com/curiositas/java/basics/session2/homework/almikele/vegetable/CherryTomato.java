package com.curiositas.java.basics.session2.homework.almikele.vegetable;

public abstract class CherryTomato implements Vegetable {
    public String cut(int tomatoes) {
        return "cut %d tomato".formatted(tomatoes);
    }
}
