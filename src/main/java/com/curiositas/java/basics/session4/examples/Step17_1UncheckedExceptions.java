package com.curiositas.java.basics.session4.examples;

import com.curiositas.java.basics.session4.examples.exceptions.*;

public class Step17_1UncheckedExceptions {

    public static void main(String[] args) {
        caseCorruptedDataError();
        caseIncorrectInputError();
        secondCaseCorruptedDataError();
    }

    public static void caseCorruptedDataError() {
        var personWithCorruptedDateOfBirth = new Person("2000-01-01A");

        try {
            var age = personWithCorruptedDateOfBirth.getAgeInYearsWithoutProperException();
            System.out.println("Age=" + age);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var age = personWithCorruptedDateOfBirth.getAgeInYearsWithProperException();
            System.out.println("Age=" + age);
        } catch (IncorrectDateException e) {
            e.printStackTrace();
        }
    }

    public static void caseIncorrectInputError() {
        try {
            var number = IntegerUtils.parseWithoutCheckingInput("A");
            System.out.println("Number=" + number);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var number = IntegerUtils.parseWithCheckingInput("A");
            System.out.println("Number=" + number);
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    public static void secondCaseCorruptedDataError() {
        try {
            var baby = new AnotherPerson(1);
            System.out.println("Age=" + baby.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var personWithNegativeAge = new AnotherPerson(-1);
            System.out.println("Age=" + personWithNegativeAge.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            var tooOldPerson = new AnotherPerson(200);
            System.out.println("Age=" + tooOldPerson.getAge());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
