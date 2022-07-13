package com.curiositas.java.basics.session2.examples.packages.sonpackage;

import com.curiositas.java.basics.session2.examples.packages.Billy;

public class SonOfBilly extends Billy {
    public void forceSonToCallAllAvailableMethods() {
        tellProtected();
        tellPublic();
    }
}
