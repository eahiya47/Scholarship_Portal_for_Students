package com.scholarship.scholarshipportal.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.scholarship.scholarshipportal.entity.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);
}