package com.curiositas.java.basics.session2.examples.packages;

public class WifeOfBilly {
    public void forceWifeToCallAllAvailableMethods() {
        new Billy().tellProtected();
        new Billy().tellPublic();
        new Billy().tellPackagePrivate();
    }
}
