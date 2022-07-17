package com.curiositas.java.basics.session3.examples;

import com.curiositas.java.basics.session3.examples.overriding.*;

import java.util.Arrays;
import java.util.List;

public class Step16OverridingAndOverloading {
    public static void main(String[] args) {
        runOverridingExample();



    }

    private static void runOverridingExample() {
        var parent = new Parent(SocializationLevel.HIGH);
        var worker = new Worker(SocializationLevel.MIDDLE);
        var outsider = new Outsider();

        List<SocialRole> socialRoles = Arrays.asList(parent, worker, outsider);

        socialRoles.forEach(socialRole -> {
            System.out.println(socialRole.act());
            System.out.println(socialRole.getSocializationLevel());
        });
    }
}
