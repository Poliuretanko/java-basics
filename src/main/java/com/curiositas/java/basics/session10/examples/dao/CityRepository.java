package com.curiositas.java.basics.session10.examples.dao;


import com.curiositas.java.basics.session10.examples.model.City;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CityRepository extends CrudRepository<City, Long> {

    List<City> findByName(String name);
}