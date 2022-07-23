package com.curiositas.java.basics.session4.examples;

import com.curiositas.java.basics.session4.examples.exceptions.*;

import java.net.http.HttpConnectTimeoutException;

public class Step17_2CheckedExceptions {

    public static void main(String[] args) {
        caseExternalCallError();
        caseThreadSleep();
        caseSeveralExceptionsHandling();
    }

    public static void caseExternalCallError() {
        var googleClient = new GoogleClient();
        try {
            googleClient.search("A pie");
        } catch (HttpConnectTimeoutException e) {
            e.printStackTrace();
        }
    }

    public static void caseThreadSleep() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void caseSeveralExceptionsHandling() {
        var grumbler = new Grumbler();
        try {
            grumbler.grumble();
        } catch (NotEnoughTimeException e) {
            System.out.println("The grumbler dissatisfied with time: " + e.getMessage());
        } catch (EverythingIsWrongException e) {
            System.out.println("The grumbler dissatisfied with everything: " + e.getMessage());
        }
    }
}
