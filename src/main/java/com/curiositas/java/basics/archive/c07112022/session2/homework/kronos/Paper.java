package com.curiositas.java.basics.archive.c07112022.session2.homework.kronos;

public class Paper extends FigureType {

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
