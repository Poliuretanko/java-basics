package com.curiositas.java.basics.session2.homework.almikele.part1.vegetable;

public class Tomato implements Vegetable {
    public boolean isCut = false;

    @Override
    public void cut() {
        isCut = true;
    }
}
