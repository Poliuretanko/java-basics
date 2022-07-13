package com.curiositas.java.basics.session2.examples;

import com.curiositas.java.basics.session2.examples.packages.Billy;
import com.curiositas.java.basics.session2.examples.packages.WifeOfBilly;
import com.curiositas.java.basics.session2.examples.packages.neighbourpackage.Neighbour;
import com.curiositas.java.basics.session2.examples.packages.sonpackage.SonOfBilly;

public class Step9Packages {
    public static void main(String[] args) {
        var billy = new Billy();
        System.out.println("What Billy can tell us here?");
        billy.tellPublic();
//        billy.tellPrivate();
//        billy.tellProtected();
//        billy.tellPackagePrivate();

        System.out.println("Let's force billy to tell the other methods");
        billy.forceBillyToCallPrivateMethod();
        billy.forceBillyToCallProtectedMethod();
        billy.forceBillyToCallPackagePrivateMethod();

        System.out.println("What neighbour can call in Billy?");
        new Neighbour().forceNeighbourToCallAllAvailableMethods();

        System.out.println("What son can call in Billy?");
        new SonOfBilly().forceSonToCallAllAvailableMethods();

        System.out.println("What wife can call in Billy?");
        new WifeOfBilly().forceWifeToCallAllAvailableMethods();


    }
}
