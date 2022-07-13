package com.curiositas.java.basics.session2.examples.packages.neighbourpackage;

import com.curiositas.java.basics.session2.examples.packages.Billy;

public class Neighbour {
    public void forceNeighbourToCallAllAvailableMethods() {
        new Billy().tellPublic();
    }
}
