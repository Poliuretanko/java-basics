package com.curiositas.java.basics.session9.examples.tasks;

import com.curiositas.java.basics.session9.examples.Person;
import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;

import java.util.Random;

public class ConsumingMemoryWithGarbageCollectionTask extends Task {

    private final Faker faker = new Faker();
    private final Random random = new Random();

    @Override
    public void run() {
        while(true) {
            Person person = createPerson();
            outputPerson(person);
            doSomeJob();
        }
    }

    private void outputPerson(Person person) {
        System.out.println(person);
    }

    @NotNull
    private Person createPerson() {
        var firstName = faker.name().firstName();
        var lastName = faker.name().lastName();
        int height = random.nextInt(150, 220);
        int weight = height - 110 + random.nextInt(20);
        return new Person(firstName, lastName, weight, height);
    }
}
