package com.curiositas.java.basics.session10.examples;

import com.curiositas.java.basics.session10.examples.dao.CitizenDao;
import com.curiositas.java.basics.session10.examples.dao.CityDao;
import com.curiositas.java.basics.session10.examples.model.Citizen;
import com.github.javafaker.Faker;
import org.jetbrains.annotations.NotNull;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;


@SpringBootApplication
public class Step39_JPA {
    private final static SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    private final static Faker faker = new Faker();

    public static void main(String[] args) {
        SpringApplication.run(Step39_JPA.class, args);
    }

    @SuppressWarnings("unused")
    @Bean
    public CommandLineRunner demo(CitizenDao citizenDao, CityDao cityDao) {
        return (args) -> {
            var citizens = citizenDao.findAll();


            var cities = cityDao.findAll();


            var deliCities = cityDao.findByName("Deli");
            var deli = deliCities.iterator().next();


            var deliCitizensPage1 = citizenDao.findByCity(deli, 2, 0);
            var deliCitizensPage2 = citizenDao.findByCity(deli, 2, 1);
            var deliCitizensPage3 = citizenDao.findByCity(deli, 2, 2);
            var deliCitizensPage4 = citizenDao.findByCity(deli, 2, 3);


            var deliCitizensBigPage = citizenDao.findByCity(deli, 10, 0);


            var date = formatter.parse("01.01.2000");
            var oldCitizensInDeli = citizenDao.findByCityAndOlderThan(deli, date, 10, 0);
            var oldCitizensAndDeliCitizens = citizenDao.findByCityOrOlderThan(deli, date, 10, 0);

            var citizen = generateNewLondonCitizen(cityDao);
            var savedCitizen = citizenDao.save(citizen);
            savedCitizen.setName(faker.name().firstName());
            citizenDao.upsert(savedCitizen);
            citizenDao.delete(savedCitizen);

        };
    }

    @NotNull
    private static Citizen generateNewLondonCitizen(CityDao cityDao) {
        var name = faker.name().firstName();
        var birthDate = faker.date().past(25550, TimeUnit.DAYS); //~70 years
        var londonCities = cityDao.findByName("London");
        var london = londonCities.iterator().next();
        Citizen citizen = new Citizen();
        citizen.setName(name);
        citizen.setCity(london);
        citizen.setBirthDate(birthDate);
        return citizen;
    }
}
