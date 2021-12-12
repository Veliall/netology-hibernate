package com.example.netologyhibernate.repository;

import com.example.netologyhibernate.entity.PersonEntity;
import com.example.netologyhibernate.entity.PersonEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * @author Igor Khristiuk on 10.12.2021
 */

public interface PersonsRepo extends JpaRepository<PersonEntity, PersonEntityPK> {
    List<PersonEntity> findAllByCityOfLiving(String city);

    @Query("SELECT p FROM persons p WHERE p.personEntityPK.age < :age ORDER BY p.personEntityPK.age")
    List<PersonEntity> findAllByAgeLessThenOrderByAge(int age);

    @Query("SELECT p FROM persons p WHERE p.personEntityPK.name = :name AND p.personEntityPK.surname = :surname")
    Optional<List<PersonEntity>> findAllByNameAndSurname(String name, String surname);

    List<PersonEntity> findAll();
}
