package com.curiositas.java.basics.session2.homework.KosachevAA.rifleMagazine;

public abstract class AmmoPackage implements Magazine{

    @Override
    public String openPackage() {
        return "Open package ammo to get bullets";
    }

    @Override
    public String chargedMagazine() {
        return "Insert magazine into rifle";
    }
}
