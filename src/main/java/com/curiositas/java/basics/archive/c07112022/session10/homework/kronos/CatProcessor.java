package com.curiositas.java.basics.archive.c07112022.session10.homework.kronos;

import com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.dao.CatDao;
import com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.model.Cat;
import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class CatProcessor {

    private final static Faker faker = new Faker();
    private final static Random random = new Random();

    public static void main(String[] args) {
        SpringApplication.run(CatProcessor.class, args);}

    @Bean
    public CommandLineRunner demo(CatDao catDao){
            return (args) -> {
              var cat = generateNewCat();
              var savedCat = catDao.save(cat);
              /*catDao.upsert(savedCat);

               */
              var cats = catDao.findAll();
              System.out.println(cats);
            };
    }

    @NotNull
    private static Cat generateNewCat() {
        var nickname = faker.name().firstName();
        var breed = faker.cat().breed(); //~70 years
        var age = random.nextLong(18);
        Cat cat = new Cat();
        cat.setNickname(nickname);
        cat.setBreed(breed);
        cat.setAge(age);
        return cat;
    }
}
