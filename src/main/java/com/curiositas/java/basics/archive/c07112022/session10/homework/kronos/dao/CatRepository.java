package com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.dao;

import java.util.List;
import com.curiositas.java.basics.archive.c07112022.session10.homework.kronos.model.Cat;
import org.springframework.data.repository.PagingAndSortingRepository;

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
