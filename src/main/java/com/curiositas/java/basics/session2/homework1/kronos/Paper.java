package com.curiositas.java.basics.session2.homework1.kronos;

public class Paper extends FigureType{

    @Override
    public String name() {return "Paper";}

    @Override
    public String strongness() {
        return name() + " is stronger!!";
    }

    @Override
    public boolean isWinner(boolean result){
        return result;
    }
}
