package com.curiositas.java.basics.archive.c07112022.session2.homework.Sano;

public class Guitar extends StringedInstruments{
    @Override
    public  String play() { return name() + " sounds \"Lightly,fuzzy and grunty\"";}

    @Override
    public String name() {return "Guitar";}
}