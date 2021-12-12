package com.example.netologyhibernate.repository;

import com.example.netologyhibernate.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Igor Khristiuk on 12.12.2021
 */
public interface RolesRepo extends JpaRepository<Role, Long> {
}
