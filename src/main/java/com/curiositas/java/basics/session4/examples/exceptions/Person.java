package com.curiositas.java.basics.session4.examples.exceptions;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Person {
    private final String dateOfBirthAsString;

    private int methodWithExceptionsCallCounter = 0;

    public Person(String dateOfBirthAsString) {
        this.dateOfBirthAsString = dateOfBirthAsString;
    }

    public Long getAgeInYearsWithoutProperException() {
        return getAge();
    }

    public Long getAgeInYearsWithProperException() {
        long ageInternal;
        try {
            ageInternal = getAge();
        } catch (Exception e) {
            throw new IncorrectDateException("Person was created with the incorrect date of birth: " + dateOfBirthAsString, e);
        } finally {
            methodWithExceptionsCallCounter++;
        }
        return ageInternal;
    }

    private long getAge() {
        var dateOfBirth = LocalDate.parse(dateOfBirthAsString);
        var now = LocalDate.now();
        var age = ChronoUnit.YEARS.between(dateOfBirth, now);
        return age;
    }
}
