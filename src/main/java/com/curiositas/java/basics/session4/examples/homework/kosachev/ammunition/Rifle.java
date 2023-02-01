package com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition;

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
