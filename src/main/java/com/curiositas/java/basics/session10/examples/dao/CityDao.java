package com.curiositas.java.basics.session10.examples.dao;

import com.curiositas.java.basics.session10.examples.model.City;
import org.springframework.stereotype.Component;

@Component
public class CityDao {

    private final CityRepository cityRepository;

    public CityDao(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public Iterable<City> findAll() {
        return cityRepository.findAll();
    }

    public Iterable<City> findByName(String name) {
        return cityRepository.findByName(name);
    }
}
