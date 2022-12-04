package com.curiositas.java.basics.additionals;

import java.util.Date;

public class Certificate {
    private String name;
    private String date;
    private String course;

    public Certificate() {
    }

    public Certificate isPresentedTo(String name) {
        this.name = name;
        return this;
    }

    public Certificate hasSuccessfullyPassed(String course) {
        this.course = course;
        return this;
    }

    public Certificate onTheDate(String date) {
        this.date = date;
        return this;
    }

    public Certificate signed(String message) {
        return this;
    }

    public Certificate certificate() {
        return this;
    }

    public Certificate achievement() {
        return this.certificate()
                .isPresentedTo("Artem Sergeev")
                .hasSuccessfullyPassed("Java basics course")
                .onTheDate("27th of November")
                .signed("Denis Gorbatykh");
    }
}
