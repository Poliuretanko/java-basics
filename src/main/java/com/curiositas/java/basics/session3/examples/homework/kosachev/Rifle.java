package com.curiositas.java.basics.session3.examples.homework.kosachev;


public class Rifle {

    private boolean isMagazineRetrieved;

    private Magazine magazine;

    public Rifle(Magazine magazine) {
        this.magazine = magazine;
    }

    public Magazine retrieveMagazine() {
        isMagazineRetrieved = true;
        return magazine;
    }


}
