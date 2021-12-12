package com.example.netologyhibernate.api;

import com.example.netologyhibernate.UserService;
import com.example.netologyhibernate.entity.PersonEntity;
import com.example.netologyhibernate.entity.User;
import com.example.netologyhibernate.excteption.AppException;
import com.example.netologyhibernate.repository.PersonsRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Igor Khristiuk on 10.12.2021
 */

@RestController()
@RequestMapping("/")
@RequiredArgsConstructor
public class PersonsController {
    private final PersonsRepo repo;
    private final UserService userService;

    @GetMapping("persons/by-city")
    public List<PersonEntity> getPersonsByCity(@RequestParam String city) {
        return repo.findAllByCityOfLiving(city);
    }

    @GetMapping("persons/by-age")
    public List<PersonEntity> getPersonsByAge(@RequestParam int age) {
        return repo.findAllByAgeLessThenOrderByAge(age);
    }

    @GetMapping("persons/by-name-and-surname")
    public List<PersonEntity> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return repo.findAllByNameAndSurname(name, surname).orElseThrow(AppException::new);
    }

    @GetMapping("persons")
    public List<PersonEntity> getAll() {
        return repo.findAll();
    }

    @PostMapping("registration")
    public ResponseEntity addUser(@RequestBody User user) {
        userService.saveUser(user);

        return ResponseEntity.ok().build();
    }

}
