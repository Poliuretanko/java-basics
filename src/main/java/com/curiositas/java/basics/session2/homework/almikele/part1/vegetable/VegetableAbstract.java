package com.curiositas.java.basics.session2.homework.almikele.part1.vegetable;

public abstract class VegetableAbstract implements Vegetable {
    @Override
    public String add(String ingredientName) {
        return "add " + ingredientName;
    }
}
