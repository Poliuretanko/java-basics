package com.curiositas.java.basics.session4.examples.homework.kosachev.ammunition;

public abstract class Gun {

    public Magazine magazine;

    private boolean isMagazineRetrieved;

    public Gun(Magazine magazine) {
        this.magazine = magazine;
    }

    public Magazine retrieveMagazine() {
        isMagazineRetrieved = true;
        return magazine;
    }

}
