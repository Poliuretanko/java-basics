package com.curiositas.java.basics.archive.c07112022.session2.homework.kronos;

public abstract class FigureType implements Name, Characteristics {

    @Override
    public String name() {return "Figure";}

    @Override
    public String strongness() {
        return name() + "is stronger";
    }

    public boolean isWinner(boolean result){
        return result;
    }
}
