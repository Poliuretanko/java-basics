package com.curiositas.java.basics.session10.kronos.dao;

import com.curiositas.java.basics.session10.examples.model.Citizen;
import com.curiositas.java.basics.session10.kronos.model.Cat;
import org.springframework.stereotype.Component;

@Component
public class CatDao {

    private final CatRepository catRepository;

    public CatDao(CatRepository catRepository) {
        this.catRepository = catRepository;
    }

    public Cat save(Cat cat) {
        return catRepository.save(cat);
    }

    public Iterable<Cat> findAll() {
       // Sort sort = Sort.by("nickname");
        return catRepository.findAll();
    }

    /*public void upsert(Cat cat) {
        catRepository.upsert(cat.getId(), cat.getNickname(), cat.getBreed(), cat.getAge());
    }

     */

}
