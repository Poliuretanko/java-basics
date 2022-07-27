package com.curiositas.java.basics.session2.homework1.Sano;

public class Guitar extends StringedInstruments{
    @Override
    public  String play() { return name() + " sounds \"Lightly,fuzzy and grunty\"";}

    @Override
    public String name() {return "Guitar";}
}