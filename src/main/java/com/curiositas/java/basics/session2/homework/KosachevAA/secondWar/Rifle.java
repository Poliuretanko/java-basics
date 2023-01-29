package com.curiositas.java.basics.session2.homework.KosachevAA.secondWar;

public class Rifle {

    private boolean isMagazineRetrieved;

    private Magazine magazine;

    public Rifle(Magazine magazine) {
        //this.numberOfBulletsInMagazine = numberOfBulletsInMagazine;
        this.magazine = magazine;
    }

    public Magazine retrieveMagazine() {
        isMagazineRetrieved = true;
        return magazine;
    }

    public void putMagazine() {
        isMagazineRetrieved = false;
    }

    public boolean getMagazineRetrieved() {
        return isMagazineRetrieved;
    }

    public int getNumberOfBulletsInMagazine() {
        return magazine.getNumberOfBullets();
    }

    public boolean isMagazineCharged() {
        return magazine.isMagazineCharged();
        //return magazine.getNumberOfBullets();
    }


}
