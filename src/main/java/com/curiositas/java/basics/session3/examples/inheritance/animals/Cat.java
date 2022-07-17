package com.curiositas.java.basics.session3.examples.inheritance.animals;

public class Cat extends CatFamily {
    @Override
    public String sound() {
        return "Meow";
    }

    @Override
    public String getName() {
        return "Cat";
    }
}
