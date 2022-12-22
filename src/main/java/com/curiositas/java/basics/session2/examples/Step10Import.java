package com.curiositas.java.basics.session2.examples;



import com.curiositas.java.basics.session2.examples.imports.Date;

import static java.lang.Math.abs;
import static java.lang.System.out;

public class Step10Import {
    public static void main(String[] args) {

        var date = new Date();
        output(date);

        var anotherDate = new java.util.Date();
        output(anotherDate);

        output(abs(-1));
    }

    private static void output(Object message) {
        out.println(message);
    }
}
