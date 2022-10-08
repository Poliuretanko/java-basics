package com.curiositas.java.basics.session8.examples.references;

import java.lang.ref.WeakReference;

public class MyObject {
    private final String value;

    public MyObject(String value) {
        this.value = value;
    }

    public static WeakReference<MyObject> createReference(String value) {
        var myObject = new MyObject(value);
        return new WeakReference<>(myObject);
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }
}
