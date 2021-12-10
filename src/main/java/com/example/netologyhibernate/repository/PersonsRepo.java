package com.example.netologyhibernate.repository;

import com.example.netologyhibernate.entity.PersonEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

/**
 * @author Igor Khristiuk on 10.12.2021
 */

@Repository
@RequiredArgsConstructor
public class PersonsRepo {
    private final EntityManager entityManager;

    public List<PersonEntity> getPersonsByCity(String city) {
        return entityManager.createQuery("SELECT p FROM persons p WHERE p.city_of_living = :city", PersonEntity.class)
                .setParameter("city", city)
                .getResultList();
    }
}
