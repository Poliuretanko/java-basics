package com.curiositas.java.basics.session10.examples.model;

import javax.persistence.*;
import java.util.List;

@SuppressWarnings("unused")
@Entity
public class City {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "city", fetch = FetchType.EAGER)
    private List<Citizen> loadedCitizens;

    @OneToMany(mappedBy = "city", fetch = FetchType.LAZY)
    private List<Citizen> lazyLoadedCitizens;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Citizen> getLoadedCitizens() {
        return loadedCitizens;
    }

    public void setLoadedCitizens(List<Citizen> loadedCitizens) {
        this.loadedCitizens = loadedCitizens;
    }

    public List<Citizen> getLazyLoadedCitizens() {
        return lazyLoadedCitizens;
    }

    public void setLazyLoadedCitizens(List<Citizen> lazyLoadedCitizens) {
        this.lazyLoadedCitizens = lazyLoadedCitizens;
    }

    @Override
    public String toString() {
        return id + " " + name;
    }
}
