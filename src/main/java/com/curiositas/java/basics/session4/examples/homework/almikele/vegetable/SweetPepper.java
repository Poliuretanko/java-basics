package com.curiositas.java.basics.session4.examples.homework.almikele.vegetable;

public class SweetPepper implements Vegetable {
    public boolean isCut = false;

    @Override
    public void cut() {
        if (!isCut) {
            this.isCut = true;
        }
    }
}
