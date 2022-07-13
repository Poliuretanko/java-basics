package com.curiositas.java.basics.session2.homework1.kronos;

public class Stone extends FigureType {
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
