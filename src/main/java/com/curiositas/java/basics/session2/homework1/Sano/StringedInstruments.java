package com.curiositas.java.basics.session2.homework1.Sano;

public abstract class StringedInstruments implements Instrument {

    @Override
    public String play() {return name() + "sound with stings";}
}
