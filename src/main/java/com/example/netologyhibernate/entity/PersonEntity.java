package com.example.netologyhibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

/**
 * @author Igor Khristiuk on 10.12.2021
 */
//
//Название таблицы - PERSONS
//        содержит в себе 5 столбцов - name, surname, age, phone_number, city_of_living
//        первичным ключом будет сочетание name, surname, age

@Entity(name = "persons")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntity {
    @EmbeddedId
    PersonEntityPK personEntityPK;

    private String phoneNumber;
    private String cityOfLiving;

}
