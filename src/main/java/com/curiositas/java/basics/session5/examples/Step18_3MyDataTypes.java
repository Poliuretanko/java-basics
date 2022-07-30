package com.curiositas.java.basics.session5.examples;

import com.curiositas.java.basics.session5.examples.datatypes.ImmutablePerson;
import com.curiositas.java.basics.session5.examples.datatypes.MutablePerson;

public class Step18_3MyDataTypes {
    public static void main(String[] args) {

        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.setName("John");
        System.out.println(mutablePerson.getName());
        mutablePerson.setName(null);
        System.out.println(mutablePerson.getName());

        ImmutablePerson immutablePerson = new ImmutablePerson("John");
        System.out.println(immutablePerson.getName());

    }
}
