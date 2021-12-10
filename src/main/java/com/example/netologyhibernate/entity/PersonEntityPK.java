package com.example.netologyhibernate.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * @author Igor Khristiuk on 10.12.2021
 */
@Embeddable
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class PersonEntityPK implements Serializable {
    private String name;
    private String surname;
    private int age;
}
