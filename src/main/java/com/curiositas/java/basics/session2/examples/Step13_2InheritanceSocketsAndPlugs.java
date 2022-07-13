package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.inheritance.sockets.AmericanElectricSocket;
import com.curiositas.java.basics.session2.examples.inheritance.sockets.AmericanPlug;
import com.curiositas.java.basics.session2.examples.inheritance.sockets.EuropeanElectricSocket;
import com.curiositas.java.basics.session2.examples.inheritance.sockets.EuropeanPlug;

public class Step13_2InheritanceSocketsAndPlugs {
    public static void main(String[] args) throws Exception {
        var americanPlug = new AmericanPlug();
        var europeanPlug = new EuropeanPlug();
        var americanElectricSocket = new AmericanElectricSocket();
        var europeanElectricSocket = new EuropeanElectricSocket();

        americanElectricSocket.connect(americanPlug);
        europeanElectricSocket.connect(europeanPlug);

        americanElectricSocket.connect(europeanPlug);
    }
}
