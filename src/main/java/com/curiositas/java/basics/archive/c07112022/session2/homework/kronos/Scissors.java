package com.curiositas.java.basics.archive.c07112022.session2.homework.kronos;

public class Scissors extends FigureType {
    @Override
    public String name() {return "Scissors";}
    @Override
    public String strongness() {
        return name() + " is stronger!!";
    }
    @Override
    public boolean isWinner(boolean result){
        return result;
    }
}
