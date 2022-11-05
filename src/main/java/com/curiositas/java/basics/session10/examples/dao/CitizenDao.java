package com.curiositas.java.basics.session10.examples.dao;

import com.curiositas.java.basics.session10.examples.model.Citizen;
import com.curiositas.java.basics.session10.examples.model.City;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class CitizenDao {

    private final CitizenRepository citizenRepository;

    public CitizenDao(CitizenRepository citizenRepository) {
        this.citizenRepository = citizenRepository;
    }

    public List<Citizen> findByCity(City city, Integer pageSize, Integer pageNumber) {
        Sort sort = Sort.by("birthDate");
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, sort);
        var page = citizenRepository.findAllByCity(city, pageRequest);
        return page.getContent();
    }

    public Iterable<Citizen> findAll() {
        Sort sort = Sort.by("birthDate");
        return citizenRepository.findAll(sort);
    }

    public List<Citizen> findByCityAndOlderThan(City city, Date date, Integer pageSize, Integer pageNumber) {
        Sort sort = Sort.by("birthDate");
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, sort);
        var page = citizenRepository.findAllByCityAndBirthDateLessThan(city, date, pageRequest);
        return page.getContent();
    }

    public List<Citizen> findByCityOrOlderThan(City city, Date date, Integer pageSize, Integer pageNumber) {
        Sort sort = Sort.by("birthDate");
        PageRequest pageRequest = PageRequest.of(pageNumber, pageSize, sort);
        var page = citizenRepository.findAllByCityOrBirthDateLessThan(city, date, pageRequest);
        return page.getContent();
    }

    public void upsert(Citizen citizen) {
        citizenRepository.upsert(citizen.getId(), citizen.getName(), citizen.getCity().getId(), citizen.getBirthDate());
    }

    public Citizen save(Citizen citizen) {
        return citizenRepository.save(citizen);
    }

    public void delete(Citizen citizen) {
        citizenRepository.delete(citizen);
    }
}
