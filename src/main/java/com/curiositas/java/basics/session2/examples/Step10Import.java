package com.curiositas.java.basics.session2.examples;


import com.curiositas.java.basics.session2.examples.imports.Date;

public class Step10Import {
    public static void main(String[] args) {

        var date = new Date();
        System.out.println(date);

        var anotherDate = new java.util.Date();
        System.out.println(anotherDate);

        System.out.println(Math.abs(-1));
    }
}
