package com.curiositas.java.basics.session10.examples.dao;

import com.curiositas.java.basics.session10.examples.model.Citizen;
import com.curiositas.java.basics.session10.examples.model.City;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;
import java.util.Date;

public interface CitizenRepository extends PagingAndSortingRepository<Citizen, Long> {

    Page<Citizen> findAllByCity(City city, Pageable pageable);

    Page<Citizen> findAllByCityAndBirthDateLessThan(City city, Date date, Pageable pageable);

    Page<Citizen> findAllByCityOrBirthDateLessThan(City city, Date date, Pageable pageable);

    @Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(nativeQuery = true)
    @Transactional
    void upsert(@Param("id") Long id,
                @Param("name") String name,
                @Param("city_id") Long cityId,
                @Param("birth_date") Date birthDate);
}
