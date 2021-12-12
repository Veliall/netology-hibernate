package com.example.netologyhibernate.util;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * @author Igor Khristiuk on 12.12.2021
 */
public class Encoder {


    public static void main(String[] args) {
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String asddsa = encoder.encode("asddsa");
        System.out.println(asddsa);
    }
}
