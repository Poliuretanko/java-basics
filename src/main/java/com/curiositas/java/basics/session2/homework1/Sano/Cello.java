package com.curiositas.java.basics.session2.homework1.Sano;

public class Cello extends StringedInstruments{
    @Override
    public  String play() { return name() + " sounds \"Deep,rich and vibrant\"";}

    @Override
    public String name() {return "Cello";}
}
