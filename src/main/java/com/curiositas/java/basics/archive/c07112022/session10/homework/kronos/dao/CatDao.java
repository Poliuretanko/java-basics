package com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.dao;

import com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.model.Cat;
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
