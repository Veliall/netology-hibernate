package com.example.netologyhibernate.api;

import com.example.netologyhibernate.entity.PersonEntity;
import com.example.netologyhibernate.excteption.AppException;
import com.example.netologyhibernate.repository.PersonsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Igor Khristiuk on 10.12.2021
 */

@RestController()
@RequestMapping("/persons")
@RequiredArgsConstructor
public class PersonsController {
    private final PersonsRepo repo;

    @GetMapping("/by-city")
    public List<PersonEntity> getPersonsByCity(@RequestParam String city) {
        return repo.findAllByCityOfLiving(city);
    }

    @GetMapping("/by-age")
    public List<PersonEntity> getPersonsByAge(@RequestParam int age) {
        return repo.findAllByAgeLessThenOrderByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    public List<PersonEntity> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return repo.findAllByNameAndSurname(name, surname).orElseThrow(AppException::new);
    }
}
