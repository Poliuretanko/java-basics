package com.curiositas.java.basics.session10.kronos.dao;

import java.util.List;
import com.curiositas.java.basics.session10.kronos.model.Cat;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import javax.transaction.Transactional;

public interface CatRepository extends PagingAndSortingRepository<Cat, Long> {

    List<Cat> findByNickname(String nickname);
    Cat findById(long id);
    Cat findByBreedAndAge(String breed,Long age);

    /*@Modifying(clearAutomatically = true, flushAutomatically = true)
    @Query(nativeQuery = true)
    @Transactional
    void upsert(@Param("id") Long id,
                @Param("nickname") String nickName,
                @Param("breed") String breed,
                @Param("age") Long age);

     */
}
